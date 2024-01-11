package Service;
import java.util.ArrayList;
import java.util.List;

import Model.College;
import Model.School;
import Model.Student;

public class StudentClient {


	public List<Student> getStudentsList(){
		
		List<Student> sts = new ArrayList<>();
		
		College cs = new College("Soumalya dhar", "soumo2k15@gmail.com", 23);
		
		School ss = new School("Soham Kr", "abc@gmail.com", 23);
		
		sts.add(new Adapter(cs));
		
		sts.add(ss);
		
		
		
		return sts;
	}
	
	@Override
	public String toString() {
		return "StudentClient [getStudentsList()=" + getStudentsList() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
