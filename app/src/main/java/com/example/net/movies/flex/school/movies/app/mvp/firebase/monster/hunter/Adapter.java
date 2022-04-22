package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.databinding.ItemLayoutBinding;
import com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models.Item;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Item> items;

    public Adapter() {
        items = new ArrayList<>();
    }

    public void setItems(List<Item> items) {
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setupUI(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLayoutBinding binding;

        public ViewHolder(@NonNull ItemLayoutBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void setupUI(Item item) {
//            binding.avatar.setImageResource(binding.getRoot().getContext().getResources().getDrawable(R.drawable.ic_chest));

            switch (item.getType()){
                case "chest":
                    binding.avatar.setImageResource(R.drawable.ic_chest);
                    break;
                case "deco":
                    binding.avatar.setImageResource(R.drawable.ic_deco);
                    break;
                case "gloves":
                    binding.avatar.setImageResource(R.drawable.ic_gloves);
                    break;
                case "head":
                    binding.avatar.setImageResource(R.drawable.ic_head);
                    break;
                case "legs":
                    binding.avatar.setImageResource(R.drawable.ic_legs);
                    break;
                case "shield":
                    binding.avatar.setImageResource(R.drawable.ic_shield);
                    break;
                case "waist":
                    binding.avatar.setImageResource(R.drawable.ic_waist);
                    break;
            }
            binding.name.setText(item.getName());
            binding.rank.setText(String.valueOf(item.getRank()));
            binding.defence.setText(String.valueOf(item.getDefense().getMax()));
            Log.d("Item","Name : "+item.getName()+" , Rank : "+item.getRank()+" , Type "+ item.getType()+" , Defence "+ item.getDefense().getBase());
        }
    }
}
