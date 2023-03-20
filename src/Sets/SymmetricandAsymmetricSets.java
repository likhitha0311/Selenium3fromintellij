package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricandAsymmetricSets
{
    public static void main(String[] args) {
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] naturewords = {"nature", "is", "beautiful","to"};
        String[] divinewords = {"to", "error", "human", "divine"};
        nature.addAll(Arrays.asList(naturewords));
        divine.addAll(Arrays.asList(divinewords));
        System.out.println(nature);
        System.out.println(divine);
        System.out.println("*".repeat(30));
        Set<String> diff1 = new HashSet<>(nature);
        Set<String> diff2 = new HashSet<>(divine);
        System.out.println("nature to divine");
        diff1.removeAll(divine);//watever is there in bracket, remove common elements
        printSet(diff1);
        System.out.println("*".repeat(30));

        System.out.println("divine to nature");
        diff2.removeAll(nature);//watever set is there in bracket, remove common elements
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        Set<String> intersectionTest = new HashSet<>(nature);
        System.out.println("*".repeat(30));
        unionTest.addAll(divine);//add all elements without duplicates
        printSet(unionTest);
        System.out.println("*".repeat(30));
        intersectionTest.retainAll(divine);//Retain the common elements betwee both
        printSet(intersectionTest);

        System.out.println(unionTest.containsAll(intersectionTest));//brackets should be a subset of the one in left.
    }

    private static void printSet(Set<String> set)
    {
        for(String i:set)
        {
            System.out.println(i);
    }
}}