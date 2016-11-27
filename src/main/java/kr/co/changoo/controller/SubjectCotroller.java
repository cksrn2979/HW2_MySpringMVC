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

		Integer credits_kyopil=subjectService.getCreditsByDivision("교필");
		Integer credits_todae=subjectService.getCreditsByDivision("토대");
		Integer credits_injae=subjectService.getCreditsByDivision("인재");
		Integer credits_jungi=subjectService.getCreditsByDivision("전기");
		Integer credits_junzi=subjectService.getCreditsByDivision("전지");
		Integer credits_junsun=subjectService.getCreditsByDivision("전선");
		
		model.addAttribute("credits_kyopil",credits_kyopil);
		model.addAttribute("credits_todae",credits_todae);
		model.addAttribute("credits_injae",credits_injae);
		model.addAttribute("credits_jungi",credits_jungi);
		model.addAttribute("credits_junzi",credits_junzi);
		model.addAttribute("credits_junsun",credits_junsun);
		
		return "showCreditsOfDivision";
	}

}
