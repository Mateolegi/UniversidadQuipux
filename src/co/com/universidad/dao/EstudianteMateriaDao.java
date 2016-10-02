/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.dao;

import co.com.universidad.model.EstudianteMateria;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class EstudianteMateriaDao {
    
    private static ArrayList<EstudianteMateria> listaEstudianteMaterias = new ArrayList<>();
    
    public void crearEstudianteMateria(EstudianteMateria estudianteMateria){
        listaEstudianteMaterias.add(estudianteMateria);
    }
    
    public ArrayList<EstudianteMateria> getEstudianteMateria(){
        return listaEstudianteMaterias;
    }
    
    public void getEstudianteMateria(EstudianteMateria estudiantemateria){
            
        for(int j = 0; j<listaEstudianteMaterias.size(); j++ ){
        
            if(listaEstudianteMaterias.get(j).getEstudiante().equals(estudiantemateria.getEstudiante())){
            
                listaEstudianteMaterias.set(j, estudiantemateria);
            
            }
        }
    }
    
    public void actualizarEstudianteMateria(EstudianteMateria estudiantemateria){
            
        for(int j = 0; j<listaEstudianteMaterias.size(); j++ ){
        
            if(listaEstudianteMaterias.get(j).getEstudiante().equals(estudiantemateria.getEstudiante())){
            
                listaEstudianteMaterias.set(j, estudiantemateria);
            
            }
        }
    }
    
    public void eliminarEstudianteMateria(EstudianteMateria estudiantemateria){
            
        for(int j = 0; j<listaEstudianteMaterias.size(); j++ ){
        
            if(listaEstudianteMaterias.get(j).getEstudiante().equals(estudiantemateria.getEstudiante())){
            
                listaEstudianteMaterias.remove(j);
            
            }
        }
    }
}
