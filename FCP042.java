import java.util.*;
public class FCP042{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
long N=sc.nextLong();
long A=0;
long B=1;
long count=1;
long sum=0;
while(count<=N){
System.out.println(A);
sum=A+B;
A=B;
B=sum;
count=count+1;
}
}
}