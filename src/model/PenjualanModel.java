/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import koneksi.KoneksiDB;
/**
 *
 * @author Abo
 */
public class PenjualanModel {
    private KoneksiDB koneksi;
    private ResultSet rsLogin, rsPenjualan;
    private String query;
    private boolean status;
    private List<PenjualanModel>listPenjualan;
    
    public PenjualanModel(){
        koneksi = new KoneksiDB();
        koneksi.getConn();
    }
    
    private String jumlah;
    private String periode;
    private String id_periode;

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getId_periode() {
        return id_periode;
    }

    public void setId_periode(String id_periode) {
        this.id_periode = id_periode;
    }
    
    public boolean insertPenjualan(){
        query = "INSERT INTO penjualan (jumlah,periode,id_periode)VALUES('" + periode +"','" + jumlah + "','" + id_periode +"')";
        
        status = koneksi.eksekusiQuery(query, true);
        return status;
        
        
              
    }  

    public void setId_Periode(String id_periode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
