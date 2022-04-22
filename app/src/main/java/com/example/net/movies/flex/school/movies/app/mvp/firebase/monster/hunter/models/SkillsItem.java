package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import com.google.gson.annotations.SerializedName;

public class SkillsItem{

	@SerializedName("skillName")
	private String skillName;

	@SerializedName("level")
	private int level;

	@SerializedName("skill")
	private int skill;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("modifiers")
	private Modifiers modifiers;

	public String getSkillName(){
		return skillName;
	}

	public int getLevel(){
		return level;
	}

	public int getSkill(){
		return skill;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Modifiers getModifiers(){
		return modifiers;
	}

	@Override
 	public String toString(){
		return 
			"SkillsItem{" + 
			"skillName = '" + skillName + '\'' + 
			",level = '" + level + '\'' + 
			",skill = '" + skill + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",modifiers = '" + modifiers + '\'' + 
			"}";
		}
}