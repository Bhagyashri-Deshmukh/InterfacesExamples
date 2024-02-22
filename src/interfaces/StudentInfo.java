package interfaces;

public class StudentInfo implements Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo info = new StudentInfo();
		info.printStudentInfo();
	}

	@Override
	public void printStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is Student Info");
		System.out.println("Roll number is :"+Student.rollNumber);
	}

}
