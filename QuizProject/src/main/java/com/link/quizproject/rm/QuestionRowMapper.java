
package com.link.quizproject.rm;

import com.link.quizproject.domain.Question;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class QuestionRowMapper implements RowMapper<Question>{

    @Override
    public Question mapRow(ResultSet rs, int i) throws SQLException {
        Question q = new Question();
        q.setId(rs.getInt("id"));
        q.setQuiz_id(rs.getInt("quiz_id"));
        q.setTitle(rs.getString("title"));
        q.setText(rs.getString("text"));
        return q;
    }
    
}
