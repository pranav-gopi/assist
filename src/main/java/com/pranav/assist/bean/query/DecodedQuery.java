package com.pranav.assist.bean.query;

import java.util.ArrayList;

import com.pranav.assist.constant.QueryType;

public class DecodedQuery extends BasicQuery{

	private QueryType queryType;
	
	private ArrayList<Integer> hashArray;

	public DecodedQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryType getQueryType() {
		return queryType;
	}

	public void setQueryType(QueryType queryType) {
		this.queryType = queryType;
	}

	public ArrayList<Integer> getHashArray() {
		return hashArray;
	}

	public void setHashArray(ArrayList<Integer> hashArray) {
		this.hashArray = hashArray;
	}

	@Override
	public String toString() {
		return "DecodedQuery [queryType=" + queryType + ", hashArray="
				+ hashArray + ", getQuery()=" + getQuery() + ", getBot()="
				+ getBot() + "]";
	}
	
	
}
