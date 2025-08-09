import java.util.*;

public class FCP033 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int  m = num;
int rev = 0;
while (num != 0) {
int digit = num % 10;
 rev = rev * 10 + digit;
num /= 10;
 }if (m == rev)
System.out.println("YES");
 else
System.out.println("NO");
    }
}
