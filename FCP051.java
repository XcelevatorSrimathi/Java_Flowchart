import java.util.*;
public class FCP051{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
while(N>=10){
int A=0;
int B=0;
while(N>0){
A=N%10;
B=B+A;
N=N/10;
}
N=B;
}
System.out.println(N);
}}
