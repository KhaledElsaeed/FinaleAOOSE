/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerSide;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khaled
 */
public class CollectionOfGames {
    public String gameID;
    public String gamename;
    public String gametype;
    public String gameDesc;
    public float gameprice;
    public String gameAvailability;
    private List<observer> observers = new ArrayList<observer>();
    public CollectionOfGames(String gameID, String gamename, String gametype, String gameDesc, float gameprice, String gameAvailability) {
        this.gameID = gameID;
        this.gamename = gamename;
        this.gametype = gametype;
        this.gameDesc = gameDesc;
        this.gameprice = gameprice;
        this.gameAvailability = gameAvailability;
    }

    CollectionOfGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public void setGametype(String gametype) {
        this.gametype = gametype;
    }

    public void setGameDesc(String gameDesc) {
        this.gameDesc = gameDesc;
    }

    public void setGameprice(float gameprice) {
        this.gameprice = gameprice;
    }

    public void setGameAvailability(String gameAvailability) {
        this.gameAvailability = gameAvailability;
        
    }
    public void attach(observer observer){
      observer.notify(observer);		
   }
    
    public void notifyallObservers(){
        for(observer obs : observers)
        {
            obs.notify();
        }
    }

    public String getGameID() {
        return gameID;
    }

    public String getGamename() {
        return gamename;
    }

    public String getGametype() {
        return gametype;
    }

    public String getGameDesc() {
        return gameDesc;
    }

    public float getGameprice() {
        return gameprice;
    }

    public String getGameAvailability() {
        return gameAvailability;
    }

    void setGameprice(String gameprice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
            
            
    
}
