import java.util.Scanner;
public class IT24100296Lab5Q2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Declare
		int newmemcount;

		//Inputs
		System.out.print("Enter the number of new members introduced: ");
		newmemcount = input.nextInt();

		System.out.println();		

		//Switch

		switch(newmemcount) {
            	case 0:
                	System.out.println("No Prize");
                	break;
            	case 1:
                	System.out.println("Prize is a: Pen");
                	break;
            	case 2:
                	System.out.println("Prize is a: Umbrella");
                	break;
           	case 3:
                	System.out.println("Prize is a: Bag");
                	break;
            	case 4:
                	System.out.println("Prize is a: Travelling Chair");
                	break;
            	default:
                	if (newmemcount < 0) {
                    		System.out.println("Input must be a number 0 or greater");
                	} else {
                    		System.out.println("Prize is a: Headphone");
                	}
                	break;

}

}
}
