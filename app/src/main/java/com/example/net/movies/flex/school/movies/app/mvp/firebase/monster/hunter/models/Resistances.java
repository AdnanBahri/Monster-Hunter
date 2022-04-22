package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class Resistances{

	@SerializedName("fire")
	private int fire;

	@SerializedName("ice")
	private int ice;

	@SerializedName("thunder")
	private int thunder;

	@SerializedName("dragon")
	private int dragon;

	@SerializedName("water")
	private int water;

	public int getFire(){
		return fire;
	}

	public int getIce(){
		return ice;
	}

	public int getThunder(){
		return thunder;
	}

	public int getDragon(){
		return dragon;
	}

	public int getWater(){
		return water;
	}

	@Override
 	public String toString(){
		return 
			"Resistances{" + 
			"fire = '" + fire + '\'' + 
			",ice = '" + ice + '\'' + 
			",thunder = '" + thunder + '\'' + 
			",dragon = '" + dragon + '\'' + 
			",water = '" + water + '\'' + 
			"}";
		}
}