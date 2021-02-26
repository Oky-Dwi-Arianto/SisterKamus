/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.server.UnicastRemoteObject;
import translate.TranslateInterface;
import java.rmi.RemoteException;
/**
 *
 * @author acer
 */
public class TranslateImplementasi extends UnicastRemoteObject implements TranslateInterface{
    
    public TranslateImplementasi() throws RemoteException{
        
    }

    @Override
    public String translateKata(int kodeBahasaAsal, int kodeBahasaHasil, String kata) throws RemoteException {
        System.out.println("Client translate dari bahasa "+kodeBahasaAsal+" ke bahasa "+kodeBahasaHasil+""
                + "dengan kata yang di translate "+kata);
        return kata;
    }
    
}
