package com.test.battleship.model;

public enum ShipType {
	P("P",1),Q("Q",2);
	private String type;
	private Integer hitTolerency;
	private ShipType(String type,Integer hitTolerency){
		this.type = type;
		this.hitTolerency = hitTolerency;
	}
	public String getType() {
		return type;
	}
	public Integer getHitTolerency() {
		return hitTolerency;
	}
}
