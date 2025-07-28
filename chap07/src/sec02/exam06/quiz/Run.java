package sec02.exam06.quiz;

public class Run {

	public static void main(String[] args) {
		SchoolMember[] school = new SchoolMember[3];
		school[0] = new Student();
		school[1] = new Teacher();
		school[2] = new Staff();
		
//		Student student = (Student)school[0];
//		Teacher teacher = (Teacher)school[1];
//		Staff staff = (Staff)school[2];


		for( SchoolMember a : school) {
			a.introduce();
	    	if(a instanceof Student student) {
	    		student.study();
	    	}else if(a instanceof Teacher teacher) {
	    		teacher.teach();
	    	}else if(a instanceof Staff staff) staff.work();
	    		
		}
		
	}

}
