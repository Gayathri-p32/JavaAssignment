package DemoPackage;
import java.util.*;

public class DemoMethod {
	Scanner sc = new Scanner(System.in);
	int days;
	int years;
	int remainingDays;
	
	public void convert() {
		System.out.println("Enter number of minutes");
		int minutes = sc.nextInt();
		days = minutes/1440;
		years = days/365;
		remainingDays = days%365;
		System.out.println(minutes+"minutes is approximately "+years+" years and "+remainingDays+" days" );
	}
	public static void main(String[] args) {
		DemoMethod ans = new DemoMethod();
		ans.convert();
	}

}
