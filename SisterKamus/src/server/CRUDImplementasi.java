/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.util.List;
import translate.CRUDInterface;
import translate.DB_kamus;
import translate.Kamus;
import translate.TB_kamus;

/**
 *
 * @author acer
 */
public class CRUDImplementasi extends UnicastRemoteObject implements CRUDInterface {
    Connection con = new DB_kamus().getConnection();

    public CRUDImplementasi() throws RemoteException{
        
    }
    
    @Override
    public List<Kamus> getAllKata() throws RemoteException{
        List<Kamus> listKata = new TB_kamus(con).getAllKata();
        return listKata;
    }
  
    @Override
    public Boolean insertKata(Kamus kamus) throws RemoteException {
        boolean hasil = new TB_kamus(con).insertKata(kamus);
        return hasil;
        
    }

    @Override
    public Boolean updateKata(Kamus kamus, String kata) throws RemoteException {
        boolean hasil = new TB_kamus(con).updateKata(kamus, kata);
        return hasil;
    }

    @Override
    public Boolean deleteKata(String kata) throws RemoteException {
        System.out.println("sdasd");
        boolean hasil = new TB_kamus(con).deleteKata(kata);
        return hasil;
    }
    
}
