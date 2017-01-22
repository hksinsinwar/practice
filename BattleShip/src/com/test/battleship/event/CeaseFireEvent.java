package com.test.battleship.event;

public class CeaseFireEvent implements Event {

	private Object eventData;
	private String message;

	public CeaseFireEvent(Object data, String message) {
		this.eventData = data;
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
