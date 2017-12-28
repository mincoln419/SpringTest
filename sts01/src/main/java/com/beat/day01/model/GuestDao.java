package com.beat.day01.model;

import java.util.List;

public interface GuestDao<T> {

	public List<T> selectAll() throws Exception;
	
}
