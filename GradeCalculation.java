package DemoPackage;
import java.util.*;

public class GradeCalculation {
	public static void main(String[] args) {
		int[] marks = new int[4];
		float total=0 ,avg;
		Scanner s = new Scanner(System.in);
		for(int i =0;i<3;i++) {
			System.out.println("Enter marks of subject"+(i+1));
			marks[i]=s.nextInt();
			total=total+marks[i];
		}
		avg = total/3;
		if(marks[0]<40||marks[1]<40||marks[2]<40) {
			System.out.println("F grade");
		}
		else if(avg>90) {
			System.out.println("A grade");
		}
		else if(avg>80) {
			System.out.println("B grade");
		}
		else if(avg>65) {
			System.out.println("C grade");
		}
		else if(avg>40) {
			System.out.println("D grade");
		}
		else {
			System.out.println("F grade");
		}
		
	}
}
