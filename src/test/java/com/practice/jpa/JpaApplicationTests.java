package com.practice.jpa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.practice.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private UserRepository userJpaRepository;

	@Test
	public void findByKeyTest() throws Exception {
		Assert.assertEquals("Value of Key-1", "11", userJpaRepository.findByKeyw("1").getValue());
	}

}
