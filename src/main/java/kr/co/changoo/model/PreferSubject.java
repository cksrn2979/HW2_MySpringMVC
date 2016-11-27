package kr.co.changoo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PreferSubject {
	@NotEmpty(message = "put data!")
	@Pattern(regexp = "^[a-zA-z]{3}[0-9]{4}$", message = "Invalid data pattern, Fit pattern 'AAA0000'")
	private String subjectcode;

	@NotEmpty(message = "put data!")
	private String subjectname;

	@NotEmpty(message = "put data!")
	@Size(min = 2, max = 2, message = "incorrect data size, Fit size 2!")
	private String division;

	
	@NotNull(message = "put data!")
	@Min(value=0, message="more than 0")
	@Max(value=3, message="less than 4")
	private Integer credit;

	public PreferSubject() {
	}

	public PreferSubject(String subjectcode, String subjectname, String division, Integer credit) {
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
		this.division = division;
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "PreferSubject [subjectcode=" + subjectcode + ", subjectname=" + subjectname + ", division=" + division
				+ ", credit=" + credit + "]";
	}

	public String getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

}
