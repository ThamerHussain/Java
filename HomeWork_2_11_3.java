package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_3
{
    public static void main(String[] args)
    {
        String sentence;
        System.out.print("Enter the text with e :  ");
        Scanner x = new Scanner(System.in);
        sentence = x.nextLine();
        String new_sentence = sentence.replaceAll("[e]", "XYZ");
        System.out.print("\nThe text in which each \"e\" has been replaced by \"XYZ\" is:  ");
        System.out.println(new_sentence);
    }
}
// by thamer hussain