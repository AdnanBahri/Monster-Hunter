package com.example.net.movies.flex.school.movies.app.mvp.firebase.monster.hunter.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Item{

	@SerializedName("resistances")
	private Resistances resistances;

	@SerializedName("armorSet")
	private ArmorSet armorSet;

	@SerializedName("type")
	private String type;

	@SerializedName("skills")
	private List<SkillsItem> skills;

	@SerializedName("slots")
	private List<SlotsItem> slots;

	@SerializedName("assets")
	private Assets assets;

	@SerializedName("defense")
	private Defense defense;

	@SerializedName("crafting")
	private Crafting crafting;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private String rank;

	@SerializedName("attributes")
	private Attributes attributes;

	@SerializedName("id")
	private int id;

	@SerializedName("rarity")
	private int rarity;

	@SerializedName("description")
	private String description;

	@SerializedName("carryLimit")
	private int carryLimit;

	@SerializedName("value")
	private int value;

	public Resistances getResistances(){
		return resistances;
	}

	public ArmorSet getArmorSet(){
		return armorSet;
	}

	public String getType(){
		return type;
	}

	public List<SkillsItem> getSkills(){
		return skills;
	}

	public List<SlotsItem> getSlots(){
		return slots;
	}

	public Assets getAssets(){
		return assets;
	}

	public Defense getDefense(){
		return defense;
	}

	public Crafting getCrafting(){
		return crafting;
	}

	public String getName(){
		return name;
	}

	public String getRank(){
		return rank;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public int getId(){
		return id;
	}

	public int getRarity(){
		return rarity;
	}

	public String getDescription(){
		return description;
	}

	public int getCarryLimit(){
		return carryLimit;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Item{" + 
			"resistances = '" + resistances + '\'' + 
			",armorSet = '" + armorSet + '\'' + 
			",type = '" + type + '\'' + 
			",skills = '" + skills + '\'' + 
			",slots = '" + slots + '\'' + 
			",assets = '" + assets + '\'' + 
			",defense = '" + defense + '\'' + 
			",crafting = '" + crafting + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",id = '" + id + '\'' + 
			",rarity = '" + rarity + '\'' + 
			",description = '" + description + '\'' + 
			",carryLimit = '" + carryLimit + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}