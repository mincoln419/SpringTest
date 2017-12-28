package com.beat.day01.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;


import com.beat.day01.model.entity.GuestVo;

@Controller
public class GuestDaoImpl implements GuestDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<GuestVo> selectAll() throws Exception {

		String sql = "select * from guest03";

		return jdbcTemplate.query(sql, new RowMapper<GuestVo>(){
			
			@Override
			public GuestVo mapRow(ResultSet rs, int arg1) throws SQLException {
				return new GuestVo(
						rs.getInt("sabun"), rs.getString("name"), rs.getTimestamp("nalja"), rs.getInt("pay")
						);
			}
		});
	}

}
