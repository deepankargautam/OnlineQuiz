
package com.link.quizproject.rm;

import com.link.quizproject.command.ScoresCommand;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class ScoresRowMapper implements RowMapper<ScoresCommand>{

    @Override
    public ScoresCommand mapRow(ResultSet rs, int i) throws SQLException {
        ScoresCommand sc = new ScoresCommand();
        sc.setId(rs.getInt("id"));
        sc.setQuizId(rs.getInt("quiz_id"));
        sc.setEndTime(rs.getTimestamp("end_time"));
        sc.setUsername(rs.getString("username"));
        sc.setScore(rs.getInt("score"));
        return sc;
    }
    
}
