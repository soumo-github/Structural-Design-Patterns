package Main;

import java.util.List;

import Model.Student;
import Service.StudentClient;

public class Main {

	public static void main(String[] args) {
		
		StudentClient sc = new StudentClient();
		List<Student> sl = sc.getStudentsList();
		System.out.println(sl);
		System.out.println(sc);
		
	}

}
