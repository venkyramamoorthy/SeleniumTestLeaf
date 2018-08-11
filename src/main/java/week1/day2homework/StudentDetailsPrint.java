package week1.day2homework;

public class StudentDetailsPrint {

	public static void main(String[] args) {
		int totalNumberOfstudents=5;
		totalNumberOfstudents = totalNumberOfstudents -1;
		String[] studentsName = {"Venkatesh raja","Arockia","Gugapriya","Shanmugalakshmi","Suganya"};
		int[] studentsAge = {24,27,26,25,25};
		char[][] grades = {{'A','B','C','D','E'},{'A','A','B','D','E'},{'A','B','C','E','E'},{'A','B','C','E','E'},{'A','B','C','E','E'}};
		for(int i=0;i<=totalNumberOfstudents;i++)
		{
			System.out.println(studentsName[i]+" who is "+studentsAge[i]+" Years old scored "+grades[i][0]+","+grades[i][1]+","+grades[i][2]+","+grades[i][3]+","+grades[i][4]);
		}
	}
}
