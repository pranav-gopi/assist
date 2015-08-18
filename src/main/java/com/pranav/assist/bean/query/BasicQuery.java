package com.pranav.assist.bean.query;

import com.pranav.assist.bean.bot.Bot;

public abstract class BasicQuery {
	
	private String query;
	
	private Bot bot;

	public BasicQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Bot getBot() {
		return bot;
	}

	public void setBot(Bot bot) {
		this.bot = bot;
	}

	@Override
	public String toString() {
		return "BasicQuery [query=" + query + ", bot=" + bot + "]";
	}

	
}
