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
    
    private static ArrayList<EstudianteMateria> listaEstidianteMaterias = new ArrayList<>();
    
    public void crearEstudianteMateria(EstudianteMateria estudianteMateria){
        listaEstidianteMaterias.add(estudianteMateria);
    }
    
}
