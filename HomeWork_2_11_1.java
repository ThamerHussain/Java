package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_1
{
    public static void main(String[] args)
    {
        int i;
        String sentence;
        String[] words;
        System.out.print("Enter the sentence:  ");
        Scanner x = new Scanner(System.in);
        sentence = x.nextLine();
        words = sentence.split("[ ]");
        System.out.println("the sentence after split is:  ");
        for(i=0;i<words.length;i++)
            System.out.println("\t\t\t\t\t\t\t\t" + words[i]);

    }
}
// by thamer hussain
