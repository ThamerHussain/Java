package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_5
{
    public static void main(String[] args)
    {
        int i ;
        String sentence;
        System.out.print("Enter the sentence:  ");
        Scanner x = new Scanner(System.in);
        sentence = x.nextLine();
        System.out.print("the reverse sentence is:  ");
        for(i=sentence.length()-1;i>=0;i--)
            System.out.print(sentence.charAt(i));
    }
}
// by thamer hussain