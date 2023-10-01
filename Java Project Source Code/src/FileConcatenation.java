import java.io.*;

public class FileConcatenation {
    public static void main(String[] args) {
        // File paths for input and output
        String inputFile1 = "A.txt";
        String inputFile2 = "B.txt";
        String outputFile3 = "C.txt";
        String outputFile4 = "D.txt";

        try {
            // Read the contents of the first file (A.txt)
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            StringBuilder content1 = new StringBuilder();
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                content1.append(line1);
            }
            reader1.close();

            // Display content of the first file
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("Contents of the first file (A.txt): ");
            System.out.println(content1.toString());

            // Read the contents of the second line (B.txt)
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
            StringBuilder content2 = new StringBuilder();
            String line2;
            while ((line2 = reader2.readLine()) != null) {
                content2.append(line2);
            }
            reader2.close();

            // Display the content of the second file
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("Contents of the second file (B.txt): ");
            System.out.println(content2.toString());

            // Concatenate the contents and save to the third file (C.txt)
            BufferedWriter writer3 = new BufferedWriter(new FileWriter(outputFile3));
            writer3.write(content1.toString());
            writer3.write(content2.toString());
            writer3.close();

            // Display the concatenated contents on the console
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("Contents of the third file (concatenated): ");
            System.out.println(content1.toString() + content2.toString());

            // Count the number of characters in the third file and display the total count
            int charCount = content1.length() + content2.length();
            System.out.println("\n");
            System.out.println("Number of characters in the third file: ");
            System.out.println(charCount);

            // Save the square of the character count in the fourth file (D.txt)
            BufferedWriter writer4 = new BufferedWriter(new FileWriter(outputFile4));
            writer4.write(String.valueOf(charCount * charCount));
            writer4.close();

            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("Square of the character count saved in the fourth file.");
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            e.printStackTrace();
        }
    }
}
