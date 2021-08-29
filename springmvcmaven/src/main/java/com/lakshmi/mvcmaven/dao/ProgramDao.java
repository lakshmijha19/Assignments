package com.lakshmi.mvcmaven.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lakshmi.mvcmaven.model.Program;

@Component
public class ProgramDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Program> getDetails()
	{
		Session session = sessionFactory.getCurrentSession();
		List<Program> program = session.createQuery("from Program", Program.class).list();
		return program;
	}
	
	@Transactional
	public void addProgram(Program p)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(p);
	}

	@Transactional
	public Program getDetail(int id) 
	{
		Session session = sessionFactory.getCurrentSession();
		Program p = session.get(Program.class, id);
		return p;
	}
}
