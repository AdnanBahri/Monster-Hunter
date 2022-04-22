package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class Defense{

	@SerializedName("max")
	private int max;

	@SerializedName("augmented")
	private int augmented;

	@SerializedName("base")
	private int base;

	public int getMax(){
		return max;
	}

	public int getAugmented(){
		return augmented;
	}

	public int getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"Defense{" + 
			"max = '" + max + '\'' + 
			",augmented = '" + augmented + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}