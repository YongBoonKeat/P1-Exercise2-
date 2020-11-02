import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter your height in feet: ");
	    int feet = input.nextInt();
	    System.out.print("Enter your height in inch: ");
	    int inch = input.nextInt();
	    int female = (40+(inch*5));
	    int male = (50+(inch*6));
	    System.out.println("The ideal weight for female is : " + female + "kg" + "\n" + "The ideal weight for male is : " + male + "kg");
	 }
		
			
}
