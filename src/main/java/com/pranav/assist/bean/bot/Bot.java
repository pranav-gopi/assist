package com.pranav.assist.bean.bot;

import com.pranav.assist.constant.BotState;

public interface Bot {

	BotState getBotState();
	
	void moodUp();
	void moodDown();
}
