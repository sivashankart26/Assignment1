package week1.day1;

public class TwoWheeler {
	int noOfWheels =2,noOfMirrors = 2;
	long chassisNumber=123L;
	boolean isPunctured= false;
	String bikeName ="Yamaha";
	double runningKM=268.54;
	public static void main(String args[]) {
		TwoWheeler yamaha = new TwoWheeler();
		System.out.println("No of wheels " + yamaha.noOfWheels);
		System.out.println("No of mirrors "+ yamaha.noOfMirrors);
		System.out.println("The bike is punctured "+ yamaha.isPunctured );
		System.out.println("The Bike name is "+ yamaha.bikeName);
		System.out.println("The running KMs is "+ yamaha.runningKM);
		System.out.println("The Chassis Number is "+ yamaha.chassisNumber);
		
	}

}
