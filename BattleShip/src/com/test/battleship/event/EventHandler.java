package com.test.battleship.event;

public interface EventHandler <E extends Event>{
	void handle(Event event);
}
