import java.util.*;
public class Solution5
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int j=s.length();
		int i=0;
		j--;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
			i++;
			j--;
		}
		else break;
	}
	if(i>=j)
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
	}
}
