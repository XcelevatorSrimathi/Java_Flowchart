
import java.util.*;
public class FCP003{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int temp;
temp = a;
a = b;
b = temp;
System.out.println("After swapping:");
System.out.println("a = " + a);
System.out.println("b = " + b);
}
}
