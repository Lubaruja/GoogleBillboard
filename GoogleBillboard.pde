public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
double answer;
public void setup()  
{            
     noLoop(); 
}  
public void draw()  
{   
	for (int k=2; k<e.length()-10; k++)
     {
     	String digits = e.substring(k, k+10);
     	double nums = Double.parseDouble(digits);
     	
     	if (isPrime(nums)==true)
     	{
     		answer=nums;
     		System.out.println("answer: "+digits);
     	}
     	// else
     	// {
     	// 	answer=0;
     	// }
     	// System.out.println("answer: "+answer);
     }


}  
public boolean isPrime(double num)
{
boolean moop=true;

if (num>=2)
{
  moop=true;
  for (int j=2; j<=Math.sqrt(num); j++)
  {
  	if (num%j==0)
  	{
    	moop=false;
    	return false;
  	}
  	else
  	{
  		moop=true;
  	}
  }
}
else
{
	moop=false;
}
 	return moop;
}