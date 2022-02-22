/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author 002
 */
public class TestUserprofile {
    public static void main(String[] args) {
        System.out.println("Creating a new profile...");
        System.out.println("Please enter your name:");
        Scanner in = new Scanner(System.in);
        
        // creating a new UserProfile object
        UserProfile obj = new UserProfile();
        obj.setUserID(in.nextLine()); //getting ipnut for user id
        System.out.println(); //for clean output
   
        System.out.println("Choose and enter any genre from the list below:");
        // getting private variable from the UserProfile class
        String[] gen = obj.myGenres();
        // printing the genres
        for (int i=0; i<=gen.length - 1; i++ ){
            System.out.println(gen[i]);
        }
        System.out.println(); // for clean output
        obj.setGenre(in.nextLine()); // getting input for genre
        System.out.println(); // for clean output
        // displaying message that profile was created
        System.out.println("User Prifle has been successfully created!");

    }
}
