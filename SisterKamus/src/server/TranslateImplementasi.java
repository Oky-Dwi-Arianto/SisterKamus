/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.server.UnicastRemoteObject;
import translate.TranslateInterface;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.util.List;
import translate.DB_kamus;
import translate.Kamus;
import translate.TB_kamus;
/**
 *
 * @author acer
 */
public class TranslateImplementasi extends UnicastRemoteObject implements TranslateInterface{
    Connection con = new DB_kamus().getConnection();

    public TranslateImplementasi() throws RemoteException{
    
    }

    @Override
    public String translateKata(String bahasaAwal, String bahasaHasil, String kata) throws RemoteException {        
        String hasil;
        hasil = new TB_kamus(con).getAllKata(kata, bahasaAwal, bahasaHasil);
        return hasil;
    }

//    @Override
//    public List<Kamus> getAllKata() {
//        List<Kamus> listKata = new TB_kamus(con).getAllKata();
//        return listKata;
//    }
    
}
