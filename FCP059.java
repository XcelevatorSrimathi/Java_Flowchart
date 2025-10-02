import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<N-1;i++){
boolean value=false;
for(int j=i+1;j<N;j++){
if(arr[i]==arr[j]){
value=true;
}}
if(value){
System.out.println(arr[i]);



}}}}