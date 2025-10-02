import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
int evensum=0;
int oddsum=0;
for(int i=0;i<N;i++){
if(arr[i]%2==0){
evensum=evensum+arr[i];
}
else{
oddsum=oddsum+arr[i];
}}
System.out.println(oddsum);
System.out.println(evensum);
}}


