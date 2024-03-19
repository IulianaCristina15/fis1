class Complex
{
    private double real,imaginar;
    private static int contor;
    
    public Complex(double re,double img)
    {
    real=re;
    imaginar=img;
    }
    
    public double Modul()
    {
    return Math.sqrt(real*real+imaginar*imaginar);
    }
    
    public void Afisare()
    {
    contor++;
    System.out.println(real+"+i*"+imaginar);
    }
    
    public Complex sum(Complex nr2)
    {
    Complex nr3 =new Complex(this.real+nr2.real, this.imaginar+nr2.imaginar);
    return nr3;
    }

    public static int AfisareContor()
    {
    return contor;
    }
}
class Main
{
    public static void main(String args[])
    {
    Complex nr1=new Complex(7,20);
    nr1.Afisare();
    
    Complex nr2=new Complex(12,3);
    nr2.Afisare();
    
    //System.out.println(Modul());
    (nr1.sum(nr2)).Afisare();
    System.out.println();
    System.out.println(" s-au afisat pe ecran " + Complex.AfisareContor()+" numere ");
    }
}
