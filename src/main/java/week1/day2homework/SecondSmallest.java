package week1.day2homework;


public class SecondSmallest {
	public static void findSecondSmallestNo (int a, int b,int c) {
		int result=0;
		if(a>b && a<c) {
		result = a;
		}
		else if(b>a && b<c) {
			result = b;
			}
		else {
			result= c;
			}
		System.out.println("second smallest number is = "+result);
		
	}
public static void main(String[] args) {
		int no1 = 150;
		int no2 = 44;
		int no3 = 66;
		findSecondSmallestNo(no1,no2,no3);
	}
}
