import java.util.*;
public class FCP050{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
for(int i=2;i*i<=N;i++){
if(N%i==0)
System.out.println(i);
while(N%i==0){
N=N/i;
}}
if(N>1)
System.out.println(N);
}}
