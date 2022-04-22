package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class SlotsItem{

	@SerializedName("rank")
	private int rank;

	public int getRank(){
		return rank;
	}

	@Override
 	public String toString(){
		return 
			"SlotsItem{" + 
			"rank = '" + rank + '\'' + 
			"}";
		}
}