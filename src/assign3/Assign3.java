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
            //read the file till the ends
            while ((line = buff.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found: " + e);
        }
    }
    
}
