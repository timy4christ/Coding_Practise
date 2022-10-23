import java.util.Scanner;

class ProblemOfNextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter you age: ");
		int age = sc.nextInt(); // leaves \n in the buffer

		System.out.print("Enter you college: ");
		String collgName = sc.nextLine(); // takes \n as the input

		System.out.println("Name: " + age);
		System.out.println("College Name: " + collgName);

	}
}