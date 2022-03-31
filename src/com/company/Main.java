package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Enter your Text: ");
        Scanner in = new Scanner(System.in);

        String origString = in.nextLine();
        int length = origString.length();
        origString=origString.toLowerCase();

        boolean IsThisPalindrom = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex))
            {
                System.out.println("String is not a palindrome.");
                IsThisPalindrom = false;
                break;
            }
        }

        if(IsThisPalindrom)
        {
            System.out.println("String is a palindrome.");
        }

    }


}
