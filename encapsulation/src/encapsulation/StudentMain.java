package encapsulation;
import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.setStudentName("Karthi");
		System.out.println(s.getStudentName());
		s.setStudentId(127);
		System.out.println(s.getStudentId());
		s.setStudentMarks(40);
		System.out.println(s.getStudentMarks());
		s.setGender('M');
		System.out.println(s.getGender());
		s.setSection('A');
		System.out.println(s.getSection());
		s.setMobileNo(2345678934L);
		System.out.println(s.getMobileNo());
		
	}
}
