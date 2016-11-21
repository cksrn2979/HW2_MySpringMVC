package kr.co.changoo.model;

public class Subject {

	private String year;
	private String semester;
	private String subjectcode;
	private String subjectname;
	private String division;
	private Integer credit;

	public Subject() {

	}

	public Subject(String year, String semester, String subjectcode, String subjectname, String division,
			Integer credit) {
		this.year = year;
		this.semester = semester;
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
		this.division = division;
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Subject [year=" + year + ", semester=" + semester + ", subjectcode=" + subjectcode + ", subjectname="
				+ subjectname + ", division=" + division + ", credit=" + credit + "]";
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
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
