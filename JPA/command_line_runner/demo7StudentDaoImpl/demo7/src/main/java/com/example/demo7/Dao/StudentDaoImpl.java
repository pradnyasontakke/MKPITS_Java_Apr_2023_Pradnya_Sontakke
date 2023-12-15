package com.example.demo7.Dao;
import com.example.demo7.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                      //@Repository Annotation is a specialization of @Component
                                 // annotation which is
                                 // used to indicate that the class provides the mechanism for storage,
                                  //  retrieval, update, delete and search operation on objects.


public class StudentDaoImpl implements StudentDao{

        private EntityManager entityManager;                 // EntityManager is the class
        @Autowired                                             //injection inject
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional                                //when we can perform dml operation like insert
                                                   // update
                                              // and delete that time we are mention @transaction
    public void save(Student student) {
    entityManager.persist(student);

    }

    @Override
    public Student findData(Integer rollno) {
        return entityManager.find(Student.class,rollno);
    }

    @Override
    public List findAll() {
        TypedQuery<Student> typedQuery= entityManager.createQuery("FROM Student",Student.class);
        return typedQuery.getResultList();//typequery is interface which extend query class
    }

    @Override
    @Transactional
    public Student updateData(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer rollno) {
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("delete data");
    }


}

