/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import koneksi.KoneksiDB;
/**
 *
 * @author Abo
 */
public class AdminModel {
    private KoneksiDB koneksi;
    private ResultSet rsLogin, rsAdmin;
    private String query;
    private boolean status;
    private List<AdminModel> ListAdmin;
    
    public AdminModel(){
        koneksi = new KoneksiDB();
        koneksi.getConn();
    }
    //Pembuatan Variabel
    private String username;
    private String password;
    
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username = username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    
  //Query Login
        public boolean login(){
        query = "SELECT * "  
              + "FROM admin "
              + "WHERE username = '"+username+"'AND password = '"+password+"'";
        status = koneksi.eksekusiQuery(query, true);
        
        if(status){
            rsLogin = koneksi.getRs();
            try {
                rsLogin.next();
                username = rsLogin.getString(1);
                if(username == null){
                    status = false;
                }else{
                    status = true;
                }
            } catch (SQLException se){
                status = false;
            }
        }
        return status;
        }
}
