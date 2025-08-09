import java.util.*;
public class FCP032{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int C=0;
for(int A=1;A<=N;A++){
if(N%A==0){
C++;
}
}
if(C==3){
System.out.println("Yes");
}else{
System.out.println("No");
}}}


