package com.test.battleship.model;

import java.util.List;

import com.test.battleship.event.CeaseFireEvent;
import com.test.battleship.event.Event;
import com.test.battleship.event.EventDispatcher;
import com.test.battleship.event.EventHandler;
import com.test.battleship.event.MissileFireEvent;
import com.test.battleship.event.MissleHitEvent;

public class Player {
	private int playerId;
	private String name;
	private List<Ship> ships;
	private List<Missle> targets;
	private int currentAmmo = 0;
	public Player(String name, int id) {
		this.playerId = id;
		this.name = name;
	}


	public Player() {
		this(null,0);
	}
	
	
	public void fire(){
		if(targets!=null && currentAmmo < targets.size()){
			
			MissileFireEvent missileFire = createMissileFireEvent(this,targets.get(currentAmmo++));
			EventDispatcher.INSTANCE.dispatchEvent(missileFire);
		}
	}

	private MissileFireEvent createMissileFireEvent(Player player, Missle missle) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Missle> getTargets() {
		return targets;
	}

	public void setTargets(List<Missle> targets) {
		this.targets = targets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}

}
