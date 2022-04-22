package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models.Item;
import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.repositries.Repository;

import java.util.List;

public class FirstFragmentViewModel extends ViewModel {
    private Repository repo;

    public FirstFragmentViewModel() {
        repo = new Repository();
    }

    public LiveData<List<Item>> getItems() {
        return repo.getItems();
    }
}
