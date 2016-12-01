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

	public List<Subject> getSubjectsBySemseter(int year, int semester) {
		return subjectDAO.getSubjectsBySemester(year, semester);
	}

	public Subject getCreditsBySemetser(int year, int semester) {
		if (subjectDAO.getCreditsBySemester(year, semester) != null) {
			Subject credits = new Subject();
			credits.setCredit(subjectDAO.getCreditsBySemester(year, semester));
			credits.setYear(year);
			credits.setSemester(semester);
			return credits;
		}
		return null;
	}

	public Integer getCreditsByDivision(String division) {
		return subjectDAO.getCreditsByDivision(division);
	}
}
