package kr.co.changoo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.changoo.model.Subject;

@Repository
public class SubjectDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Subject> getSubjectsBySemester(int year, int semester) {
		String str = "select * from subjects where 수강년도=? and 학기=?";
		return jdbcTemplate.query(str, new Object[] { year, semester }, new SubjectMapper());
	}

	public List<Subject> getSubjectsByDivision(String division) {
		String str = "select * from subjects where 구분=?";
		return jdbcTemplate.query(str, new Object[] { division }, new SubjectMapper());
	}

	public Integer getCreditsByDivision(String division) {
		String str = "select sum(학점) from subjects where 구분=?";
		return jdbcTemplate.queryForObject(str, new Object[] { division }, Integer.class);
	}

	public Integer getCreditsBySemester(int year, int semester) {
		String str = "select sum(학점) from subjects where 수강년도=? and 학기=?";
		return jdbcTemplate.queryForObject(str, new Object[] { year, semester }, Integer.class);
	}

	class SubjectMapper implements RowMapper<Subject> {
		@Override
		public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
			Subject subject = new Subject();
			subject.setYear(rs.getInt("수강년도"));
			subject.setSemester(rs.getInt("학기"));
			subject.setDivision(rs.getString("구분"));
			subject.setSubjectcode(rs.getString("교과코드"));
			subject.setSubjectname(rs.getString("교과목명"));
			subject.setCredit(rs.getInt("학점"));
			return subject;
		}
	}

}
