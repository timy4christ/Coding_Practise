import java.io.*;

class TryWithResources {

	public static void main(String args[]) throws IOException {
		try (FileReader fr = new FileReader("input.txt");
				PrintWriter pw = new PrintWriter("output.txt")) {

			// fr = new FileReader("input.txt"); // is error as the resources treated
			// implicitly as final
			System.out.println("Try block on its own");
		}

	}
}