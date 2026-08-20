import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q6{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a,b;
		System.out.print("Enter First Number: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number: ");
		b = Integer.parseInt(br.readLine());
		System.out.printf("\n\nAddition of %d + %d = %d", a,b,a+b);
		br.close();
	}
}