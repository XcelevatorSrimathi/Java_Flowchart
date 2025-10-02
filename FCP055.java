import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N];
for (int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
int target=sc.nextInt();
boolean value=false;
for(int i=0;i<N;i++){
if(arr[i]==target){
value = true;
break;

}
}

if(value==true){
System.out.println("Yes");
}else{
System.out.println("No");
}}}
