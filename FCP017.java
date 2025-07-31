import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int secondmax=0;
    if(a>b){ 
      if(a<c){
        secondmax =a;
       } else {
        if(b>c){
       secondmax=b;
        } else{
       secondmax=c;
      }}
        } else { 
       if(a<=b){
       if (b<c) {
      secondmax=b;
      } else {
       if (a>c) {
       secondmax=a;
       }else{
       secondmax=c;
      }}}
       System.out.println(secondmax);
    }
   }
  }

