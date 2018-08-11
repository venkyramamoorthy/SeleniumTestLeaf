package week4.Homework;

public class StaticConcept {
	public static String variable1 = "hello";
	public static void staticstringprint(String variable1,String variable2)
	{
		System.out.println(variable1+" "+variable2);
	}
	public void normalstringprint(String variable1,String variable2)
	{
		System.out.println(variable1+" "+variable2);
	}
	public static void main(String[] args) {
		StaticConcept object = new StaticConcept();
		//final String variable1 = "hello";
		String variable2 = "world";
		staticstringprint(variable1,variable2);
		object.normalstringprint(variable1,variable2);
	}
}
