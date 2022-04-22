package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.network;

import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models.Item;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.http.GET;

public interface Api {

    @GET("armor")
    Flowable<List<Item>> getItems();
}
