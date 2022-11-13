
public class Trignometry_functions {
	public static final double PI = 3.14159265358979323846; 

	public static double roundOff(double input)
    {
        double a = input;
        double temp = power(10.0, 5);
        a *= temp;
        a = Math.round(a);
        return (a / (double)temp);
    }
	 public static double power(double base, int power)
	    {
	        double value=1;

	        if(power == 0)
	            return 1;

	        for(int i=1; i<=power; i++)
	            value = value * base;

	        return value;

	    }
	    


	 public static double factorial(int number) throws Factorial_Exception
	    {
	        double value=1;

	        if(number < 0) {
	            throw new Factorial_Exception("Factorial of negative number cannot be found");
	        }
	        else {
	            for(int i=2; i<=number; i++)
	            {
	                value = value*i;
	            }
	        }

	        return value;
	    }
	 public static double degree_to_Radian (double degree) {
	        return (degree * PI)/ 180 ;
	    }

	   
	    public static double radian_to_Degree (double radian) {
	        return (radian * 180)/ PI ;
	    }
	   
	   
	 
    public static double sine(double angle ) throws Factorial_Exception{
        double sin=0;
        double normalizedAngle = normalize_Radian(angle);

        for(int i=1;i<=11;i++)
        {
            sin = sin + (power(-1, i-1)*
                    power(normalizedAngle, (2*i)-1)/factorial((2*i)-1));
        }

        return roundOff(sin);
    }
    
    public static double cosine(double angle) throws Factorial_Exception{
    	double cos=0;
		double normAngle = normalize_Radian(angle);
				
		for(int i=0;i<=10;i++)
		{
			cos=cos+(power(-1,i)*power(normAngle,2*i))/(factorial(2*i));
		}
		
		return roundOff(cos);
    }


    public static double tangent(double angle) throws Factorial_Exception, Tangent_Exception{
      if(cosine(angle)==0) {
    	  throw new Tangent_Exception("Not Defined");
      }
    	return roundOff(sine(angle) / cosine(angle));
    }
    

    
    public static double normalize_Radian (double angle) {
        return angle % (2*PI);
    }


   
    
   
    }
