package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_2
{
    public static void main(String[] args)
    {
        int i, count=0;
        String sentence;
        char e = 'e' ;
        System.out.println("Enter the text:");
        Scanner x = new Scanner(System.in);
        sentence = x.nextLine();
        for(i=0;i<sentence.length();i++)
            if(sentence.charAt(i)==e)
            {
                count += 1;
                System.out.println("Found at position:" + i);
            }
        System.out.println("Count = " + count);
    }
}
// by thamer hussain
