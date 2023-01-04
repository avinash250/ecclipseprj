package javaarray;
import java.util.*;

public class bunty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tr=0;
		int sum=0;
		int search=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		for (int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			System.out.println("the value "+ a[i]);
		    sum=sum+a[i];
		    if(search==a[i])
	            tr=1;
		}
		System.out.println("sum of the elemens of array are "+sum);
		System.out.println("Average of the elements pf aray are "+((sum)%a.length));
	    if(tr==1)
	    	System.out.println("NUmber found");
	    else
	    	System.out.println("nUMBER NOT FOUND");
	    int min=a[0];
	    int max=0;
	    for (int i=0;i<a.length;i++)
	    {
	    	if(a[i]<=min)
	    		min=a[i];
	    	if(a[i]>=max)
	    		max=a[i];
	    }
	    System.out.println("MIN=" +min);
	    System.out.println("MAX="+max);
	    
	}
	
}
