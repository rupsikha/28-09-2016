public class Solution3 {
	public int sumInt(int a, int b) {
	int i,sum=0;
	for(i=a;i<=b;i++)
	{
	if((i%13==0 || i%15==0 || i%17==0))
	{
		if(i%30!=0)
			sum+=i;
	}
}
	return sum;
}
}
