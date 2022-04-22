package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.databinding.FragmentFirstBinding;
import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.viewmodels.FirstFragmentViewModel;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private FirstFragmentViewModel viewModel;
    private Adapter adapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(FirstFragmentViewModel.class);
        viewModel.getItems().observe(getViewLifecycleOwner(), items -> {
            if (items != null) {
                adapter.setItems(items);
            }
        });
        updateUi();
    }

    private void updateUi() {
        adapter = new Adapter();
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}