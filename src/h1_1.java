import java.util.Scanner;
import java.lang.Math;
public class h1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble();
        double R = sc.nextDouble();
        double W = V*V/R;
        double dBm = 10*Math.log10(W) + 30;
        System.out.println("dBm is "+dBm);

    }
}
