package com.test.battleship.event;

public interface IEventDispatcher <E extends Event> {
	void registerEvent(Class<? extends Event> clazz, EventHandler<? extends Event > e);
	void dispatchEvent(Event e);
}
