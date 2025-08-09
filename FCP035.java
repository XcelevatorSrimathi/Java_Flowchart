import java.util.*;

public class FCP035 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long N =sc.nextInt();
long count=0;
for(long i=1;i<= N;i++) {
if(N % i==0) {
count=count+1;
}
}
if (N<=1){
System.out.println("No");
} else if(count==2){
System.out.println("Yes");
} else {
System.out.println("No");
}
}
}
