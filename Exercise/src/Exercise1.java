import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Exercise1();
		//Exercise2();
		//Exercise3();
		Exercise4();
		//Exercise5();
		//Exercise6();
		//Exercise7();
		//Exercise8();
		//Exercise9();
		//Exercise10();
	}
	public static void Exercise1(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double  celsius =((fahrenheit - 32.0)*5) / 9.0;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
	
	public static void Exercise2() {
		Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
	
	public static void Exercise3() {
		Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
	
	public static void Exercise4() {
		double minutesInYear = 60 * 24 * 365;
		Scanner input = new Scanner(System.in);

		System.out.print("Input the number of minutes: ");
		double min = input.nextDouble();

		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;

		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
	
	public static void Exercise5() {
		Scanner input = new Scanner(System.in);

		System.out.print("Input the time zone offset to GMT: ");
		long timeZoneChange = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
	    long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
	    long totalHours = totalMinutes / 60;
		long currentHour = ((totalHours + timeZoneChange) % 24);

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
	
	public static void Exercise6() {
		Scanner input = new Scanner(System.in);

	    System.out.print("Input weight in pounds: ");
	    double pounds = input.nextDouble();
	    System.out.print("Input height in inches: ");
	    double inches = input.nextDouble();

	    double BMI = pounds * 0.453592 / (inches * 0.0254 * inches * 0.0254);
	    System.out.print("Body Mass Index is " + BMI + "\n");
	}
	
	public static void Exercise7() {
	    Scanner input = new Scanner(System.in); 

	    float timeSeconds;
	    float mps,kph, mph;

	    System.out.print("Input distance in meters: ");
	    float distance = input.nextFloat();
		System.out.print("Input hour: ");
	    float hr = input.nextFloat();
		System.out.print("Input minutes: ");
		float min = input.nextFloat();
		System.out.print("Input seconds: ");
		float sec = input.nextFloat();

		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Your speed in meters/second is "+ mps);
		System.out.println("Your speed in km/h is "+ kph);
		System.out.println("Your speed in miles/h is "+ mph);
		
	}
	
	public static void Exercise8() {
		Scanner input = new Scanner(System.in);
	     System.out.print("Input the side length value: ");
	     double val = input.nextDouble();

	     System.out.printf("Square: %12.2f \n", val * val);
	     System.out.printf("Cube: %14.2f \n", val * val * val);
	     System.out.printf("Fourth power: %6.2f \n", Math.pow(val, 4));
	     
   }
	
	public static void Exercise9() {
		 Scanner input = new Scanner(System.in);
		 
         System.out.print("Input 1st integer: ");
         int first = input.nextInt();
         
         System.out.print("Input 2nd integer: ");
         int secondInt = input.nextInt();

         System.out.printf("Sum of two integers: %d\n", first + secondInt);
         System.out.printf("Difference of two integers: %d\n", first - secondInt);
         System.out.printf("Product of two integers: %d\n", first * secondInt);
         System.out.printf("Average of two integers: %.2f\n", (double) (first + secondInt) / 2);
         System.out.printf("Distance of two integers: %d\n", Math.abs(first - secondInt));
         System.out.printf("Max integer: %d%n", Math.max(first, secondInt));
         System.out.printf("Min integer: %d%n", Math.min(first, secondInt));
         
    }
	
	public static void Exercise10() {
		 Scanner input = new Scanner(System.in);
         System.out.print("Input six non-negative digits: ");
         int digit = input.nextInt();
         int n1 = digit / 100000 % 10;
         int n2 = digit / 10000 % 10;
         int n3 = digit / 1000 % 10;
         int n4 = digit / 100 % 10;
         int n5 = digit / 10 % 10;
         int n6 = digit % 10;
         System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }		
	
	
}
