/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.dao;

import co.com.universidad.model.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class EstudianteDao {
    
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    public void crearEstudiante(Estudiante estudiante){
     listaEstudiantes.add(estudiante);   
    }
    
    public ArrayList<Estudiante> getEstudiante(){
        
        return listaEstudiantes;
    }
    
    public Estudiante getEstudiante(String id){
        
        Estudiante estudiante = new Estudiante();
            
        for(int i = 0; i<listaEstudiantes.size(); i++ ){
        
            if(listaEstudiantes.get(i).getIdentificacion().equals(id)){

                estudiante.setIdentificacion(listaEstudiantes.get(i).getIdentificacion());
                estudiante.setNombre(listaEstudiantes.get(i).getNombre());
                estudiante.setSemestre(listaEstudiantes.get(i).getSemestre());
            
            }
        }
        return estudiante;
    }
    
    public void actualizarEstudiante(Estudiante estudiante){
            
        for(int j = 0; j<listaEstudiantes.size(); j++ ){
        
            if(listaEstudiantes.get(j).getIdentificacion().equals(estudiante.getIdentificacion())){
            
                listaEstudiantes.set(j, estudiante);
            
            }
        }
    }
    
    public Estudiante eliminarEstudiante(String id){
            
        Estudiante materia = new Estudiante();
        for(int i = 0; i<listaEstudiantes.size(); i++ ){
        
            if(listaEstudiantes.get(i).getIdentificacion().equals(id)){
                listaEstudiantes.remove(i);
            
            }
        }
        return materia;
    }
}
