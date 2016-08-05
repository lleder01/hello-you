import java.util.Scanner;

public class HelloYou {
	static Scanner scanner = new Scanner(System.in);
	static String[] userVars;
	static String[] details;

	public static void exitApplication() {
		System.out.println("\nThank you for using the SQA Greeting Application!");
		System.exit(0);
	}
	
	public static String[] requestUserInfo(String name, String...details) {
         userVars = new String[details.length];
         System.out.println("I am excited to learn more about you " + name + "!");
         for (int i = 0; i < details.length; i++) {
         	 System.out.println("Can I get your "  + details[i] + ", please");
         	 userVars[i] = scanner.nextLine();
         }

         return details;
	}

	 public static void main(String[] args) {
	 	String name;
	 	System.out.println("Hello, and welcome to SQA Selenium Boot Camp");
	 	System.out.println("Could I get your name ");
	 	name = scanner.nextLine();
	 	details = requestUserInfo(name, "age", "city of resedence", "favorite color", "current mood" );
	 	outputUserDetails(name);
	 	exitApplication();
	 }
	 private static void outputUserDetails(String name) {
		// TODO Auto-generated method stub
		
	}

	public static void outputUserdetails(String name) {
	 	System.out.println("\nWell " + name + ", it seems I have learned enough about you. ");
	 	for (int i = userVars.length-1; i > 0; i-- ){
	 		System.out.println("Your " + details[i] + " is " + userVars[i] + ".");
	 	}
	 }
}