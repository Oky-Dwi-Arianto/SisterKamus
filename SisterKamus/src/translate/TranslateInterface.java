/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author acer
 */
public interface TranslateInterface extends Remote{
    public String translateKata(int kodeBahasaAsal, int kodeBahasaHasil, String kata) throws RemoteException;
}
