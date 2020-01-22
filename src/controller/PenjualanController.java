/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.PenjualanModel;
import view.FrmInputData;

/**
 *
 * @author Abo
 */
public class PenjualanController {
    private PenjualanModel model;
    private FrmInputData view;
    
    public PenjualanController (FrmInputData view){
        this.view = view;
        model = new PenjualanModel();
    }
    
    public void inputPenjualan(String jumlah,String periode,String id_periode){
        model.setJumlah(jumlah);
        model.setPeriode(periode);
        model.setId_Periode(id_periode);
        
    }

    public boolean insertPenjualan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

  
     
}
