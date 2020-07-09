package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import elearningmvc.spring.springhibernate.model.Categoriemodule;

@Component("CategoriemoduleDao")
public class CategoriemoduleDaoImpl implements CategoriemoduleDao
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Categoriemodule categoriemodule) 
	{
		Integer result = (Integer) hibernateTemplate.save(categoriemodule);
		return result;
	}

	@Override
	@Transactional
	public void update(Categoriemodule categoriemodule) 
	{
		hibernateTemplate.update(categoriemodule);
	}

	@Override
	@Transactional
	public void delete(Categoriemodule categoriemodule) 
	{
		hibernateTemplate.delete(categoriemodule);	
	}

	@Override
	public Categoriemodule find(int id) 
	{
		Categoriemodule categoriemodule = hibernateTemplate.get(Categoriemodule.class, id);
		return categoriemodule;
	}

	@Override
	public List<Categoriemodule> findAll() 
	{
		List<Categoriemodule> categoriemodule = hibernateTemplate.loadAll(Categoriemodule.class);
		return categoriemodule;
	}
}
