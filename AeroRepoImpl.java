package com.xworkz.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.AeroEntity;


@Repository
public class AeroRepoImpl implements AeroRepo{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	

	@Override
	public boolean save(AeroEntity entity) {
		System.out.println("running save method" +entity);
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}
	
	public AeroEntity findById(int id)
	{
		System.out.println("find id in repo impl" +id);
		EntityManager manger=this.entityManagerFactory.createEntityManager();
		AeroEntity fromDB=manger.find(AeroEntity.class, id);
		manger.close();
		return fromDB;
	}
}
