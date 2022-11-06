// Program 8: Print factorial of a number using parameterized recursion
// parameterized recursion is used to make the function just do the work and also print it through the function

import java.util.*;

class P8 {

	static void fact(int n, int prod) {

		if (n == 1) {
			System.out.println(prod);
			return;
		}

		fact(n - 1, prod * n);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fact(n, 1);

	}
}