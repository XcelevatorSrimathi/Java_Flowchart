import java.util.*;
public class FCP048{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
for(int i=M;i<=N;i++){
int num=i;
int d=0;
int temp=num;
while(temp>0){
d=d+1;
temp=temp/10;
}
temp=num;
int sum=0;
while(temp>0){
int k=temp%10;
int l=1;
for(int j=0;j<d;j++){
l=l*k;
}
sum=sum+l;
temp=temp/10;
}
if(sum==num){
System.out.println(num);
}
}
}
}
