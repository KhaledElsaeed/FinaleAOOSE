/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRentalStore;

/**
 *
 * @author khaled
 */
public class User {
    public String username;
    public String password;
    public String firstname;
    public String lastname;
    public int SSN;
    public int phonenume;
    public String email;
    public String address;

    public User(String username, String password, String firstname, String lastname, int SSN, int phonenume, String email, String address) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.SSN = SSN;
        this.phonenume = phonenume;
        this.email = email;
        this.address = address;
    }
    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setPhonenume(int phonenume) {
        this.phonenume = phonenume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSSN() {
        return SSN;
    }

    public int getPhonenume() {
        return phonenume;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
    public void Register(String username,String password,String firstname,String lastname,int SSN,int phonenume,String email,String address){
        
    }
    
    public void login(String username,String password){
        
    }
    
    
       
    
    
}
