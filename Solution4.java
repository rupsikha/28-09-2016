public class Solution4 {
	public int countLeapYear(int a,int b) {
	int i,sum=0;
	for(i=a;i<=b;i++)
	{
	if(i%4==0 && i%100!=0 || i%400==0)
	{
			sum++;
	}
}
	return sum;
}
}
