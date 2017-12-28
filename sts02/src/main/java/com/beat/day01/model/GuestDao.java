package com.beat.day01.model;

import java.util.List;

import com.beat.day01.model.entity.GuestVo;

public interface GuestDao {

	List<GuestVo >selectAll() throws Exception;
}
