/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Ονομα:Μοσχος θεοδωρος
ΑΕΜ:2980

Στην συγκεκριμενη κλαση ,κλαση Server,πραγματοποιουνται ολες οι βασικες λειτουργιες
του προγραμματος.Πιομ συγκεκριμενα,εδω υλοποιειται το μενου επιλογων με το οποιο 
αλληλεπιδρα ο χρηστης,καθως και ολες οι μεθολοι που εχει την δυνατοτητα να χρησιμοποιησει 
ο χρηστης σας ,ως επιλογες.Τελος,δημιουργουνται και 2 στατικοι λογαριασμοι χρηστων ,
οπου ο καθενας περιεχει απο 3 email.
 */
package project;
import java.rmi.*;
import java.net.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

public class MailServer extends UnicastRemoteObject implements Linker{

    //Δημιουργια  των στατικων λογαριασμων ,και των email τους.
    
     private ArrayList<Acount> acount=new ArrayList<>();
     
     
     public MailServer()throws RemoteException{
         ArrayList<Email> e1=new ArrayList<>();
        e1.add(new Email(false,"tmoschos@hotmail.gr","tmoschos@hotmail.gr","Basikes arxes programmatismoy","anadromh"));
         e1.add(new Email(false,"giannis@hotmail.gr","tmoschos@hotmail.gr","baseis dedomenon","sxesiako montelo"));
        e1.add(new Email(true,"eirinimx@hotmail.gr","tmoschos@hotmail.gr","diktya epikoinonion","rmi"));
         acount.add(new Acount("tmoschos@hotmail.gr","1234",e1));
        ArrayList<Email> e2=new ArrayList<>();
         e2.add(new Email(false,"eirinimx@hotmail.gr","eirinimx@hotmail.gr","texnologia logismikou","open source kodikas"));
         e2.add(new Email(false,"tmoschos@hotmail.gr","eirinimx@hotmail.gr","shmata systhmata"," M fourier"));
         e2.add(new Email(true,"basilhs@hotmail.gr","eirinimx@hotmail.gr","grammikh algebra","pollaplasiasmos pinakon"));
         acount.add(new Acount("eirinimx@hotmail.gr","2345",e2));
        
     }
    
    
    
     //Μενου επιλογων ,που χρησιμοποιει ο χρηστης.
     
@Override
public void menu()throws RemoteException{
    boolean exit=false;
     System.out.println("-------------------");  
      System.out.println("MailServer:");
      System.out.println("-------------------");
      System.out.println("Hello ,you connected as a guest.");
      System.out.println("-------------------");
      System.out.println("-------------------");
      System.out.println(">LogIn");
      System.out.println(">SignIn");
      System.out.println(">Exit");
      System.out.println("-------------------");
      System.out.println("-------------------"); 
      
    Scanner scan =new Scanner(System.in);
    String choice=scan.nextLine();
    
        do{
        switch(choice){
            case"LogIn":
                
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("-------------------");
                System.out.println("Type your username:");
                Scanner readname =new Scanner(System.in);
                String username=readname.nextLine();
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("Type your password:");
                Scanner readpassword=new Scanner(System.in);
                String password=readpassword.nextLine();
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("-------------------");
                System.out.println("Welcome back"+" "+username+"!");
                System.out.println("-------------------");
                System.out.println("-------------------");
                 MailServer t=new MailServer();
     
       
         t.logIn(username, password);
         
      if(logIn(username, password)==false){
          break;
      }
     
                System.out.println(">NewEmail");
                System.out.println(">ShowEmails");
                System.out.println(">ReadEmail");
                System.out.println(">DeleteEmail");
                System.out.println("Logout");
                System.out.println("Exit");
                System.out.println("-------------------");
                System.out.println("-------------------");
                
               Scanner s =new Scanner(System.in);
               String c=s.nextLine();
               String sub;
               String m;
               String r;
               int id;
                  switch(c){
                      case"NewEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Receiver:");
                          r=s.nextLine();
                          System.out.println("Subject:");
                          sub=s.nextLine();
                          System.out.println("Main Body:");
                          m=s.nextLine();
                          t.NewEmail(username, r, sub, m);
                          break;
                      case "ShowEmails":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          t.showEmail(username);
                          break;
                      case"ReadEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Give the id:");
                          id = s.nextInt();
                          t.readEmail(id, username);
                          break;
                      case"DeleteEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Give the id:");
                          id = s.nextInt();
                          t.deleteEmail(id,username);
                          break;
                      case"Logout":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          t.logOut();
                          break;
                      case"Exit":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          t.exit(); 
                          System.exit(0);
                          break;
                  }
                break;
                
            case"SignIn":
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("-------------------");
                System.out.println("Type your username");
                Scanner readn =new Scanner(System.in);
                String usern=readn.nextLine();
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("Type your password");
                Scanner readp=new Scanner(System.in);
                String  p=readp.nextLine();
                System.out.println("-------------------");
                System.out.println("MailServer:");
                System.out.println("-------------------");
                System.out.println("Welcome back"+" "+usern+"!");
                System.out.println("-------------------");
                System.out.println("-------------------");
        
                MailServer n=new MailServer();
                 String sub1;
                 String m1;
                 int id1;
                 String r1;
                 n.register(new Acount (usern,p,null));
        
                System.out.println(">NewEmail");
                System.out.println(">ShowEmails");
                System.out.println(">ReadEmail");
                System.out.println(">DeleteEmail");
                System.out.println("Logout");
                System.out.println("Exit");
                System.out.println("-------------------");
                System.out.println("-------------------");
                Scanner sc =new Scanner(System.in);
                String ch=sc.nextLine();
    
                  switch(ch){
                      case"NewEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Receiver:");
                          r1=sc.nextLine();
                          System.out.println("Subject:");
                          sub1=sc.nextLine();
                          System.out.println("Main Body:");
                          m1=sc.nextLine();
                          n.NewEmail(usern, r1, sub1, m1);
                          break;
                      case "ShowEmails":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          n.showEmail(usern);
                          break;
                      case"ReadEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Give the id:");
                          id1=sc.nextInt();
                          n.readEmail(id1,usern);
                          break;
                      case"DeleteEmail":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          System.out.println("Give the id:");
                          id1=sc.nextInt();
                          n.deleteEmail(id1,usern);
                          break;
                      case"Logout":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          n.logOut();
                          break;
                      case"Exit":
                          System.out.println("-------------------");
                          System.out.println("MailServer:");
                          System.out.println("-------------------");
                          n.exit();    
                          System.exit(0);
                          break;
                  }
                break;
                
            case"Exit":
                MailServer k=new MailServer();
                k.exit();    
                exit=true;
                System.exit(0);
                break;
                
        }
    }while(!exit);
    
  }
  
//Υλοποιηση των μεθοδων ,που αναπαριστουν τις επιλογες ,του μενου επιλογων ,
//που χρησιμοποιει ο χρηστης.

    @Override
    public boolean register(Acount cl) throws RemoteException {
         for(Acount a:acount){
             if(a.getUsername()==null? 
                     a.getUsername()==null:a.getUsername().equals(a.getUsername()))
                     return false;
             
         }
         
         acount.add(cl);
         System.out.print("Welcome"+cl.getUsername());       
         return true;
         
    }

    @Override
    public boolean logIn(String username,String password) throws RemoteException {
       
        for(Acount iterator:acount){
           if(iterator.getUsername().equals(username) && 
                   iterator.getPassword().equals(password)){
                       
               return true;
               
           }
           
       }
       System.out.println("Something went wrong with the connection,try again .");
       
       return false;
    }

    @Override
    public void showEmail(String username) throws RemoteException {
        Acount temp=null;
       for(Acount a:acount){
           if(a.getUsername().equals(username) )
           {
                temp=a;
               
               for(int i=0;i<temp.getMailbox().size();i++)
                   if(temp.getMailbox().get(i).getisNew())
               System.out.println(i+" [New] "+temp.getMailbox().get(i).getSender()+"  "+temp.getMailbox().get(i).getSubject());
               else
               System.out.println(i+"   "+temp.getMailbox().get(i).getSender()+"  "+temp.getMailbox().get(i).getSubject());
           }
          }
       
    }

    
    @Override
    public void deleteEmail(int id,String username ) throws RemoteException {
       Acount temp=null;
  
        for(Acount iterator:acount){
           if(iterator.getUsername().equals(username) )
           {
                temp=iterator;
           }
        }
        
        if(id<=temp.getMailbox().size() && id>=0){
                temp.getMailbox().remove(id);
           }else
                System.out.println("Sorry something went wrong,this email doesn't exist.");
        
    }
    
    
    @Override
    public void readEmail(int id,String username) throws RemoteException {
        
        Acount temp=null;
        for(Acount iterator:acount){
           if(iterator.getUsername().equals(username) )
           {
                temp=iterator;
           }
        }
         
           if(id<=temp.getMailbox().size() && id>=0){
                System.out.println(temp.getMailbox().get(id).getMainBody());
                temp.getMailbox().get(id).set_isNew(false);}
                else
                System.out.println("Sorry something went wrong ,this email doesn't exist.");
           
           }    
         
            
           
    
    
    
     @Override
    public void NewEmail( String sender, String receiver, String subject, String mainbody) throws RemoteException {
        for(Acount iterator:acount){
             if(iterator.getUsername()==null?
                     receiver==null:iterator.getUsername().equals(receiver)){
                 iterator.add(new Email(false,sender,receiver,subject,mainbody));
                 
             System.out.println("Congruts,your mail was sent succesfully!!");
                 return;
               }
        
                    
       }
        System.out.println("Receiver not found,try again.");
       
             
               
    
    }

    @Override
    public void logOut() throws RemoteException {
        System.out.println("You have logged out,sucesfully!");
    }

    @Override
   public void exit() throws RemoteException {
        System.out.println("the whole procces ,has been terminated!");
    } 

    
}
