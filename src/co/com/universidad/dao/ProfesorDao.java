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
    
    public ArrayList<Profesor> getProfesor(){
        return listaProfesores;
    }
    
    public Profesor getProfesor(String id){
        
        Profesor profesor = new Profesor();
            
        for(int i = 0; i<listaProfesores.size(); i++ ){
        
            if(listaProfesores.get(i).getIdentificacion().equals(id)){
                            
                listaProfesores.set(i, profesor);
            
            }
        }
        return profesor;
    }
    
    public void actualizarProfesor(Profesor profesor){
            
        for(int j = 0; j<listaProfesores.size(); j++ ){
        
            if(listaProfesores.get(j).getIdentificacion().equals(profesor.getIdentificacion())){
            
                listaProfesores.set(j, profesor);
            
            }
        }
    }
    
    public Profesor eliminarProfesor(String id){
            
        Profesor profesor = new Profesor();
        for(int j = 0; j<listaProfesores.size(); j++ ){
        
            if(listaProfesores.get(j).getIdentificacion().equals(id)){
                listaProfesores.remove(j);
            
            }
        }
        return profesor;
    }
}
