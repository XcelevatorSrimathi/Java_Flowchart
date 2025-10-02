import java.util.*;
class FCP061{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int arr[]=new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
if(arr[i]!=-1){
int c=1;
for(int j=i+1;j<N;j++){
if(arr[i]==arr[j]){
c=c+1;
arr[j]=-1;
}
}
System.out.println(arr[i]+"-"+c);
}
}
}
}
