package kr.co.changoo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.changoo.model.PreferSubject;

@Repository
public class PreferSubjectDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean insert(PreferSubject prefersubject){
		String sql="insert into prefersubjects value (?,?,?,?);";
		String subjectcode=prefersubject.getSubjectcode();
		String subjectname=prefersubject.getSubjectname();
		String division=prefersubject.getDivision();
		Integer credit=prefersubject.getCredit();
		return jdbcTemplate.update(sql,new Object[]{subjectcode,subjectname,division,credit})==1;		
	}
	
	public List<PreferSubject> getPreferSubjects(){
		String sql="select * from prefersubjects;";
		return jdbcTemplate.query(sql, new RowMapper<PreferSubject>(){

			@Override
			public PreferSubject mapRow(ResultSet rs, int rowNum) throws SQLException {
				PreferSubject preferSubject=new PreferSubject();
				preferSubject.setSubjectcode(rs.getString("교과코드"));
				preferSubject.setSubjectname(rs.getString("교과명"));
				preferSubject.setDivision(rs.getString("구분"));
				preferSubject.setCredit(rs.getInt("학점"));
				return preferSubject;
			}
			
		});
	}
}
