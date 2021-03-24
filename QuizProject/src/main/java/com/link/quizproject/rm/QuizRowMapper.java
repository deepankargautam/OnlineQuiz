
package com.link.quizproject.rm;


import com.link.quizproject.domain.Quiz;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class QuizRowMapper implements RowMapper<Quiz> {

    @Override
    public Quiz mapRow(ResultSet rs, int i) throws SQLException {
        Quiz q = new Quiz();
        q.setId(rs.getInt("id"));
        q.setName(rs.getString("name"));
        q.setCreatedDate(rs.getTimestamp("created_date"));
        q.setModifiedDate(rs.getTimestamp("modified_date"));
        q.setAbout(rs.getString("about"));
        return q;
    }

}
