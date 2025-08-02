import java.util.*;

public class FCP019{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int a =sc.nextInt();
double d =0;

if (a <=50) {
d=a*0.50;
}else 
if (a<=150) {
d = (50 * 0.50) + ((a- 50) * 0.75);
}else
if (a <= 250) {
d= (50*0.50)+(100*0.75) +((a-150) *1.20);
}else {
d=(50*0.50)+(100*0.75) +(100*1.20)+((a-250)*1.50);
}
double result=d*0.20;
d=d+result;
System.out.println(d);
}
}
