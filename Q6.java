package HW_THAMER_HUSSAIN_2_11;

public class Q6 {
    public static void main(String[] args) {
        String x = "*";
        String d = draw(x);
        System.out.print(d);
    }
    public static String draw(String a)
    {
        return    "\n       "+a+"       \n"+"      "
                           +a+a+a+"      \n"+"     "
                         +a+a+a+a+a+"      \n"
                +"    "+a+a+a+a+a+a+a+"      \n";
    }
}
