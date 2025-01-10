package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> personMap = new HashMap<>();
        addMapValue(personMap, "person", new Person("John", "Smith"));
        addMapValue(personMap, "teacher", new Teacher("María", "Montessori", "Educación"));
        addMapValue(personMap, "police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        addMapValue(personMap, "doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return personMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for(Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getSurname() + " " + entry.getValue().getDetails());
        }
    }

    public static void main(String[] args) {
        Map<String, Person> mapa = createHashMap();
        printMapValues(mapa);
    }

}
