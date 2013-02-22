package com.github.sinhr.testbase.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.sinhr.testbase.domain.Question;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addQuestion(Question question) {
        sessionFactory.getCurrentSession().save(question);
    }

    @SuppressWarnings("unchecked")
    public List<Question> listQuestion() {

        return sessionFactory.getCurrentSession().createQuery("from Question")
            .list();
    }

    public void removeQuestion(Integer id) {
    	Question question = (Question) sessionFactory.getCurrentSession().load(
                Question.class, id);
        if (null != question) {
            sessionFactory.getCurrentSession().delete(question);
        }

    }
}