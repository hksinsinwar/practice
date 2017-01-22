package com.test.battleship.event;

public interface Event {
	Class<? extends Event> getType();
	Object getEventData();
	String getEventMessage();
}
