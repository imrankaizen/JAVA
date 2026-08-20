import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q13 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        float p, t, r;
        double ci;
        System.out.println("Calculating Compound Intrest Enter [PRT]:- ");
        System.out.print("Enter Principal Amount: ");
        p = Float.parseFloat(br.readLine());
        System.out.print("Enter Time : ");
        t = Float.parseFloat(br.readLine());
        System.out.print("Enter Rate: ");
        r = Float.parseFloat(br.readLine());
        ci = p * Math.pow((1 + r / 100.0), t);
        System.out.format(
                "If || Principal Amount is %.3f | Rate is %.3f | Time is %.3f ||\nThen || COMPOUND INTREST is %.4f ||",
                p, r,
                t, ci);
        br.close();
    }
}
