import java.util.*;
public class FCP015{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int max=0;
if(a>b){
if(a>c){
if(a>d){
max=a;
}else{
max =d;
}
}else {
if (c>d){
 max =c;
}else {
max =d;
} }
}else {
if (b>c){
if (b>d){
max = b;
}else {
max = d;
}
}else {
if (c>d){
max = c;
}else {
max = d;
}}}
System.out.println(max);
}}

   
