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
    
    private final EstudianteDao estudianteDao = new EstudianteDao();
    private final MateriaDao materiaDao = new MateriaDao();
    private final ProfesorDao profesorDao = new ProfesorDao();
    private final EstudianteMateriaDao estudianteMateriaDao = new EstudianteMateriaDao();
    
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
    
    public void crearEstudianteMateria(Estudiante estudiante, Profesor profesor, ArrayList<Double> notas){
    
        EstudianteMateria estudianteMateria = new EstudianteMateria();
        estudianteMateria.setEstudiante(estudiante);
        estudianteMateria.setProfesor(profesor);
        estudianteMateria.setNotas(notas);
        
        estudianteMateriaDao.crearEstudianteMateria(estudianteMateria);
    }
    
    public ArrayList<Materia> getMateria(){
        return materiaDao.getMateria();
    }
    
    public Materia getMateria(int codigo){

        return materiaDao.getMateria(codigo);
        
    }
    
    public ArrayList<Profesor> getProfesor(){
        return profesorDao.getProfesor();
    }
    
    public Profesor getProfesor(String identificacion){

        return profesorDao.getProfesor(identificacion);
        
    }
    
    public ArrayList<Estudiante> getEstudiante(){
        return estudianteDao.getEstudiante();
    }
    
    public Estudiante getEstudiante(String numeroDocumento){

        return estudianteDao.getEstudiante(numeroDocumento);
        
    }
    
    public ArrayList<EstudianteMateria> getEstudianteMateria(){
        return estudianteMateriaDao.getEstudianteMateria();
    }
    
    public EstudianteMateria getEstudianteMateria(Estudiante estudiante, Profesor profesor){

        return estudianteMateriaDao.getEstudianteMateria(estudiante, profesor);
    }
    
    public void actualizarMateria(int codigo, String nombre, String descripcion, int creditos){
        
        Materia materia = new Materia();
        materia.setId(codigo);
        materia.setNombre(nombre);
        materia.setDescripcion(descripcion);
        materia.setCreditos(creditos);
        
        materiaDao.actualizarMateria(materia);
        
    }
    
    public void actualizarProfesor(String identificacion, String nombre, Materia materia){
        
        Profesor profesor = new Profesor();
        profesor.setIdentificacion(identificacion);
        profesor.setNombre(nombre);
        profesor.setMateria(materia);
        
        profesorDao.actualizarProfesor(profesor);
        
    }
    
    public void actualizarEstudiante(String numeroDocumento, String nombre, int semestre){
        
        Estudiante estudiante = new Estudiante();
        estudiante.setIdentificacion(numeroDocumento);
        estudiante.setNombre(nombre);
        estudiante.setSemestre(semestre);
        
        estudianteDao.actualizarEstudiante(estudiante);
        
    }
    
    public void actualizarEstudianteMateria(Estudiante estudiante, Profesor profesor, ArrayList<Double> notas){
    
        EstudianteMateria estudianteMateria = new EstudianteMateria();
        estudianteMateria.setEstudiante(estudiante);
        estudianteMateria.setProfesor(profesor);
        estudianteMateria.setNotas(notas);
        
        estudianteMateriaDao.actualizarEstudianteMateria(estudianteMateria);
    }

    public Materia eliminarMateria(int codigo){

        return materiaDao.eliminarMateria(codigo);
        
    }
    
    public Profesor eliminarProfesor(String id){
        return profesorDao.eliminarProfesor(id);
    }
    
    public Estudiante eliminarEstudiante(String numeroDocumento){

        return estudianteDao.eliminarEstudiante(numeroDocumento);
        
    }
    
    public EstudianteMateria eliminarEstudianteMateria(Estudiante estudiante, Profesor profesor){

        return estudianteMateriaDao.eliminarEstudianteMateria(estudiante, profesor);
    }
}
