package com.beat.day01.model;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beat.day01.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;
	@Before
	public void setUp() throws Exception {
		
		ApplicationContext contxt=new ClassPathXmlApplicationContext("/root-context.xml");
		guestDao=(GuestDao) contxt.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull(guestDao);
		assertTrue(guestDao.selectAll() instanceof List);
		
	}

}
