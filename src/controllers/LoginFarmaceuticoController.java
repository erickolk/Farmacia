/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.FarmaceuticoDAO;
import classes.Farmaceutico;

public class LoginFarmaceuticoController {
    
    public Farmaceutico autenticar(String login, String senha) {
        
        FarmaceuticoDAO fmdao = new FarmaceuticoDAO();
        
        Farmaceutico farmaceutico = fmdao.buscar("login", login);
        
        
        if(farmaceutico != null) {
            System.out.println(farmaceutico);
            
            if(farmaceutico.getSenha().equals(senha)) {
                
                return farmaceutico;
                
            }
        }
        
        return null;
    }
    
}
