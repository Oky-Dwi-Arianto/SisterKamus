/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class TB_kamus {
    Connection con;
    
    public TB_kamus(Connection con)
    {
        this.con = con;
    }
    
     public String getAllKata(String cari, String bahasaAwal, String bahasaHasil){
         String hasil = "";
  
         try {
            PreparedStatement ps = con.prepareStatement("SELECT "+bahasaHasil+" FROM tb_Kamus "
                    + "WHERE "+bahasaAwal+" LIKE '%" + cari + "%'");
             ResultSet rs = ps.executeQuery();
             while  (rs.next())
             {
                 hasil = rs.getString(1);
             }
        } catch (SQLException ex) {
            Logger.getLogger(TB_kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
        
    }
    public List<Kamus> getAllKata(){
      List<Kamus> listKata = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tb_kamus ");
             ResultSet rs = ps.executeQuery();
             while  (rs.next())
             {
                Kamus kamus = new Kamus();
                kamus.setIndonesia(rs.getString(1));
                kamus.setInggris(rs.getString(2));
                kamus.setJawa(rs.getString(3));
                
                listKata.add(kamus);
             }
        } catch (SQLException ex) {
            Logger.getLogger(TB_kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKata;
        
    }
    public boolean insertKata(Kamus kamus) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tb_Kamus (indonesia, inggris, jawa) "
                    + "VALUES (?, ?, ?)");
            ps.setString(1, kamus.getIndonesia());
            ps.setString(2, kamus.getInggris());
            ps.setString(3, kamus.getJawa());

            System.out.println("bisa");
            if (ps.executeUpdate() > 0) 
            {System.out.println("bisa nih bang");
                return true;
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteKata(String kata) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM tb_Kamus "
                    + "WHERE indonesia='" + kata + "'");
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateKata(Kamus kamus, String kataUpdate) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE tb_Kamus "
                    + "SET indonesia=?, inggris=?, jawa=?"
                    + "WHERE indonesia=?");
            ps.setString(1, kamus.getIndonesia());
            ps.setString(2, kamus.getInggris());
            ps.setString(3, kamus.getJawa());
            ps.setString(4, kataUpdate);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean getByKata(String kata) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT FROM tb_Kamus "
                    + "WHERE indonesia='" + kata + "'");
                  ps.setString(1, kata);
                  ResultSet result = ps.executeQuery();
                  Kamus kamus = null;
                  if(result.next()){
                      kamus.setIndonesia(result.getString("indonesia"));
                      System.out.println("masuk");
            }
                  return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
