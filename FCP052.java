import java.util.*;
public class FCP052{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[]elements=new int[N];
	for(int i=0;i<N;i++){
		elements[i]=sc.nextInt();
	}
	for(int i=0;i<N;i++){
		System.out.println(elements[i]);
	}
}
}

