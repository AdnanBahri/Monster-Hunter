package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Crafting{

	@SerializedName("materials")
	private List<MaterialsItem> materials;

	public List<MaterialsItem> getMaterials(){
		return materials;
	}

	@Override
 	public String toString(){
		return 
			"Crafting{" + 
			"materials = '" + materials + '\'' + 
			"}";
		}
}