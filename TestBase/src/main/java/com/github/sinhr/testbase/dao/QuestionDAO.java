package com.github.sinhr.testbase.dao;

import java.util.List;

import com.github.sinhr.testbase.domain.Question;

	public interface QuestionDAO {

	    public void addQuestion(Question question);

	    public List<Question> listQuestion();

	    public void removeQuestion(Integer id);
}
