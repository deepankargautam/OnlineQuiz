
package com.link.quizproject.service;

import com.link.quizproject.domain.Answer;
import java.util.ArrayList;
import java.util.List;


public interface AnswerService {

    public int createAnswer(Answer a);

    public ArrayList<Answer> getAnswerList();

    public Answer getAnswerById(Integer id);

    public ArrayList<Answer> getAnswerByQuestion(Integer id);

    public void updateAnswer(Answer a);
    
    public void updateAnswers (List<Answer> answers);       
    
}
