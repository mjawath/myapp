package com.dao;

import com.mycompany.entitybase.dao.BaseDAOJPA;
import java.io.Serializable;
import javax.annotation.PostConstruct;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class BaseDAOSF<T, ID extends Serializable> extends BaseDAOJPA<T, ID >  {

    @PersistenceContext
    protected EntityManager entityManager;

    protected SimpleJpaRepository<T, ID> proxyRepo;//SimpleJpaRepository will act as default actual repository handler  proxy

    private final Class<T> persistentClass;

    public BaseDAOSF(Class<T> domainClass) {
        super(domainClass);
        this.persistentClass = domainClass;//(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public T findById(ID id) {        
        return (T) proxyRepo.findOne(id);
    }

    public T getOne(ID id) {
        return proxyRepo.getOne(id);
    }

    public void save(T obj) {
        proxyRepo.save(obj);
    }

    public void delete(T obj) {
        proxyRepo.delete(obj);
    }

    public T getByKey(ID key) {
        return (T) proxyRepo.findOne(key);

    }

    public void persist(T entity) {
        entityManager.persist(entity);
    }

    public void update(T entity) {
        entityManager.merge(entity);
    }

    public void remove(T entity) {
        entityManager.remove(entity);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("---------------");
        System.out.println("init  after post ss " + proxyRepo == null);
        if (entityManager == null) {
            System.out.println("ooooooooops entitiyme amnger is null");
            return;
        }
        if (persistentClass == null) {
            System.out.println("ooooooooops persistance is null++++");
            return;
        }
        proxyRepo = new SimpleJpaRepository<>(persistentClass, entityManager);
        if (proxyRepo == null) {
            System.out.println("*******************proxy is nulll");
        }
    }
}
