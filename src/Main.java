public class Main
{
  public static MathematicalFunction myfunc = (double x)->
  {
    return ( x*x) - 5*x;
  };
  
  public static MathematicalFunction myfunc2 = (double x)->
  {
    return (( x*x+Math.sqrt(x) ) / Math.pow ( x , -x * 18  )) - 1;
  };
  
  public static void main(String[] args)
  {
    System.out.println(myfunc.derivation(1));
    System.out.println(myfunc.function(1));
    System.out.println ( myfunc.zeroPoints(10));
    /*System.out.println(x);
    System.out.println(myfunc.function(x));*/
    
  }
  
}
