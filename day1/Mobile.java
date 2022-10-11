package week1.day1;

public class Mobile {
	String mobileBrandName = "Vivo";
	char mobileLogo = 'V';
	short noofMobilePieces = 50;
	int modelNumber = 1569;
	long mobileImeiNumber =  9876543120L;
	float mobilePrice =  297879.99F;
	boolean mobileIsDamaged = false;
	public static void main(String[] args) {
		Mobile vivomobile = new Mobile();
System.out.println("Brand Name="+ vivomobile.mobileBrandName);
System.out.println("Mobile Logo="+vivomobile.mobileLogo);
System.out.println("noofmobiles="+vivomobile.noofMobilePieces);
System.out.println("Modelno="+vivomobile.modelNumber);
System.out.println("IMEI no ="+vivomobile.mobileImeiNumber);
System.out.println("Mobile Price="+vivomobile.mobilePrice);
System.out.println("The mobile is damaged "+ vivomobile.mobileIsDamaged);
	}


}
