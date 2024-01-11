package Service;

import Model.College;
import Model.Student;

public class Adapter implements Student{
	
	private College cs;
	
	
	public Adapter(College ss) {
		this.cs = ss;
	}
	
	@Override
	public String getName() {
		
		return this.cs.getName();
		
	}

	@Override
	public int getAge() {
		
		return this.cs.getAge();
		
	}

	@Override
	public String getEmai() {
		
		return this.cs.getEmai();
		
	}

}
