package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class MaterialsItem{

	@SerializedName("item")
	private Item item;

	@SerializedName("quantity")
	private int quantity;

	public Item getItem(){
		return item;
	}

	public int getQuantity(){
		return quantity;
	}

	@Override
 	public String toString(){
		return 
			"MaterialsItem{" + 
			"item = '" + item + '\'' + 
			",quantity = '" + quantity + '\'' + 
			"}";
		}
}