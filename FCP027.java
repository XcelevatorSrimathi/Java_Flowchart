import java.util.*;
public class FCP027{
public static void main(String[]args){
Scanner sc= new Scanner (System.in);
int N=sc.nextInt();
int i=1;
double sum=0;
while(i<=N){
sum=(sum+(1.0/i));
i++;
}
System.out.println((double)(sum));
}}


