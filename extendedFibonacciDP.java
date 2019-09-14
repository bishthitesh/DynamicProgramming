/*
* Print the nth element in this series where each element is the sum of the three preceding numbers*/
import java.util.ArrayList;
import java.util.Scanner;
public class extendedFibonacciDP {
    static int fib(int n) {
        ArrayList<Integer> fibSeries =new ArrayList<>();
        fibSeries.add(0);
        fibSeries.add(1);
        fibSeries.add(2);
        int a=fibSeries.get(0);
        int b=fibSeries.get(1);
        int c=fibSeries.get(2);
        for (int i=3;i<=n;i++){
            fibSeries.add(a+b+c);
           a=b;
           b=c;
           c=fibSeries.get(i);
        }
        return fibSeries.get(n-1);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}
