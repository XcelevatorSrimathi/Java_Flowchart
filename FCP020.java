import java.util.*;
public class FCP020{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();

int max = a;
if (b > max)
max = b;
if (c > max)
max = c;
if (d > max)
max = d;

int secondmax = a;
if (secondmax == max)
secondmax = b;
if (secondmax == max)
secondmax = c;
if (secondmax == max)
secondmax = d;
if (a!= max) {
if (a> secondmax)
secondmax = a;
 } if (b!= max) {
 if (b > secondmax)
 secondmax = b;
}if (c!= max) {
 if (c> secondmax)
  secondmax = c;
}if (d!= max) {
 if (d> secondmax)
secondmax= d;
}System.out.println(secondmax);
}
}
