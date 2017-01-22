package com.test.battleship.model;

public class BattleZone {
	// null to represent the water area
	private Ship[][] battleArea;
	private int hitsRequired;
	
	private int breadth;
	private int length;
	
	public BattleZone(int breadth,int length) {
		this.breadth = breadth ;
		this.length = length;
		battleArea = new Ship[this.breadth][this.length];
	}

	public void putShip(Ship ship, Point[] points) {
		// put the ships on coverged points
		hitsRequired += ship.getHitRequiredToDestroy();
	}

	public Ship[][] getBattleArea() {
		return battleArea;
	}

	public int getHitsRequired() {
		return hitsRequired;
	}

	public void setBattleArea(Ship[][] battleArea) {
		this.battleArea = battleArea;
	}

	public void setHitsRequired(int hitsRequired) {
		this.hitsRequired = hitsRequired;
	}

	
}
