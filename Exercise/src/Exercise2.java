import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		Question8();
		Question9();
		Question10();
		
	}
	public static void Question1() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fname = input.next();
		System.out.print("Enter your last name: ");
		String lname = input.next();
		String fullname = fname+lname;
		System.out.println("Hello \n" + fname + " "+ lname + " or " + fullname);
		 
	}
	public static void Question2() {
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Input the first number: ");
	    int a = input.nextInt();
	    System.out.print("Input the second number: ");
	    int b = input.nextInt();
	    int c = (a/b);
	    System.out.println();
	    System.out.println("The division of a and b is:" + c + " or " + (a/b));
	 }
	public static void Question3() {
	Scanner input = new Scanner(System.in);
	   
	  System.out.print("Input first number: ");
	  int num1 = input.nextInt();
	  System.out.print("Input second number: ");
	  int num2 = input.nextInt();
	   
	 
	  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
	 }
	
	public static void Question4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num1 = input.nextInt();
		   
		for (int i=0; i< 10; i++) {
		System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
	}
	}
	public static void Question5() {
		Scanner input = new Scanner(System.in);
		   
		System.out.print("Input first number: ");
		int num1 = input.nextInt();		   
		System.out.print("Input second number: ");
		int num2 = input.nextInt();		   
		System.out.print("Input third number: ");
		int num3 = input.nextInt();		   
		System.out.print("Input fourth number: ");
		int num4 = input.nextInt();  
		System.out.print("Enter fifth number: ");
		int num5 = input.nextInt();
		   
		System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
		
	}
	public static void Question6() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the radius of the circle: ");
		double radius = input.nextDouble();
		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));

	}
	public static void Question7() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
	}
	}
	}
	public static void Question8() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String str1 = input.nextLine();
		int result = Integer.parseInt(str1);
		System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
		
	}

		public static void Question9() {
			Scanner input = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int a = input.nextInt();  
			System.out.print("Input the second number: ");
			int b = input.nextInt(); 
			System.out.print("Input the third number : ");
	        int c = input.nextInt(); 
	        System.out.println((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20));
		}
		
	public static void Question10() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = input.nextInt();  
		System.out.print("Input the second number: ");
		int y = input.nextInt(); 
		System.out.print("Input the third number : ");
        int z = input.nextInt(); 
        System.out.print("The result is: "+sumoftwo(x, y, z));
		System.out.print("\n");
   
	}
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
	 
	
	
}

