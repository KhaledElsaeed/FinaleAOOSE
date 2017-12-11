/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRentalStore;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import javax.swing.JOptionPane;

/**
 *
 * @author khaled
 */
public class Admin extends User  {
    
    
   
   
    
    
    public Admin(String username, String password, String firstname, String lastname, int SSN, int phonenume, String email, String address) {
        super(username, password, firstname, lastname, SSN, phonenume, email, address);
    }

    Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addGame(String gameID,String gamename,String gametype,String gameDesc,String gameprice)
    {
        
        if(gameID.equals(gameID) && gamename.equals(gamename)){ //then check in the database 
            System.out.println("the Game is Exist ");
        }
        else
        {
            game.setGameID(gameID);
            game.setGamename(gamename);
            game.setGametype(gametype);
            game.setGameDesc(gameDesc);
            game.setGameprice(gameprice);
        }
    }
    
    public void Login(String username,String password){
        try
        {
        if(username.equals(username) && password.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Welcome " +username);
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid username or password ");
        }
    }

    boolean GameStore(String name, String company, float r, String disc, String ava) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean GameStore(String game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
