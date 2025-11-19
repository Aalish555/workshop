
public class defaultvalues
{
        byte a;
        int b;
        short c;
        long d;
        float e;
        double f;
        char g;
        String h;
    public static void main(String[] args)
    {
        defaultvalues dft= new defaultvalues();
        System.out.println(dft.a);
        System.out.println(dft.b);
        System.out.println(dft.c);
        System.out.println(dft.d);
        System.out.println(dft.e);
        System.out.println(dft.f);
        System.out.println(dft.g);
        System.out.println(dft.h);
        //this wouldnot work for local variables because java doesnot assign default values to local variables.
    }
    
}