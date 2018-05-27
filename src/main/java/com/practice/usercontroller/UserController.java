package com.practice.usercontroller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.repository.UserRepository;
import com.practice.usermodel.User;

@Controller
@RestController
@RequestMapping(path="/")
public class UserController {

	@Autowired
	private UserRepository userJpaRepository;

	@GetMapping("/{keyw}")
	public com.practice.usermodel.User findByKeyw(@PathVariable String keyw) {
		User u = userJpaRepository.findByKeyw(keyw);
		PrintUsers(u);
		return u;
	}

	@GetMapping("/all")
	public List<com.practice.usermodel.User> findAll() {
		List<User> ul = (List<User>) userJpaRepository.findAll();
		PrintUsers(ul);
		return ul;
	}

	@PostMapping("/save/{keyw}/{value}")
	public String save(@PathVariable String keyw, @PathVariable String value) {
		userJpaRepository.save(new User(keyw, value));
		PrintUsers(new User(keyw, value));
		return new User(keyw, value).toString();
	}

	private void PrintUsers(List<User> ul) {
		Iterator<User> i = ul.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	private void PrintUsers(User u) {
		System.out.println(u);

	}
}
