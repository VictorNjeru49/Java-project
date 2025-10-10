
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

        String filepath = "test.txt";
        String textContent;

        try(FileWriter writer = new FileWriter(filepath)) {
            try(Scanner scanner = new Scanner(System.in)){
                System.out.print("Enter your text: ");
                textContent = scanner.nextLine();
            }
            writer.write(textContent);
            System.out.println("File has been written!");

            try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                String line;
                while((line =  reader.readLine()) != null){
                    System.out.println(line);
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("Could not locate the file location");
        }catch(IOException e){
            System.out.println("Could not write a file");
        } 
    }
}
