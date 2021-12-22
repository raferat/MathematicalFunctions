@FunctionalInterface
public interface MathematicalFunction
{
  public double limitZero = 0.0000001d;
  public double epsilon = 0.0001d;
  
  public double function ( double x );
  
  public default double derivation ( double x )
  {
    return ( function ( x + limitZero ) - function(x) ) / limitZero;
  }
  
  public default double derivation ( double x , double functionX )
  {
    return ( function ( x + limitZero ) - functionX ) / limitZero;
  }
  
  public default double zeroPoints (double x)
  {
    
    double y = 0;
    while ( Math.abs( y = function(x)) > epsilon )
    {
      x = x - y / derivation(x , y);
      
    }
    
    return x;
  }
}
