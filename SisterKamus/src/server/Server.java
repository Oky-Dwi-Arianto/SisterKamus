/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author acer
 */
public class Server {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        Registry reg = LocateRegistry.createRegistry(190);
        TranslateImplementasi translateImplementasi = new TranslateImplementasi();
        reg.rebind("TranslateKata", translateImplementasi);
        System.out.println("Server Telah Berjalan");
        
    }
}
