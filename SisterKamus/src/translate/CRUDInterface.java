/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface CRUDInterface extends Remote{
    public List<Kamus> getAllKata() throws RemoteException;
    public Boolean insertKata(Kamus kamus) throws RemoteException;
    public Boolean updateKata() throws RemoteException;
    public Boolean deleteKata(String kata) throws RemoteException;
}
