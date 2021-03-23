package lab1;
 
import java.util.Scanner;
public class Exercise1_2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice of light");
		System.out.println("1: Red \n2: Yellow \n3: Green ");
		int x=scanner.nextInt();
		scanner.close();
		switch(x) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		}
		

	}

}
