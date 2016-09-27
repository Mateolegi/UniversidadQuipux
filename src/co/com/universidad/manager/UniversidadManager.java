/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.manager;

import co.com.universidad.dao.EstudianteDao;
import co.com.universidad.dao.EstudianteMateriaDao;
import co.com.universidad.dao.MateriaDao;
import co.com.universidad.dao.ProfesorDao;
import co.com.universidad.model.Estudiante;
import co.com.universidad.model.EstudianteMateria;
import co.com.universidad.model.Materia;
import co.com.universidad.model.Profesor;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class UniversidadManager {
    
    private EstudianteDao estudianteDao = new EstudianteDao();
    private MateriaDao materiaDao = new MateriaDao();
    private ProfesorDao profesorDao = new ProfesorDao();
    private EstudianteMateriaDao estudianteMateriaDao = new EstudianteMateriaDao();
    
    public void crearMateria(int codigo, String nombre, String descripcion, int creditos){
        
        Materia materia = new Materia();
        materia.setId(codigo);
        materia.setNombre(nombre);
        materia.setDescripcion(descripcion);
        materia.setCreditos(creditos);
        
        materiaDao.crearMateria(materia);
        
    }
    
    public void crearProfesor(String identificacion, String nombre, Materia materia){
        
        Profesor profesor = new Profesor();
        profesor.setIdentificacion(identificacion);
        profesor.setNombre(nombre);
        profesor.setMateria(materia);
        
        profesorDao.crearProfesor(profesor);
        
    }
    
    public void crearEstudiante(String numeroDocumento, String nombre, int semestre){
        
        Estudiante estudiante = new Estudiante();
        estudiante.setIdentificacion(numeroDocumento);
        estudiante.setNombre(nombre);
        estudiante.setSemestre(semestre);
        
        estudianteDao.crearEstudiante(estudiante);
        
    }
    
    public void CrearEstudianteMateria(Estudiante estudiante, Profesor profesor, ArrayList<Double> notas){
    
        EstudianteMateria estudianteMateria = new EstudianteMateria();
        estudianteMateria.setEstudiante(estudiante);
        estudianteMateria.setProfesor(profesor);
        estudianteMateria.setNotas(notas);
        
        estudianteMateriaDao.crearEstudianteMateria(estudianteMateria);
    }
    
}
