import java.util.*;
public class FCP018{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
double HRA=0;
double DRA=0;
if(s<=10000){
HRA=s*0.2;
DRA=s*0.8;
}
else{
if(s<=20000){
HRA=s*0.25;
DRA=s*0.9;
}
else{
HRA=s*0.3;
DRA=s*0.95;
}
}
System.out.println((int)(s+HRA+DRA));
}
}









