package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_4
{
    public static void main(String[] args)
    {
        String sentence;
        System.out.print("Enter the text with e:  ");
        Scanner x = new Scanner(System.in);
        sentence = x.nextLine();
        String new_sentence = sentence.replaceAll("[e]", "");
        System.out.print("\nthe text without e is:  ");
        System.out.println(new_sentence);
    }
}
// by thamer hussain