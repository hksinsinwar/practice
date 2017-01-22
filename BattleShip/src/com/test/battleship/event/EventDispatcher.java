package com.test.battleship.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher implements IEventDispatcher<Event>{

	private Map<Class<? extends Event>, List<EventHandler<? extends Event>>> handlersMap;
	
	private EventDispatcher(){
		handlersMap = new HashMap<>();
	}
	
	public static EventDispatcher INSTANCE = new EventDispatcher();
	
	@Override
	public void registerEvent(Class<? extends Event> clazz, EventHandler<? extends Event> e) {
		List<EventHandler<? extends Event>> handlers =handlersMap.get(clazz);
		if(handlers == null){
			handlers = new ArrayList<>();
			handlersMap.put(clazz, handlers);
		}
		handlers.add(e);
	}

	@Override
	public void dispatchEvent(Event e) {
		List<EventHandler<? extends Event>> handlers = handlersMap.get(e.getClass());
		for( EventHandler<? extends Event> handler : handlers){
			handler.handle(e);
		}
	}

	
}
