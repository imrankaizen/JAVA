import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		float a,b;
		System.out.print("Enter first Floating Point Number: "); 
		a = Float.parseFloat(br.readLine());
		System.out.print("Enter Second Floating Point Number: "); 
		b = Float.parseFloat(br.readLine());
		System.out.format("Product %.2f x %.2f = %.3f", a, b, a*b);
	}
}
