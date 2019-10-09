/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

Στην συγκεκριμενη κλαση ,κλαση Linker,δημιουργουνται ολες οι abstruct μεθοδοι
οι οποιες υλοποιουνται στην κλαση MailServer.
 */
package project;
import java.rmi.*;
import java.rmi.*;
import java.net.*;

public  interface  Linker extends Remote {
   
   void menu() throws RemoteException;
   void  NewEmail(String sender,String receiver,String subject,String mainbody) throws RemoteException;
   boolean register(Acount cl) throws RemoteException;
   boolean logIn(String username ,String password) throws RemoteException;
   void showEmail(String username) throws RemoteException;
   void readEmail(int id,String username) throws RemoteException;
   void deleteEmail(int id,String username) throws RemoteException;
   void logOut() throws RemoteException;
   void exit() throws RemoteException;
     
}
