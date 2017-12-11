/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerSide;

import javax.swing.JOptionPane;

/**
 *
 * @author khaled
 */
public class Customer extends User{
    
    public Customer(String username, String password, String firstname, String lastname, int SSN, int phonenume, String email, String address) {
        super(username, password, firstname, lastname, SSN, phonenume, email, address);
    }

    @Override
    public void Register(String username,String password,String firstname,String lastname,int SSN,int phonenume,String email,String address){
        
        setUsername(username);
        setPassword(password);
        setFirstname(firstname);
        setLastname(lastname);
        setSSN(SSN);
        setPhonenume(phonenume);
        setEmail(email);
        setAddress(address);
    }
    
    @Override
    public void login(String username,String password){
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
