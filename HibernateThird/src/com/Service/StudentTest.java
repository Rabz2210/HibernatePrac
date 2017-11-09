package com.Service;

import java.util.Date;

import com.Dao.StudentDao;
import com.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		StudentDao obj = new StudentDao();
		Student temp = new Student();
		temp.setId(1233);
		temp.setName("Mohammad Rabbani");
		temp.setDept("Electrical");
		temp.setAddress("Delhi arjangarh, ayanagar.");
		temp.setJoindate(new Date());
		obj.addData(temp);
		System.out.println("Insetion done");
		
		temp = null;
		System.out.println("retrieving data");
		
		temp = obj.showData(1233);
		
		System.out.println("Retrieval done");
		
		
	}

}
