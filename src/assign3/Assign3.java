/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assign3;

/**
 *
 * @author lynne
 */
import java.io.*;
import java.util.*;
public class Assign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //creating two maps
        Map<String, Integer> customers = new HashMap<>(); 
        Map<String, Integer> products = new HashMap<>(); 
        
        //created a file object to make the file to read from
        File file1 = new File("src/assign3/Sales.txt"); 
        
        //reading the file
        try(BufferedReader buff = new BufferedReader(new FileReader(file1)))
        {
            String line;
            String[] parts;
            //read the file till the ends
            while ((line = buff.readLine()) != null)
            {
                //spliting each line into an array
                parts = line.split(" ");
                
                String CustomerID = parts[0];
                String FirstName = parts[1];
                String LastName = parts[2];
                String ProductID = parts[3];
                String ProductName = parts[4];
                String SingleItemPrice = parts[5];
                String ItemsPurchased = parts[6];
                
                //printing for visual purposes can delete if not needed
                System.out.println("CustomerID: " + parts[0]);
                System.out.println("FirstName: " + parts[1]);
                System.out.println("LastName: " + parts[2]);
                System.out.println("ProductID: " + parts[3]);
                System.out.println("ProductName: " + parts[4]);
                System.out.println("SingleItemPrice: " + parts[5]);
                System.out.println("ItemsPurchased: " + parts[6]);
                System.out.println("=====================");
               
            }   
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found: " + e);
        }
            //User can choose if they want to insert a new sale record.
            Scanner input = new Scanner(System.in);
            System.out.print("Do you want to insert a new sale record? (yes or no): ");
            String choice = input.nextLine();

            //If user inputs "yes", let user insert information below.
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter CustomerID: ");
                String CustomerID = input.nextLine();

                System.out.print("Enter First Name: ");
                String FirstName = input.nextLine();

                System.out.print("Enter Last Name: ");
                String LastName = input.nextLine();

                System.out.print("Enter ProductID: ");
                String ProductID = input.nextLine();

                System.out.print("Enter Product Name: ");
                String ProductName = input.nextLine();

                System.out.print("Enter One item's Price: ");
                String SingleItemPrice = input.nextLine();

                System.out.print("Enter Items Purchased: ");
                String ItemsPurchased = input.nextLine();

            // appending the new record to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1, true))) {
                    writer.newLine();
                    writer.write(CustomerID + " " + FirstName + " " + LastName + " " + ProductID + " " +
                                ProductName + " " + SingleItemPrice + " " + ItemsPurchased);
                    System.out.println("Record inserted successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e);
                }
                //If user inputs "no", it prints this message.
            } else {
            System.out.println("No new record inserted to file.");
        }
    
    }
}
