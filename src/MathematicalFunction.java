@FunctionalInterface
public interface MathematicalFunction
{
  public double limitZero = 0.0000001d;
  public double epsilon = 0.0000d;
  
  public double function ( double x );
  
  public default double derivation ( double x )
  {
    return ( function ( x + limitZero ) - function(x) ) / limitZero;
  }
  
  public default double zeroPoints (double x)
  {
    
    while ( Math.abs(function(x)) > epsilon )
    {
      x = x - function(x) / derivation(x);
    }
    
    return x;
  }
}
