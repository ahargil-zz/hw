public class Rational{

  /*======================================================================================
  Instance variables for the numerator and denominator
  ======================================================================================*/
  private int _num, _den;
  
  /*======================================================================================
  Default constructor (no parameters)
  Creates a new Rational with the value of 0/1
  ======================================================================================*/
  
  public Rational() {
    _num = 0;
    _den = 1;
  }
  
  /*======================================================================================
  Constructor
  takes 2 parameters, one for the numerator, one for the denominator
  if an invalid denominator is attempted, should print a message and set the number to 0/1
  ======================================================================================*/
  
  public Rational(int num, int den) {
    if (den == 0) {
      System.out.println("Zero is an invalid denomenator");
      _num = 0;
      _den = 1;
    }
    else {
      _num = num;
      _den = den;
    }
  }
  
  /*=======================================================================================
  toString
  returns a string representation of the rational number (formatting of your choice)
  =======================================================================================*/
  
  public String toString() {
    String ret = "";
    ret += _num;
    ret += "/";
    ret += _den;
    return ret; 
  }
  
  public static void main( String[] args ) {
    Rational q = new Rational();
    Rational r = new Rational(2,3); //Stores the rational number 2/3
    Rational s = new Rational(1,2); //Stores the rational number 1/2
    System.out.println("The rational number q is " + q);
    System.out.println("The rational number r is " + r);
    System.out.println("The rational number s is " + s);
  }
}
    
