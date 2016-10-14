package co.com.universidad.model;
/**
 *
 * @author andres.ospina
 */
public class Profesor extends Persona{
    
    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
