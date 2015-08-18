package com.pranav.assist.processor;

import com.pranav.assist.bean.query.BasicQuery;

public interface Processor {

	BasicQuery process(BasicQuery query);
}
