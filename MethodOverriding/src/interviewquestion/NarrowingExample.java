package interviewquestion;

public class NarrowingExample {

	public static void m1(Object o) {
		System.out.println("Object class method");
	}

	public static void m1(String s) {
		System.out.println("String class method");
	}

	public static void m1(Integer o) {
		System.out.println("Integer class method");
	}

	public static void main(String[] args) {

		Object obj = new Object();

		m1(obj);
		m1(new Object());
		m1("Hello");
		m1(101);

//		m1(null); //Compilation error
		m1((String) null);
		m1((Integer) null);
		m1((Object) null);
	}

}
