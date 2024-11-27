package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 * /// TODOS los métodos deben ser implementados en la clase PersonaController
 * // Crear una instancia de la clase PersonaController y llamar a los métodos
 * // NO usar metodos estaticos
 * 
 * // 1 - Implementar un método para ordenar las personas por edad en orden
 * // desecendente tipo selección
 * 
 * // 1.2 - Buscar a la persona con las sigueintes edaddes en el arreglo de
 * // personas ya ordenarod por edad
 * // - 25
 * // - 70
 * 
 * // 2 - Implementar un método para ordenar las personas por su nombre en orden
 * // ascendente tipo inserción
 * 
 * // 2.2 - Buscar a la persona con los sigueintes nombres en el arreglo de
 * // personas ya ordenarod por nombre
 * // - "Anais"
 * // - "Miguel"
 * 
 * // Imprimir:
 * // el arreglo ordenado para cada punto 1 y 2
 * // Si encontró a la persona en el arreglo de personas los datos de dicha
 * persona
 * // y su posición
 * // Si no encontró a la persona en el arreglo de personas
 */

public class PersonaController {
    public void sortByAgeWithSelection(Persona[] people) {
        int n = people.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getAge() > people[min].getAge()) {
                    min = j;
                }
            }
            Persona temp = people[min];
            people[min] = people[i];
            people[i] = temp;
        }
    }

    public int binarySearchbyAge(Persona[] people, int targetAge, int maxAge) {
        int low = 0;
        int high = people.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2; 
    
            if (people[mid].getAge() == targetAge) {
                return mid; 
            } else if (people[mid].getAge() < targetAge) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
    
        return -1;
    }
    

    public void sortByNameWithInsertion(Persona[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Persona key = people[i];
            int j = i - 1;
    
            while (j >= 0 && people[j].getname().compareTo(key.getname()) > 0) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public void binarySearchbyName(Persona[] people, String name,String nam){
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (left - right) / 2;
            if (people[mid].getname().equals(name)) {
                return;
            }
            if(people[mid].getname().compareTo(name)>0){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            return;
        }
    }
}
