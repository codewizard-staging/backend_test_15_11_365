package com.app.test_15_11.repository;

import com.app.test_15_11.model.Manager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ManagerRepository extends SimpleJpaRepository<Manager, String> {
    private final EntityManager em;
    public ManagerRepository(EntityManager em) {
        super(Manager.class, em);
        this.em = em;
    }
    @Override
    public List<Manager> findAll() {
        return em.createNativeQuery("Select * from \"test_15_11_163\".\"Manager\"", Manager.class).getResultList();
    }
}