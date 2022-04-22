package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ArmorSet{

	@SerializedName("pieces")
	private List<Integer> pieces;

	@SerializedName("bonus")
	private Object bonus;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private String rank;

	@SerializedName("id")
	private int id;

	public List<Integer> getPieces(){
		return pieces;
	}

	public Object getBonus(){
		return bonus;
	}

	public String getName(){
		return name;
	}

	public String getRank(){
		return rank;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ArmorSet{" + 
			"pieces = '" + pieces + '\'' + 
			",bonus = '" + bonus + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}