class Persist {
public static int persistence(long n) {
		// your code
		long mul=1,no=0;
		int c=0;
		while(n>=10)
		{
		 boolean b=true;
		 no=n;mul=1;
			if(b)
			{
			  c+=1;b=false;
			}
			while(no>=10)
			{
				mul*=no%10;
				no/=10;
				
			}
			mul*=no;
			n=mul;
		}
		
		return c;
    }
}
