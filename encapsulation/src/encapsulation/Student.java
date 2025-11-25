package encapsulation;

public class Student {
	private String studentName;
	private int studentId;
	private int studentMarks;
	private char gender;
	private char section;
	private long mobileNo;
	public Student() {
		
	}
	public Student(String studentName, int studentId, int studentMarks, char gender, char section, long mobileNo) {
		getStudentName();
		getStudentId();
		getStudentMarks();
		getGender();
		getSection();
		getMobileNo();
	}
	//Getter and Setter for Student Name
	public void setStudentName(String studentName) {
		if(validateStudentName(studentName)){
			this.studentName = studentName;
		}
		else {
			this.studentName = "Enter Correct Name";
		}
		
	}
	public String getStudentName() {
		return studentName;
	}
	//Validation for Student Name
	public boolean validateStudentName(String studentName) {
		char firstChar = studentName.charAt(0);
		char lastChar = studentName.charAt(studentName.length()-1);
		if(firstChar >= 'A' && firstChar <= 'Z' && lastChar >= 'a' && lastChar <= 'z'
				&&  studentName.length()==6) {
			return true;
		}
		else {
			return false;
		}
	}
	//Getter and Setter for Student ID
	public void setStudentId(int studentId) {
		if (ValidateId(studentId)) {
			this.studentId = studentId;
		}
		else {
			System.out.println("Enter valid number");
		}
	}
	public int getStudentId() {
		return studentId;
	}
	public boolean ValidateId(int id)
	{
		if (id <= 1) {
			return false;
		}
		for (int i = 2; i <= id / 2; i++) {
			if (id % i == 0) {
				return false;   
				}
		    }
		    return true; 
	}
	public void setStudentMarks(int studentMarks) {
		if(validationStudentMarks(studentMarks)) {
			this.studentMarks = studentMarks;
		}
		else {
			System.out.println("Enter a Correct Marks");
		}
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public boolean validationStudentMarks(int studentMarks) {
		if (studentMarks >= 40 && studentMarks <= 99) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setGender(char gender) {
		if(validateGender(gender)) {
			this.gender = gender;
		}
		else {
			System.out.println("Enter M or F");
		}
	}
	public char getGender() {
		return gender;
	}
	public boolean validateGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			return true;
		}
		else {
			return false;
		}
	}
	public void setSection(char section) {
		if(validateSection(section)) {
			this.section = section;
		}
		else {
			System.out.println("Enter the A or B or C");
		}
	}
	public char getSection() {
		return section;
	}
	public boolean validateSection(char section) {
		if(section == 'A' || section == 'B' || section=='C') {
			return true;
		}
		else {
			return false;
		}
	}
	public void setMobileNo(long mobileNo) {
		if(validateMobileNo(mobileNo)) {
			this.mobileNo = mobileNo;
		}
		else {
			System.out.println("Enter Valid Mobbile Number");
		}
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public boolean validateMobileNo(long mobileNo) {
		String str = mobileNo+"";
		char firstletter = str.charAt(0);
		char lastLetter = str.charAt(str.length()-1);
		int firstNum = (int)firstletter;
		int lastNum = (int)lastLetter;
		if (str.length() == 10 &&  firstNum % 2 == 0 &&
				lastNum % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
