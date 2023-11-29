package com.example.demo7.Dao;
import com.example.demo7.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository                      //@Repository Annotation is a specialization of @Component annotation which is
                                 // used to indicate that the class provides the mechanism for storage,
                                  //  retrieval, update, delete and search operation on objects.


public class StudentDaoImpl implements StudentDao{

        private EntityManager entityManager;                 // EntityManager is the class
        @Autowired                                             //injection inject
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional                                //when we can perform dml operation like insert update and delete that time we are mension @transaction
    public void save(Student student) {
    entityManager.persist(student);

    }




}

