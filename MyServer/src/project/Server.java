/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

Η συγκεκριμενη κλαση ,κλαση Server,συνδεται με την κλαση Client ,ωστε να επιτευχθει η 
λειτουργια Πελατη-Εξυπηρετητη.
 */
package project;
import project.Linker;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
   
   public static void main(String args[]) {
try {
    
    Registry r = LocateRegistry.createRegistry(5000);  //ανοιγμα θυρας.
    r.rebind("Server",new MailServer());   
     System.out.println("Server started!");
    }
catch(Exception e) { System.out.println("Exception: " + e); }
   } 
}

