package week1.day1;

public class Student {
	String StudentName = "Sharath";
	int RollNum = 12345;
	public void College()
	{
		String College = "Anna University";
		System.out.println(College);
	}
	public void Department()
	{
		String Department = "CSE";
		System.out.println(Department);
	}
	public static void main(String[] args) {
		Student Info = new Student();
		Info.College();
		Info.Department();
		System.out.println(Info);
		System.out.println(Info);
	}
	

}
