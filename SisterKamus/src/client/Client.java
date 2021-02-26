/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import translate.TranslateInterface;

/**
 *
 * @author acer
 */
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException, IOException{
        String respons="";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int kodeBahasaAwal, kodeBahasaHasil;
        String kata;
        
        TranslateInterface translateInterface = (TranslateInterface) Naming.lookup("rmi://127.0.0.1:190/TranslateKata");
        System.out.println("tersambung");
        
        System.out.println("Input kata");
        kodeBahasaAwal = Integer.parseInt(input.readLine());
        
        System.out.println("Input kata");
        kodeBahasaHasil = Integer.parseInt(input.readLine());
        
        System.out.println("Input kata");
        kata = input.readLine();
        
        respons = translateInterface.translateKata(kodeBahasaAwal, kodeBahasaHasil, kata);
        System.out.println(respons);
    }
    
}
