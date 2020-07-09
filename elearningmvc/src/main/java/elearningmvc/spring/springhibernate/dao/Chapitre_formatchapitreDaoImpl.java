package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import elearningmvc.spring.springhibernate.model.Chapitre_formatchapitre;

@Component("Chapitre_formatchapitreDao")
public class Chapitre_formatchapitreDaoImpl implements Chapitre_formatchapitreDao
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Chapitre_formatchapitre chapitre_formatchapitre) 
	{
		Integer result = (Integer) hibernateTemplate.save(chapitre_formatchapitre);
		return result;
	}

	@Override
	@Transactional
	public void update(Chapitre_formatchapitre chapitre_formatchapitre) 
	{
		hibernateTemplate.update(chapitre_formatchapitre);
	}

	@Override
	@Transactional
	public void delete(Chapitre_formatchapitre chapitre_formatchapitre) 
	{
		hibernateTemplate.delete(chapitre_formatchapitre);	
	}

	@Override
	public Chapitre_formatchapitre find(int id) 
	{
		Chapitre_formatchapitre chapitre_formatchapitre = hibernateTemplate.get(Chapitre_formatchapitre.class, id);
		return chapitre_formatchapitre;
	}

	@Override
	public List<Chapitre_formatchapitre> findAll() 
	{
		List<Chapitre_formatchapitre> chapitre_formatchapitre = hibernateTemplate.loadAll(Chapitre_formatchapitre.class);
		return chapitre_formatchapitre;
	}
}
