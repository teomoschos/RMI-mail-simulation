/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

H συγκεκριμενη κλαση ,κλαση Acount υλοποιει την βασικη δομη ενος λογαριασμου 
ενος χρηστη.Αναπαριστωντας το ονομα χρηστη ,τον κωδικο χρηστη και αποθετηριο 
των email του.
 */
package project;

import java.util.ArrayList;
import java.rmi.*;
import java.net.*;

public class Acount {
    private String username;
    private String password;
    private ArrayList<Email> mailbox;
    
    public Acount(String username,String password,ArrayList<Email> mailbox){   //αρχικοποιηση των πεδιων της κλασης.
        this.password=password;
        this.username=username;
        this.mailbox=mailbox;
        
    }
    
    // βασικες συναρτησεις της κλασης.
    
    public  void add(Email email ){
    this.mailbox.add(email);
    }
    
   
    public  String getUsername(){
        
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
     public ArrayList<Email> getMailbox(){
        return this.mailbox;
    }
    
}
