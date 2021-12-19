package HomeWork_2_11;

import java.util.Scanner;
public class HomeWork_2_11_6
{
    public static void main(String[] args)
    {
        int i;
        String vowel_character = "aeiuoAEUIO";
        Scanner x = new Scanner(System.in);
        String s;
        char ch;
        System.out.print("Enter the character:   ");
        s = x.next();
        ch = s.charAt(0);
        i = vowel_character.indexOf(ch);
        if(i>=0)
            System.out.print("\t\t\t\t\t\tthe character is a vowel");
        else
            System.out.print("\t\t\t\t\t\tthe character is a consonant");

    }
}
