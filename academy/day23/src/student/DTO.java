package student;

import java.sql.Date;

//STUDNO   NOT NULL NUMBER       
//NAME     NOT NULL VARCHAR2(10) 
//ID       NOT NULL VARCHAR2(20) 
//GRADE             NUMBER       
//JUMIN    NOT NULL CHAR(13)     
//BIRTHDAY          DATE         
//TEL               VARCHAR2(15) 
//HEIGHT            NUMBER       
//WEIGHT            NUMBER       
//DEPTNO1  NOT NULL NUMBER       
//DEPTNO2           NUMBER       


public class DTO {
	private int studno;
	private String name;
	private String id;
	private int grade;
	private String jumin;
	private Date birthday;
	private String tel;
	private int height;
	private int weight;
	private int deptno1;
	private int deptno2;
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public int getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}
	
	
}
