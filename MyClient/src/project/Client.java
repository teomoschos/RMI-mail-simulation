/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

H συγκεκριμενη κλαση ,κλαση Client,συνδεται με την κλαση Server ,ωστε να επιτευχθει η 
λειτουργια Πελατη-Εξυπηρετητη.Επισης ,μεσω αυτης καλειται και το μενου 
λειτουργιων του προγραμματος.
 */

package project;
import project.Linker;
import java.rmi.*;
import java.net.*;
import project.MailServer;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
        
  public static void main(String args[]) throws NotBoundException, RemoteException, MalformedURLException {

     Linker p=(Linker)Naming.lookup("rmi://localhost:5000/Server"); //ανοιγμα θυρας με τον Εξυπηρετητη.
      System.out.println("Client started!");
  
 MailServer c=new MailServer();
 c.menu() ;
     } 

}
