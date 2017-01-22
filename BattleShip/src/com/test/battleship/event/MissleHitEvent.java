package com.test.battleship.event;

public class MissleHitEvent implements Event{

	private Object eventData;
	private String message;
	@Override
	public Class<? extends Event> getType() {
		return getClass();
	}
	public MissleHitEvent(Object data, String message){
		this.eventData = data;
		this.message = message;
	}
	@Override
	public Object getEventData() {
		return this.eventData;
	}

	@Override
	public String getEventMessage() {
		return this.message;
	}
	
}
