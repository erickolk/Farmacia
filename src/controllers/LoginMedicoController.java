/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import classes.Medico;
import dao.MedicoDAO;

public class LoginMedicoController {
    
    public Medico autenticar(String login, String senha) {
        
        MedicoDAO mdao = new MedicoDAO();
        
        Medico medico = mdao.buscar("login", login);
        
        if(medico != null) {
            if(medico.getSenha().equals(senha)) {
                return medico;
            }
        }
        
        return null;
    }
}
