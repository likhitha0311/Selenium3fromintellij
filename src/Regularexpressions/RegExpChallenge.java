package Regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpChallenge
{
    public static void main(String[] args)
    {
        String challenge1="I want a bike.";
        String challenge2="I want a ball.";
//Challenge 1-write a regular expression that matches both the statemnets.
        String expression = "I want a b\\w+.";//contains 1 or more any charatecr a-zA-Z0-9and underscore
        System.out.println(challenge1.matches(expression));;//1 way

        //Uisng patterns
        Pattern pattern =Pattern.compile(expression);
        Matcher matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());;//2nd way

        //third way using groups
        String regExp = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp));

        //Challenge 2- replace all blank with _
        String blanks="replace all blank with underscore";
        System.out.println(blanks.replaceAll(" ","_"));;
        //2nd way
        System.out.println(blanks.replaceAll("\\s","_"));;

        //Challenge3 - write a regular expression that matches string in its entirety
        String expression1 = "aaabcccccccccdddeeefff";
        String exp1pattern = "^a{3}b{1}c{9}d{3}e{3}f{3}$";
        System.out.println(expression1.matches(exp1pattern));
        //2nd way
        System.out.println(expression1.matches("[a-f]+"));

        //Challenge4 - write a regular expression that matches series of letters and a . and  series of numbers
        String expression4 = "abcd.1234";
        String rege = "^[a-z]{4}[\\.]{1}[0-9]{4}$";
        System.out.println(expression4.matches(rege));

        //2nd way
        System.out.println(expression4.matches("^[A-Z][a-z]+\\.\\d+$"));//always remember +means one or more letters/digits can appear.
        //always remember * means zero or more letters/digits can appear.

        //Challenge 8-use groups to find numbers
        String challenge8="abcd.135uvqz.7tzik.999";
        String regularexp = "[A-Za-z]+\\.(\\d+)";//here we are interested in part of the string not full string so no caret and $
        Pattern ispattern =Pattern.compile(regularexp);
        Matcher matchers = ispattern.matcher(challenge8);
        while(matchers.find())
        {
            System.out.println("Ocurrence "+matchers.group(1));
        }

        //Challenge 9-use groups to find numbers concatenated with whitespaces
        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";
        String regularexp9 = "[A-Za-z]+\\.(\\d+)\\s";//here we are interested in part of the string not full string so no caret and $
        Pattern ispattern9 =Pattern.compile(regularexp9);
        Matcher matchers9 = ispattern.matcher(challenge9);
        while(matchers9 .find())
        {
            System.out.println("Ocurrence "+matchers9.group(1));
        }

        ////Challenge 10-exract data in curly braces
        String challenge10="{0,2},{0,5},{1,2},{2,3},{2,3},{2,6}";
        String groupnumbers = "(\\d[,]\\d)";
        Pattern ispattern10 =Pattern.compile(groupnumbers);
        Matcher matchers10 = ispattern10.matcher(challenge10);
        while(matchers10.find())
        {
            System.out.println("Ocurrence "+matchers10.group(1));
        }

        //2nd way
        String alternate = "\\{(.)\\}";//we are telling give me anythig that is withing curly braces, we are using es
        //cape sequence because{} are used with quantifiers . I can also write "\\{(.+?)\\}" ->1 or more accurence of any character, question mark is for lazy retrieving
        Pattern pattern10 =Pattern.compile(alternate);
        Matcher matcher10 = ispattern10.matcher(challenge10);
        while(matcher10.find())
        {
            System.out.println("Ocurrence "+matcher10.group(1));
        }
        System.out.println("^".repeat(10));
        String alternate1 = "\\{(.+)\\}";
        Pattern pattern101 =Pattern.compile(alternate1);
        Matcher matcher101 = ispattern10.matcher(challenge10);
        while(matcher101.find())
        {
            System.out.println("Ocurrence "+matcher101.group(1));
        }

        System.out.println("^".repeat(10));
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }

        //Challenge 12-match 5 digit zip code
        String zip="11111";
        System.out.println(zip.matches("^\\d{5}$"));

        //Challenge 13-match 5 digit zip code- and 5 numbers again
        String zipcode="11111-11111";
        System.out.println(zipcode.matches("^\\d{5}[-]{1}\\d{5}$"));

        //make second part of Challenge 13 optional(5 numbers again after dash optional)
        //it should accept 5 digit zip code or 10 digit zip code
        String zipcodeagain="11111-11111";
        System.out.println(zipcodeagain.matches("^\\d{5}([-]{1}\\d{5})?$"));//
        //we have put optional part in group and ? says there can be 0 or 1 occurence of group

    }
}