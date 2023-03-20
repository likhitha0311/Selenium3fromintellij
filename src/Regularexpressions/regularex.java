package Regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularex {

    public static void main(String[] args)
    {
        String mystring="abcdfcbmgvx 989666?><fschjhhh sdddsvfv";
        String testBlanks="Friends is a great comedy series";
        System.out.println(mystring.replaceAll("^abcd","NewValue")); ;
        System.out.println(mystring.replaceAll("dsvfv^","NewValue")); ;
        System.out.println(mystring.replaceAll("[mv]","MV")) ;
        System.out.println(mystring.replaceAll("[f]","FOX")) ;
        System.out.println(mystring.replaceAll("[bcfm][csg]","FOX")) ;
        System.out.println("Payal".replaceAll("[Pp]ayal","Payal")) ;
        System.out.println("PAyal".replaceAll("P[aA]yal","Payal")) ;
        System.out.println(mystring.replaceAll("[^fc]","Q")); ;
        System.out.println(mystring.replaceAll("[^mv]","Q")); ;
        System.out.println(mystring.replaceAll("\\w","Q")); ;
        System.out.println(mystring.replaceAll("\\W","Q")); ;
        System.out.println(testBlanks.replaceAll("\\b","L")); ;

        //Quantifier
        String newString = "abcDeeeeeeehhhjiiiijjjjhhiijj67890";
        //should match with abcd followed by 3 e's
        System.out.println(newString.replaceAll("^abcDe{3}","L"));
        //If it does not matter how many e's , just replace till how many ever e's are there
        System.out.println(newString.replaceAll("^abcDe+","L"));
        //If it does not matter whether it is followed by e or not then use *
        System.out.println(newString.replaceAll("^abcDe*","L"));
        //If user is allowed to enter anywhere between 2 and 5 e's its a match
        System.out.println(newString.replaceAll("^abcDe{2,4}","L"));//if input=abcDefghh then it will fail because we have only 1 e here.

        System.out.println(newString.replaceAll("h+i*j","RU"));

        //Groups
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";//here we have 3 groups, tags and the text within the tags
        Pattern h2TextPatten = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));//i only want to extract text withing tags
        }

//Give me the list of all t occurences that is not followed by v
        String tvtest ="tvttsktdtvt";
        String exp = "t[^v]";//Note when caret is inside [] it is used as negation
        Pattern tvpattern = Pattern.compile(exp);
        Matcher tvmatch =tvpattern.matcher(tvtest);

        while(tvmatch.find())
        {
            System.out.println("Occurence :"+tvmatch.start()+" to "+tvmatch.end());
        }

//note in the above code we should be getting 4 output but we are missing on last t, it will consider only the
        //t occurences that is not followed by v, not t occurences that is not followed by any charcater
        //to fix this, we need to go for look ahead
        String tvtestlook ="tvttsktdtvt";
        String explook = "t(?!v)";//Note when caret is inside [] it is used as negation
        Pattern tvpatternlook = Pattern.compile(exp);
        Matcher tvmatchlook =tvpattern.matcher(tvtest);

        while(tvmatchlook.find())
        {
            System.out.println("Occurence :"+tvmatchlook.start()+" to "+tvmatchlook.end());
        }

        //regular expression to validate US phone number
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));



    }
}