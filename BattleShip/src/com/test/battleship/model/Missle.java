package com.test.battleship.model;

public class Missle {
	private int id;
	private int type;
	private Point firePoint;
	private Point [] damageCells ;
	
	public int getId() {
		return id;
	}
	public int getType() {
		return type;
	}
	public Point getFirePoint() {
		return firePoint;
	}
	public Point[] getDamageCells() {
		return damageCells;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setFirePoint(Point firePoint) {
		this.firePoint = firePoint;
	}
	public void setDamageCells(Point[] damageCells) {
		this.damageCells = damageCells;
	}
	
	
}
