package lab1;

public class q6 {

static int SquarSumDiff(int n){

int l, k, m;

	l = (n * (n + 1) * (2 * n + 1)) / 6;
	

	k = (n * (n + 1)) / 2;
	
	k = k * k;
	
	m = Math.abs(l - k);
	
	return m;

}


public static void main(String s[])
{
	int n = 6;
	System.out.println(SquarSumDiff(n));	
	
}
}