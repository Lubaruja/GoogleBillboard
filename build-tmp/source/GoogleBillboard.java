import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
