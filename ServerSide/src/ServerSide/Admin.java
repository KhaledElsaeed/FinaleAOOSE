/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerSide;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import javax.swing.JOptionPane;

/**
 *
 * @author khaled
 */
public class Admin extends User  {
    
    CollectionOfGames game=new CollectionOfGames();
    
   MongoClient mongoClient=new MongoClient("localhost",27017);
   DB database=mongoClient.getColleection("");
   
   
    
    
    public Admin(String username, String password, String firstname, String lastname, int SSN, int phonenume, String email, String address) {
        super(username, password, firstname, lastname, SSN, phonenume, email, address);
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
    
}
