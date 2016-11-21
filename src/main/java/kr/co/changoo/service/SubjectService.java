package kr.co.changoo.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.changoo.dao.SubjectDAO;
import kr.co.changoo.model.Subject;

@Service
public class SubjectService {
	private SubjectDAO subjectDAO;

	@Autowired
	public void setCreditDAO(SubjectDAO subjectDAO) {
		this.subjectDAO = subjectDAO;
	}
	
	
	public List<Subject> getSubjectsBySemseter(String year, String semester){
		return subjectDAO.getSubjectsBySemester(year, semester);
	}
	
	public Integer getCreditsBySemetser(String year,String semester){
		return subjectDAO.getCreditsBySemester(year, semester);		
	}
	
	public Integer getCreditsByDivision(String division){
		return subjectDAO.getCreditsByDivision(division);		
	}
}
