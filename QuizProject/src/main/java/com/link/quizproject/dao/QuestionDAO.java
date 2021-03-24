
package com.link.quizproject.dao;

import com.link.quizproject.domain.Answer;
import com.link.quizproject.domain.Question;
import java.util.ArrayList;


public interface QuestionDAO extends EntityDAO<Question>{
    
    public ArrayList<Answer> loadPossibleAnswer(Question q);  
    
    public ArrayList<Question> findQuestionByQuizId (Integer id);
    
}
