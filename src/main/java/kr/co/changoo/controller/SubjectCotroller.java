package kr.co.changoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.changoo.model.Subject;
import kr.co.changoo.service.SubjectService;

@Controller
public class SubjectCotroller {

	private SubjectService subjectService;

	@Autowired
	public void setCreditService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	
	public SubjectService getCreditService() {
		return subjectService;
	}

	
	@RequestMapping(value="/showSubjectsOfSemester")
	public String showSubjectsOfSemester(Model model,Subject subject){
		String year=subject.getYear();
		String semester=subject.getSemester();
		
		List<Subject> subjects=subjectService.getSubjectsBySemseter(year, semester);
		model.addAttribute("subjects",subjects);
		
		return "showSubjectsOfSemester";
	}
	
	@RequestMapping(value = "/showCreditsOfSemester")
	public String showCreditsOfSemester(Model model) {

		Integer credits2011_1=subjectService.getCreditsBySemetser("2011","1");
		Integer credits2011_2=subjectService.getCreditsBySemetser("2011","2");
		Integer credits2015_1=subjectService.getCreditsBySemetser("2015","1");
		Integer credits2015_2=subjectService.getCreditsBySemetser("2015","2");
		Integer credits2016_1=subjectService.getCreditsBySemetser("2016","1");
		Integer credits2016_2=subjectService.getCreditsBySemetser("2016","2");
		
		model.addAttribute("credits2011_1",credits2011_1);
		model.addAttribute("credits2011_2",credits2011_2);
		model.addAttribute("credits2015_1",credits2015_1);
		model.addAttribute("credits2015_2",credits2015_2);
		model.addAttribute("credits2016_1",credits2016_1);
		model.addAttribute("credits2016_2",credits2016_2);
		
		return "showCreditsOfSemester";
	}

	@RequestMapping(value = "/showCreditsOfDivision")
	public String showCreditsOfDivision(Model model) {

		Integer credits_basicliberalart=subjectService.getCreditsByDivision("교필");
		Integer credits_liberalartA=subjectService.getCreditsByDivision("토대");
		Integer credits_liberalartB=subjectService.getCreditsByDivision("인재");
		Integer credits_basicMajor=subjectService.getCreditsByDivision("전기");
		Integer credits_appointMajor=subjectService.getCreditsByDivision("전지");
		Integer credits_selectMajor=subjectService.getCreditsByDivision("전선");
		
		model.addAttribute("credits_basicliberalart",credits_basicliberalart);
		model.addAttribute("credits_liberalartA",credits_liberalartA);
		model.addAttribute("credits_liberalartB",credits_liberalartB);
		model.addAttribute("credits_basicMajor",credits_basicMajor);
		model.addAttribute("credits_appointMajor",credits_appointMajor);
		model.addAttribute("credits_selectMajor",credits_selectMajor);
		
		return "showCreditsOfDivision";
	}

}
