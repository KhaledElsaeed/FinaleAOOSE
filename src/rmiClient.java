/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammed
 */
import GameRentalStore.Admin;
import GameRentalStore.Customer;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface rmiClient extends Remote {
    
    public Customer login(String username, String pass) throws RemoteException;
    public Customer register(String Firstname, String Lastname, String Middle, String username, String Pass, String phone, String mail, String Address) throws RemoteException;
    public Customer payment (String visa, String COD) throws RemoteException; 
}
