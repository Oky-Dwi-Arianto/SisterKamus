/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author acer
 */
public interface TranslateInterface extends Remote{
    public String translateKata(String bahasaAsal, String bahasaHasil, String kata) throws RemoteException;
   
}
