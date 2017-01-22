package com.test.battleship.event;

public class MissileFireEvent implements Event {

	private Object eventData;
	private String message;
	public MissileFireEvent(Object eventData ,String message){
		this.eventData = eventData;
		this.message = message;
	}
	@Override
	public Class<? extends Event> getType() {
		return getClass();
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
