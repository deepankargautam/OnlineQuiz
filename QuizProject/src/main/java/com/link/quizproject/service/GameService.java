
package com.link.quizproject.service;

import com.link.quizproject.command.ScoresWrapper;
import com.link.quizproject.domain.Answer;
import com.link.quizproject.domain.Game;
import com.link.quizproject.domain.Question;
import java.util.ArrayList;


public interface GameService {

    public void updateGame(Game g);

    public Game startNewGame(int userId, int quizId);

    public int checkCorrectAnswer(ArrayList<Answer> answers);

    public int createUserAnswer(int gameId, int questionId, int answerId);

    public String processScore(ArrayList<Question> quest, ArrayList<Answer> ans);

    public ArrayList<ScoresWrapper> highScores();

    public ArrayList<ScoresWrapper> userHighScores(int userId);

}
