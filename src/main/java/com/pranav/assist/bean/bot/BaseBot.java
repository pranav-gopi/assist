package com.pranav.assist.bean.bot;

import com.pranav.assist.constant.BotState;

public class BaseBot implements Bot {

	private int _id;
	
	private float state;
	
	private BotState botState;
	
	private static float step = 1;

	
	
	public BaseBot() {
		super();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public float getState() {
		return state;
	}

	public void setState(float state) {
		this.state = state;
	}
	
	
	public void setBotState(BotState botState) {
		this.botState = botState;
	}

	@Override
	public BotState getBotState() {
		return botState;
	}

	@Override
	public void moodUp() {
		state+=step;
	}

	@Override
	public void moodDown() {
		state-=step;
		if(state<0) state = 0;
		
	}

	@Override
	public String toString() {
		return "BaseBot [_id=" + _id + ", state=" + state + ", botState="
				+ botState + "]";
	}
	
	
	
}
