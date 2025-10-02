import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
int M=sc.nextInt();
M=M%N;
for (int R=0;R<M;R++){
int F=arr[0];
for(int i=0;i<N-1;i++){
arr[i]=arr[i+1];
}
arr[N-1]=F;
}
for(int i=0;i<N;i++){
System.out.println(arr[i]);
}}}
