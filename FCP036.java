import java.util.*;
public class FCP036{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long a=sc.nextInt();
long b=sc.nextInt();
long x=a;
long y=b;
while(b!=0){
long temp=b;
b=a % b;
a=temp;
}
long HCF=a;
long LCM=(x*y)/HCF;
System.out.println(HCF);
System.out.println(LCM);
}
}

