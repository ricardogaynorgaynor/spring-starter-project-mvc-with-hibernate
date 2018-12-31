package com.gaynor.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class TestController {

	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping(value="/demo_war_exploded", method=RequestMethod.GET)
	public String getTest() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = session.get(User.class, 1);
		session.getTransaction();
		System.out.println(user.toString());
		return "index";
	}

}
