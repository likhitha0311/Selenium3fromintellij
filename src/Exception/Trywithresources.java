package Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Trywithresources {
    public static void main(String[] args) {
        try {
            // getData();
            getOptimisedData();
            readData();
        } catch (Exception e) {
        }
    }

    private static void getData() {
        Scanner scanner = null;
        FileWriter fileWriter = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Please enter the data");
            String[] data = scanner.nextLine().split(" ");
            System.out.println(Arrays.toString(data));
            fileWriter = new FileWriter("Locations.txt");
            for (String i : data) {
                fileWriter.write(i + " ");
            }
        } catch (IOException io) {
            System.out.println("Am I throwing exception");
        } finally {
            System.out.println("in finally block");
            try {
                if (fileWriter != null) {
                    System.out.println("Attempting to close locfile");
                    fileWriter.close();
                }
            } catch (IOException io) {
                System.out.println("Am I throwing exception");
            }
        }
    }

    private static void getOptimisedData() throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter("Locations.txt");)
        {
            System.out.println("Please enter the data");

                String stringdata = scanner.nextLine();
                String[] data = stringdata.split(" ");
            //String[] data = scanner.nextLine().split(" ");
            System.out.println("Array data "+Arrays.toString(data));
            for (String i : data)
            {
                fileWriter.write(i + " ");
            }

        }
        }



    private static void readData() throws IOException {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader("Locations.txt"));
        ) {
            int count=0;
           while(scanner.hasNextLine())
            {
                count++;
                System.out.println(count);
                System.out.println((scanner.nextLine()));
            }
            //System.out.println("list is "+list);
            System.out.println("#".repeat(10));
        }
    }
}