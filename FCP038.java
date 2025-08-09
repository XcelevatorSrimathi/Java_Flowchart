import java.util.*;

public class FCP038 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int M=N;
int sum = 0;
while (N != 0) {
int d = N % 10;
sum = sum + (d * d * d);
N=N/10;
}
if (M==sum){
System.out.println("yes");
}
else{
System.out.println("No");
}}}
