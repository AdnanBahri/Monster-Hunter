package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.repositries;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;

import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models.Item;
import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.network.Api;
import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.network.RetrofitClient;

import java.util.List;

import io.reactivex.rxjava3.schedulers.Schedulers;

public class Repository {

    private Api api;

    public Repository() {
        api = RetrofitClient.getInstance().create(Api.class);
    }

    public LiveData<List<Item>> getItems() {
        return LiveDataReactiveStreams.fromPublisher(api.getItems().subscribeOn(Schedulers.io()));
    }
}
