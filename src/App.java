
import Controllers.PersonaController;
import Models.Persona;

public class App {
        public static void main(String[] args) throws Exception {
                Persona[] personas = {
                                new Persona("Anais", 25),
                                new Persona("Luis", 32),
                                new Persona("Carlos", 40),
                                new Persona("María", 19),
                                new Persona("José", 45),
                                new Persona("Laura", 30),
                                new Persona("Pedro", 28),
                                new Persona("Marta", 35),
                                new Persona("Jorge", 50),
                                new Persona("Sofía", 22),
                                new Persona("Raúl", 18),
                                new Persona("Patricia", 29),
                                new Persona("Andrés", 41),
                                new Persona("Elena", 24),
                                new Persona("Manuel", 38),
                                new Persona("Isabel", 34),
                                new Persona("Gabriel", 42),
                                new Persona("Claudia", 26),
                                new Persona("Fernando", 31),
                                new Persona("Paula", 20),
                                new Persona("Diego", 36),
                                new Persona("Rosa", 27),
                                new Persona("Rubén", 44),
                                new Persona("Teresa", 33),
                                new Persona("Iván", 17),
                                new Persona("Julia", 21),
                                new Persona("Adriana", 39),
                                new Persona("Sergio", 48),
                                new Persona("Lorena", 23),
                                new Persona("Miguel", 52)
                };

                PersonaController persona1 = new PersonaController();

                System.out.println("método de ordenamiento por edad");
                persona1.sortByAgeWithSelection(personas);
        
                System.out.println("Metodo de busqueda Binaria por edad");
                persona1.binarySearchbyAge(personas, 25, 70);
        
                System.out.println("método de ordenamiento por nombre");
                persona1.sortByNameWithInsertion(personas);
        
                System.out.println("búsqueda binaria por nombr");
                persona1.binarySearchbyName(personas, "Anais", "Miguel");
        
                System.out.println("Ejecución finalizada.");
            }
}

// Imprimir:
// el arreglo ordenado para cada punto 1 y 2
// Si encontró a la persona en el arreglo de personas los datos de dicha persona
// y su posición
// Si no encontró a la persona en el arreglo de personas