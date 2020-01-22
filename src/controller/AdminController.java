/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import model.AdminModel;
import view.FrmLoginAdmin;
import view.FrmInputData;
import view.FrmHasilForecasting;
import view.FrmPencarianHasil;

/**
 *
 * @author Abo
 */
public class AdminController {
    private FrmLoginAdmin view;
    private FrmInputData view2;
    private FrmHasilForecasting view3;
    private FrmPencarianHasil view4;
    private AdminModel model;
    
    public  AdminController (FrmLoginAdmin view){
        this.view = view;
        model = new AdminModel();
    }
    
    public AdminController (FrmInputData view){
        this.view2 = view;
        model = new AdminModel();
    }
    
    public AdminController (FrmHasilForecasting view){
        this.view3 = view;
        model = new AdminModel();
    }
    
    public AdminController (FrmPencarianHasil view){
        this.view4 = view;
        model = new AdminModel();     
    }
    
        public boolean login(String username, String password){
            model.setusername(username);
            model.setpassword(password);
            return model.login();
        }
        
    //Output
        
        
              
    
}