
package com.link.quizproject.dao;

import com.link.quizproject.domain.Answer;
import java.util.ArrayList;


public interface AnswerDAO extends EntityDAO<Answer>{
    
    public ArrayList<Answer> getAnswersByQuestionId(Integer id);
    
    
    
}
