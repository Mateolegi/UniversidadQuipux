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
    
    public ArrayList<Materia> getMateria(){
        return listaMaterias;
    }
    
    public Materia getMateria(int id){
        
        Materia materia = new Materia();
            
        for(int i = 0; i<listaMaterias.size(); i++ ){
        
            if(listaMaterias.get(i).getId() == id){

                materia.setId(listaMaterias.get(i).getId());
                materia.setNombre(listaMaterias.get(i).getNombre());
                materia.setDescripcion(listaMaterias.get(i).getDescripcion());
                materia.setCreditos(listaMaterias.get(i).getCreditos());
            
            }
        }
        return materia;
    }
    
    public void actualizarMateria(Materia materia){
            
        for(int j = 0; j<listaMaterias.size(); j++ ){
        
            if(listaMaterias.get(j).getId() == materia.getId()){
            
                listaMaterias.set(j, materia);
            
            }
        }
    }
    
    public Materia eliminarMateria(int id){
            
        Materia materia = new Materia();
        for(int j = 0; j<listaMaterias.size(); j++ ){
        
            if(listaMaterias.get(j).getId() == id){
                listaMaterias.remove(j);
            
            }
        }
        return materia;
    }
}
