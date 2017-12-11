package ServerSide;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohammed
 */
import ServerSide.Customer;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface rmiServer {

    CollectionOfGames game = new CollectionOfGames();

    MongoClient mongoClient = new MongoClient("localhost", 27017);
    DB database = mongoClient.getConnectPoint();

    public Customer login(String username, String pass) throws RemoteException;

    public Customer register(String Firstname, String Lastname, String Middle, String username, String Pass, String phone, String mail, String Address) throws RemoteException;

    public Customer payment(String visa, String COD) throws RemoteException;

}
