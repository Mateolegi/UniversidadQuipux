/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.dao;

import co.com.universidad.model.Profesor;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class ProfesorDao {
    
    private static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    
    public void crearProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }
    
    public void getProfesor(Profesor profesor){
            
        for(int j = 0; j<listaProfesores.size(); j++ ){
        
            if(listaProfesores.get(j).getIdentificacion().equals(profesor.getIdentificacion())){
            
                listaProfesores.set(j, profesor);
            
            }
        }
    }
    
    public void actualizarProfesor(Profesor profesor){
            
        for(int j = 0; j<listaProfesores.size(); j++ ){
        
            if(listaProfesores.get(j).getIdentificacion().equals(profesor.getIdentificacion())){
            
                listaProfesores.set(j, profesor);
            
            }
        }
    }
    
    public void eliminarProfesor(Profesor profesor){
            
        for(int j = 0; j<listaProfesores.size(); j++ ){
        
            if(listaProfesores.get(j).getIdentificacion().equals(profesor.getIdentificacion())){
            
                listaProfesores.remove(j);
            
            }
        }
    }
}
