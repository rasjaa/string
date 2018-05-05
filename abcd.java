//# string
//# string program
import java.util.*;

public class abcd
{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[2];
		for(int i = 0;i < 2;i++)
		{
			a[i] = sc.nextInt();
		}
		String s1=sc.next();
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int a1=a[1];
		char q='1';
		for(int j=0;j<a1;j++)
		{
			int k=sc.nextInt();
			c2[k]=q;
			if(Arrays.equals(c1,c2))
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	}
}
