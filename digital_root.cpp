//******************************************************************
/*
    Code Author:- Hitesh Bhavsar
    Site: Codewars.com
    Date: 10/03/2019
*/
//******************************************************************
int digital_root(int n)
{
	int cumsum=0;
	while(n>0)
    {
	    	cumsum+= n%10; 
	    	n=n/10;
    }	
	 n=cumsum;
	return n>=10? digital_root(n):n;
}
