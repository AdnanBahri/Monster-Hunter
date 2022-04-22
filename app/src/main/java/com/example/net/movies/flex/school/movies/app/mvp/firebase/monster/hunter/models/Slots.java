package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Slots{

	@SerializedName("slots")
	private List<SlotsItem> slots;

	public List<SlotsItem> getSlots(){
		return slots;
	}

	@Override
 	public String toString(){
		return 
			"Slots{" + 
			"slots = '" + slots + '\'' + 
			"}";
		}
}