import java.util.*;
public class FCP025{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int sum=0;
int i=1;
while(i<=N){
if(i%2!=0){
sum=i+sum;
}
i++;
}
System.out.println(sum);
}}

