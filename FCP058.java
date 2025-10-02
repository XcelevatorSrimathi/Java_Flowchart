import java.util.*;
public class FCP058{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N+1];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
int M=sc.nextInt();
int X=sc.nextInt();
for(int i=N;i>M-1;i--){
arr[i]=arr[i-1];
}
arr[M-1]=X;
for(int i=0;i<N+1;i++){
System.out.println(arr[i]);
}}}





