package interfaces;

public class ClonableExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student1 st1 = new Student1(10, "Reshma");
		Student1 st2 = (Student1) st1.clone();
		
		System.out.println(st2.id);
		System.out.println(st2.name);
	}

}

class Student1 implements Cloneable {

	public int id;
	public String name;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}