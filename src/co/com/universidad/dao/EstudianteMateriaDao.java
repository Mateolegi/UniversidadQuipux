/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.dao;

import co.com.universidad.model.Estudiante;
import co.com.universidad.model.EstudianteMateria;
import co.com.universidad.model.Profesor;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class EstudianteMateriaDao {
    
    private static ArrayList<EstudianteMateria> listaNotas = new ArrayList<>();
    
    public void crearEstudianteMateria(EstudianteMateria nota){
        listaNotas.add(nota);
    }
    
    public ArrayList<EstudianteMateria> getEstudianteMateria(){
        return listaNotas;
    }
    
    public EstudianteMateria getEstudianteMateria(Estudiante estudiante, Profesor profesor){
        
        EstudianteMateria nota = new EstudianteMateria();
            
        for(int i = 0; i<listaNotas.size(); i++ ){
        
            if(listaNotas.get(i).getEstudiante()==estudiante && listaNotas.get(i).getProfesor()==profesor){
                            
                nota.setEstudiante(listaNotas.get(i).getEstudiante());
                nota.setProfesor(listaNotas.get(i).getProfesor());
                nota.setNotas(listaNotas.get(i).getNotas());
            
            }
        }
        return nota;
    }
    
    public void actualizarEstudianteMateria(EstudianteMateria nota){
            
        for(int j = 0; j<listaNotas.size(); j++ ){
        
            if(listaNotas.get(j).getEstudiante().equals(nota.getEstudiante()) && listaNotas.get(j).getProfesor().equals(nota.getProfesor())){
            
                listaNotas.set(j, nota);
            
            }
        }
    }
    
    public void eliminarEstudianteMateria(Estudiante estudiante, Profesor profesor){

        for(int j = 0; j<listaNotas.size(); j++ ){
        
            if(listaNotas.get(j).getEstudiante().equals(estudiante) && listaNotas.get(j).getProfesor().equals(profesor)){
                listaNotas.remove(j);
            }
        }
    }
}
