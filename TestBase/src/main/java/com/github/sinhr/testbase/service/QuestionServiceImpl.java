package com.github.sinhr.testbase.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.sinhr.testbase.dao.QuestionDAO;
import com.github.sinhr.testbase.domain.Question;
 
@Service
public class QuestionServiceImpl implements QuestionService {
 
    @Autowired
    private QuestionDAO questionDAO;
 
    @Transactional
    public void addQuestion(Question question) {
        questionDAO.addQuestion(question);
    }
 
    @Transactional
    public List<Question> listQuestion() {
 
        return questionDAO.listQuestion();
    }
 
    @Transactional
    public void removeQuestion(Integer id) {
        questionDAO.removeQuestion(id);
    }
}