package com.github.sinhr.testbase.service;

import java.util.List;
import com.github.sinhr.testbase.domain.Question;

public interface QuestionService {

	    public void addQuestion(Question question);

	    public List<Question> listQuestion();

	    public void removeQuestion(Integer id);

}

