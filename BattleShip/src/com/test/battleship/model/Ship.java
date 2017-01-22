package com.test.battleship.model;

public class Ship {
	private int id;
	private int type;
	private int hitRequiredToDestroy;
	private Player shipOwner;
	int breadth;
	int length;
	
	public Ship(){
		
	}
	
	
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Player getShipOwner() {
		return shipOwner;
	}
	public void setShipOwner(Player shipOwner) {
		this.shipOwner = shipOwner;
	}
	public int getId() {
		return id;
	}
	public int getType() {
		return type;
	}
	public int getHitRequiredToDestroy() {
		return hitRequiredToDestroy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setHitRequiredToDestroy(int hitRequiredToDestroy) {
		this.hitRequiredToDestroy = hitRequiredToDestroy;
	}
	
	
}
