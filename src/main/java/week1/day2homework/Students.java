package week1.day2homework;
public class Students {

	public static void main(String[] args) {
			
			String[] studentsName = {"Venkateshraja","Arockia","Gugapriya","Shanmugalakshmi","Suganya"};
			int[] studentsAge = {24,27,26,25,25};
			char[][] grades = {{'A','B','C','D','E'},{'A','A','B','D','E'},{'A','B','C','E','E'},{'A','B','C','E','E'},{'A','B','C','E','E'}};
			for(String name :studentsName)
			{
				System.out.println("Names = "+name+" , Length = "+name.length());
			}
				
			for(int age :studentsAge)
			{
				System.out.println("Age = "+age);
			}
		}
}

