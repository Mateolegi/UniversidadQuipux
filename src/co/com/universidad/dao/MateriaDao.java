/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.dao;

import co.com.universidad.model.Materia;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class MateriaDao {
    
    private static ArrayList<Materia> listaMaterias = new ArrayList<>();
    
    public void crearMateria(Materia materia){
        listaMaterias.add(materia);  
    }
    
    public void getMateria(Materia materia){
            
        for(int j = 0; j<listaMaterias.size(); j++ ){
        
            if(listaMaterias.get(j).getId() == (materia.getId())){
            
                listaMaterias.set(j, materia);
            
            }
        }
    }
    
    public void actualizarMateria(Materia materia){
            
        for(int j = 0; j<listaMaterias.size(); j++ ){
        
            if(listaMaterias.get(j).getId() == (materia.getId())){
            
                listaMaterias.set(j, materia);
            
            }
        }
    }
    
    public void eliminarMateria(Materia materia){
            
        for(int j = 0; j<listaMaterias.size(); j++ ){
        
            if(listaMaterias.get(j).getId() == (materia.getId())){
            
                listaMaterias.remove(j);
            
            }
        }
    }
}
