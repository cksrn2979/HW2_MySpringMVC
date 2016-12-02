package kr.co.changoo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@RequestMapping(value = "/showSubjectsOfSemester")
	public String showSubjectsOfSemester(Model model, Subject subject) {
		int year = subject.getYear();
		int semester = subject.getSemester();

		List<Subject> subjects = subjectService.getSubjectsBySemseter(year, semester);
		model.addAttribute("subjects", subjects);

		return "showSubjectsOfSemester";
	}

	@RequestMapping(value = "/showCreditsOfSemester")
	public String showCreditsOfSemester(Model model) {
		int enterYear = 2011;
		int currentYear = 2016;

		ArrayList<Integer[]> creditsList = new ArrayList<>();

		for (Integer year = enterYear; year <= currentYear; year++)
			for (Integer semester = 1; semester <= 2; semester++) {
				if (subjectService.getCreditsBySemetser(year, semester) != null) {
					int credits = subjectService.getCreditsBySemetser(year, semester);
					creditsList.add(new Integer[] { year, semester, credits });
				}
			}

		model.addAttribute("creditsList", creditsList);
		return "showCreditsOfSemester";
	}

	@RequestMapping(value = "/showCreditsOfDivision")
	public String showCreditsOfDivision(Model model) {

		Integer credits_kyopil = subjectService.getCreditsByDivision("교필");
		Integer credits_todae = subjectService.getCreditsByDivision("토대");
		Integer credits_injae = subjectService.getCreditsByDivision("인재");
		Integer credits_zayoul = subjectService.getCreditsByDivision("자율");
		Integer credits_jungi = subjectService.getCreditsByDivision("전기");
		Integer credits_junzi = subjectService.getCreditsByDivision("전지");
		Integer credits_junsun = subjectService.getCreditsByDivision("전선");
		Integer allCredits = credits_kyopil + credits_todae + credits_injae + credits_zayoul + credits_jungi
				+ credits_junzi + credits_junsun;
		model.addAttribute("credits_kyopil", credits_kyopil);
		model.addAttribute("credits_todae", credits_todae);
		model.addAttribute("credits_injae", credits_injae);
		model.addAttribute("credits_zayoul", credits_zayoul);
		model.addAttribute("credits_jungi", credits_jungi);
		model.addAttribute("credits_junzi", credits_junzi);
		model.addAttribute("credits_junsun", credits_junsun);
		model.addAttribute("allCredits", allCredits);

		return "showCreditsOfDivision";
	}

}
