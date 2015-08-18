package com.pranav.assist.bean.query;

import com.pranav.assist.constant.Action;

public class ActionQuery extends BasicQuery{

	private String response;
	
	private Action action;

	public ActionQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "ActionQuery [response=" + response + ", action=" + action
				+ ", getQuery()=" + getQuery() + ", getBot()=" + getBot() + "]";
	}
	
	
}
