# File_Concatenator
This is a Java console based project created to concatenate the content of two files and store the result in a third file, count the concatenated characters and store it's square in the third file.

## Installation

Follow these steps to install and run the application:

1. **Prerequisites:** Ensure that you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your computer.

2. **Download the Application:**

   - Download the `FileConcatenation.java` source file from this repository.

3. **Compile the Application:**

   - Open your terminal or command prompt.

   - Navigate to the directory where you downloaded `FileConcatenation.java`.

   - Compile the Java source code by running the following command:

     ```bash
     javac FileConcatenation.java
     ```

   - This will create a compiled Java class file named `FileConcatenation.class`.
  
4. **Run the Application:**

   - To run the application, use the following command:

     ```bash
     java FileConcatenation
     ```

   - Note: Ensure that the two input files are in the same directory as the application and have the following names:
     - `fileA` for the first input file.
     - `fileB` for the second input file.

   - In future updates of the application, you will have the option to specify the file paths directly, allowing for more flexibility in file selection.

5. **Follow On-Screen Instructions:**

   - You would need to include the content of the first file you want to be concatenated to fileA and then the content of the second file      to fileB (whose content will be appended to fileA).

   - The character count of the concatenated file will also be displayed.

   - Additionally, the square of the character count will be saved in a separate file (D.txt).

6. **Review the Output:**

   - Check the contents of the `C.txt` file for the concatenated data, it will also be displayed on the terminal.

   - Review the character count displayed on the screen.

   - Open the `D.txt` file to view the square of the character count.

## Sample Input Files

You can use your own text files as input, or you can create two sample files, `A.txt` and `B.txt`, in the same directory as the application. If you are a developer, you can alter the code tot he best way suitable to you. The code is very simple and clear for anyone who wants to read it.

## License

This project is licensed under the Aptech License.

Happy File Concatenation!
