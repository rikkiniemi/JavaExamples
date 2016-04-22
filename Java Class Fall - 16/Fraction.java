
public class Fraction {
    
    //member variables (attributes, properties)
    private int numerator;
    private int denominator;
    
    //constructors ---->  must be public and name of class
    public Fraction()
    {
        numerator=0;
        denominator=1;
    }
    
    public Fraction(int n, int d)
    {
        setNumerator(n);
        setDenominator(d);
        reduce();
    }
    
    //copy constructor
    public Fraction(Fraction source)
    {
        numerator=source.getNumerator();
        denominator=source.getDenominator();
    }
    
    //get/set methods for numerator and denominator
    public int getNumerator()
    {
        return numerator;
    }
    
    public void setNumerator(int newNumerator)
    {
        numerator=newNumerator;
        reduce();
    }
    
        public int getDenominator()
    {
        return denominator;
    }
    
    public void setDenominator(int newDenominator)
    {
        if( newDenominator==0 ) throw new IllegalArgumentException();
        if( newDenominator < 0 )
        {
            numerator = -numerator;
            denominator = -denominator;
        }
        else denominator=newDenominator;
    }
    
 
    //Utility methods
    private int gcd(int n, int d)
    {
        int a=n, b=d;
        while ( b!=0 )
        {
            int r = a%b;
            a=b;
            b=r;
            
        }
        return a;
    }
    
    private void reduce()
    {
        //Reduces our fraction if possible
        int _gcd=gcd(numerator, denominator);//find the gcd
        numerator /=_gcd;
        denominator /=_gcd;
    
    }
    
    public double value()
    {
        
        return numerator / (double)denominator;
    }
    
    @Override
    public String toString()
    {
        return numerator+" / "+denominator;
    }
    
    public Fraction add(Fraction f2)
    {
        int a = numerator; //numerator of our fraction object
        int b = denominator; //denominator of our fraction object
        int c = f2.getNumerator(); //numerator of f2 argument
        int d = f2.getDenominator(); //denominator of f2 argument
        
        return new Fraction( a*d+b*c, b*d);
    }
    
        public Fraction subtract(Fraction f2)
    {
        int a = numerator; //numerator of our fraction object
        int b = denominator; //denominator of our fraction object
        int c = f2.getNumerator(); //numerator of f2 argument
        int d = f2.getDenominator(); //denominator of f2 argument
        
        return new Fraction( a*d-b*c, b*d);
    }
        
}
