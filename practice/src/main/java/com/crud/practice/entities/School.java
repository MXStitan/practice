package com.crud.practice.entities;

import javax.persistence.Column;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Table;

//import springboot.storeprocedure.entities.Request;

import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.SqlResultSetMapping;


//@Entity
//@Table(name="progressreport")
//@NamedStoredProcedureQueries({
//@NamedStoredProcedureQuery(name = "progressreport",procedureName = "Getprogressreport")})

//@Entity
//@Table(name = "progressreport")
//@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "Getprogressreport", procedureName = "Getprogressreport", resultClasses = School.class) })

@Entity
@Table(name="progressreport")
@SqlResultSetMapping(name="Getprogressreport",classes = @ConstructorResult(targetClass = School.class,columns = {
		@ColumnResult(name="RollNo",type = Integer.class),
		@ColumnResult(name="Name",type = String.class),
		@ColumnResult(name="Subject",type = String.class),
}))


public class School {

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
   @Id
   @Column
	private int Rollno;
   @Column
	private String Name;
   @Column
	private String Subject;
   @Column
	private int Marks;
	
	
	
	public int getRollNo() {
		return Rollno;
	}
	public void setRollNo(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}

	

	@Override
	public String toString() {
		return "School [Rollno=" + Rollno + ", Name=" + Name + ", Subject=" + Subject + ", Marks=" + Marks + "]";
	}

	
}
