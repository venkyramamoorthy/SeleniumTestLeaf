package week1.day2homework;

public class GeneralProgram {
	public static void main(String[] args) {
		house call = new house();
		System.out.println("House Number = "+ call.houseNo);
		System.out.println("House address = "+ call.address);
		call.Family();
		Phone calling = new Phone();
		System.out.println("House Number = "+ calling.phoneNo);
		System.out.println("House address = "+ calling.Name);
		calling.phonemodel();
		
	}

}
