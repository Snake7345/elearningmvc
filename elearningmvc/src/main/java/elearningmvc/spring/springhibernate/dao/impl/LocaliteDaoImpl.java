package elearningmvc.spring.springhibernate.dao.impl;

import elearningmvc.spring.springhibernate.dao.LocaliteDao;
import elearningmvc.spring.springhibernate.entity.Localite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("LocaliteDao")
public class LocaliteDaoImpl implements LocaliteDao 
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Localite localite) 
	{
		Integer result = (Integer) hibernateTemplate.save(localite);
		return result;
	}

	@Override
	@Transactional
	public void update(Localite localite) 
	{
		hibernateTemplate.update(localite);
	}

	@Override
	@Transactional
	public void delete(Localite localite) 
	{
		hibernateTemplate.delete(localite);	
	}

	@Override
	public Localite find(int id) 
	{
		Localite localite = hibernateTemplate.get(Localite.class, id);
		return localite;
	}

	@Override
	public List<Localite> findAll() 
	{
		List<Localite> localite = hibernateTemplate.loadAll(Localite.class);
		return localite;
	}

}
