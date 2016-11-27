package kr.co.changoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.changoo.dao.PreferSubjectDAO;
import kr.co.changoo.model.PreferSubject;

@Service
public class PreferSubjectService {
	private PreferSubjectDAO preferSubjectDAO;

	@Autowired
	public void setPreferSubjectDAO(PreferSubjectDAO preferSubjectDAO) {
		this.preferSubjectDAO = preferSubjectDAO;
	}

	public PreferSubjectDAO getPreferSubjectDAO() {
		return preferSubjectDAO;
	}
	
	public void insert(PreferSubject preferSubject){
		preferSubjectDAO.insert(preferSubject);
	}
	
	public List<PreferSubject> getPreferSubjects(){
		return preferSubjectDAO.getPreferSubjects();
	}

}
