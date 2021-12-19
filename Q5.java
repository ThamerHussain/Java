package HW_THAMER_HUSSAIN_2_11;

public class Q5
{
    public static void main(String[] args) {
        double c = 100;
        double f = count(c);
        System.out.print("\nthe temperature in celsius is: "+c+"\n");
        System.out.print("\nthe temperature in fahrenheit is: "+f+"\n");
    }
    public static double count(double x)
    {
        return (9.0/5.0)*(x)+32;
    }
}
