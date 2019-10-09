/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

Η συγκεκριμενη κλαση ,κλαση Email,αναπαριστα την βασικη δομη εμος email,
περιεχοντας ολα τα απαραιτητα στοιχεια ,που θα πρεπει να εχει ενα email.
 */
package project;
import java.rmi.*;
import java.net.*;

public class Email {
    private boolean  isNew;
    private String sender;
    private  String receiever;
    private String subject;
    private String mainbody;
    
    public Email(boolean isNew,String sender,String receiver,String subject,String mainbody ){ //αρχικοποιηση πεδιων κλασης.
        
        this.isNew=isNew;
        this.mainbody=mainbody;
        this.receiever=receiver;
        this.sender=sender;
        this.subject=subject;
    }
    
    
    //βασικες συναρτησεις κλασης.
    
    public void set_isNew(boolean isNew){
         this.isNew=isNew;
    }
    public boolean getisNew(){
        return this.isNew;
    }
    public String getSender(){
        return this.sender;
    }
    public String getSubject(){
        return this.subject;
    }
    public String getMainBody(){
        return this.mainbody;
    }
    public String getReceiver(){
        return this.receiever;
    }
}
