package Models;

/**
 * 
 * Clase Persona que representa una entidad Persona con atributos para name y
 * Age.
 */
public class Persona {
    // Atributos de la clase
    String name; // Almacena el name de la carro
    int Age; // Almacena la Age de la carro

    /**
     * Constructor para crear una nueva instancia de Persona con un name y Age
     * específicos.
     * 
     * @param name name de la persona.
     * @param Age   Age de la persona.
     */
    public Persona(String name, int Age) {
        this.name = name; // Asigna el name pasado al atributo name de la clase
        this.Age = Age; // Asigna la Age pasada al atributo Age de la clase
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Persona [name=" + name + ", Age=" + Age + "]";
    }
    

}