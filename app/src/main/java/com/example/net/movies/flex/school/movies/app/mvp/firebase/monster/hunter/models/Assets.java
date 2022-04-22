package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class Assets{

	@SerializedName("imageFemale")
	private String imageFemale;

	@SerializedName("imageMale")
	private String imageMale;

	public String getImageFemale(){
		return imageFemale;
	}

	public String getImageMale(){
		return imageMale;
	}

	@Override
 	public String toString(){
		return 
			"Assets{" + 
			"imageFemale = '" + imageFemale + '\'' + 
			",imageMale = '" + imageMale + '\'' + 
			"}";
		}
}