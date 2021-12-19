package HW_THAMER_HUSSAIN_2_11;

public class Q3
{
    public static void main(String[] args) {
        float k = 1, n = 2, g = 3, d = 4, m = 5;
        float x = count(k, n, g, d, m);
        System.out.print("\nthe average of the five numbers is "+x+"\n");
    }
    public static float count(float v, float w, float x, float y, float z)
    {
        float a;
        a = (v+w+x+y+z)/5;
        return a;
    }
}
