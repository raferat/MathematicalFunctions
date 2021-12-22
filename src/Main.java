public class Main
{
  public static MathematicalFunction myfunc = (double x)->
  {
    //return factorial(x-8);
    return Math.sin(x) / Math.cos(x) + 9;
    //return ( x*x) - 5*x;
  };
  
  public static MathematicalFunction myfunc2 = (double x)->
  {
    return (( x*x+Math.sqrt(x) ) / Math.pow ( x , -x * 18  )) - 1;
  };
  
  public static double factorial ( double x )
  {
    double result = x == 0 ? 1 : x ;
    while ( --x > 0 )
    {
      result *= x;
    } 
    
    return result;
  }
  
  public static void main(String[] args)
  {
    System.out.println(myfunc.derivation(1));
    System.out.println(myfunc.function(1));
    System.out.println ( myfunc.zeroPoints(1));
    /*System.out.println(x);
    System.out.println(myfunc.function(x));*/
    
  }
  
}
