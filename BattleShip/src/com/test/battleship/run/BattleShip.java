package com.test.battleship.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test.battleship.event.CeaseFireEvent;
import com.test.battleship.event.Event;
import com.test.battleship.event.EventDispatcher;
import com.test.battleship.event.EventHandler;
import com.test.battleship.event.MissileFireEvent;
import com.test.battleship.event.MissleHitEvent;
import com.test.battleship.model.BattleZone;
import com.test.battleship.model.Missle;
import com.test.battleship.model.Player;
import com.test.battleship.model.Point;
import com.test.battleship.model.Ship;

public class BattleShip {
	public void start() {
		registerListeners();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter area boundaries:");
		String areaBoundary = scanner.nextLine();
		// Initializing battleZone
		// length 1 based
		BattleZone battleZone = new BattleZone(areaBoundary.charAt(0) - 64, areaBoundary.charAt(2) - 47);

		// Adding players
		Player playerA = new Player("A", 1);
		Player playerB = new Player("B", 2);

		// Loading battle ships
		for (int i = 0; i <= 2; i++) {
			System.out.format("Type for battleship %d:", i);
			String battleShipType = scanner.nextLine();
			System.out.format("Dimension for battleship %d:", i);
			String battleShipDimension = scanner.nextLine();

			System.out.format("Location of battleship %d for player A:", i);
			String playerAloc = scanner.nextLine();

			System.out.format("Location of battleship %d for player B:", i);
			String playerBLocation = scanner.nextLine();
			initBattleShip(i, battleShipType, battleShipDimension, playerAloc, playerBLocation, battleZone,playerA);

			initBattleShip(i, battleShipType, battleShipDimension, playerAloc, playerBLocation, battleZone,playerB);
		}

		// Loading arms for players
		System.out.print("Missile targets for player A:");
		String playerATargets = scanner.nextLine();

		initMissiles(playerA, playerATargets);

		System.out.print("Missile targets for player B:");
		String playerBTargets = scanner.nextLine();

		initMissiles(playerB, playerBTargets);
	}

	private void initMissiles(Player playerA, String playerATargets) {
		List<Missle> missiles = playerA.getTargets();
		if (missiles == null) {
			missiles = new ArrayList<>();
			playerA.setTargets(missiles);
		}

		for (String target : playerATargets.split(" ")) {
			Missle missle = new Missle();
			// Setting target
			missle.setFirePoint(new Point(target.charAt(0) - 65, target.charAt(1) - 48));
			missiles.add(missle);
		}
	}

	private void initBattleShip(int i, String battleShipType, String battleShipDimension, String playerAloc,
			String playerBLocation, BattleZone battleZone,Player player) {
		Ship ship = new Ship();
		ship.setId(i);
		ship.setShipOwner(player);
		

	}
	
	
	private void registerListeners() {
		EventDispatcher.INSTANCE.registerEvent(MissileFireEvent.class, new EventHandler<MissileFireEvent>() {

			@Override
			public void handle(Event event) {
				
				// handle missileFiredEvent
				//check whether it is a hit of miss, and fires MissileHitEvent or Miss 
			}
		});
		
		EventDispatcher.INSTANCE.registerEvent(CeaseFireEvent.class, new EventHandler<CeaseFireEvent>() {

			@Override
			public void handle(Event event) {
				// handle peace -- enjoy buddy
			}
		});
		
		EventDispatcher.INSTANCE.registerEvent(MissleHitEvent.class, new EventHandler<MissleHitEvent>() {

			@Override
			public void handle(Event event) {
				// handle missileHitEvent
				//check whether it is a hit of miss
			}
		});
	}
	
}