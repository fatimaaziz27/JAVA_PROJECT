    // Question:
    // hospital management system in java
//create a simple hospital management system using oop concepts in Java
// The system should allow users to odd patients, discharge a patients, display a patient
// and change patient emergency
// Use classes, object, inheritance, polymorphism, and encapsulation in your
// implementation.
// make a Hospital class to manage the collection of books and user interactions.
// with methods: add patients, view all paitents, display a paitent, display a paitent,
// and change patients emergency.
// A sub class Patient to represent Individual patients with attributes like
// Name, Age, Disease and Emergency status, and method displayInfo.
// Also implement user interaction through console input/output
 //Hints:
//Use HashMap to store the collection of books in the library class.
//Key: Patient Nowe, Value: Patient Object

import java.util.HashMap;
import java.util.Scanner;

class hospital{
    String name;
    Integer age;
    String disease;
    String emergency_status;
    
    hospital(String name,Integer age,String disease,String emergency_status){
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.emergency_status = emergency_status;
    }
}

    void add_patient(){

        HashMap<Integer,String> patient_names = new HashMap<>();
        HashMap<Integer,Integer> patient_age = new HashMap<>();
        HashMap<Integer,String> patient_disease = new HashMap<>();
        HashMap<Integer,String> patient_emergency_status = new HashMap<>();
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add patient? (yes/no): ");
        String add = sc.nextLine();
        
        System.out.println("Enter patient id: ");
        int id = sc.nextInt();
        
        if (add.equals("yes"))
        
            System.out.println("Enter patient name: ");
            String name = sc.nextLine();
            patient_names.put(id,name);

            System.out.println("Enter patient age: ");
            int age = sc.nextInt();
            patient_age.put(id,age);

            System.out.println("Enter patient disease: ");
            String disease = sc.nextLine();
            patient_disease.put(id,disease);

            System.out.println("Emergency? (yes/no): ");
            String emg = sc.nextLine();
            patient_names.put(id,emg);

    }

    void display_info(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient ID: ");
        int id = sc.nextInt();
        
        if (patient_name.containskey(id) == true){

            System.out.println(
            "Patient Info: \nName: " + patient_name.get(id)
            +"\nAge: " + patient_age.get(id) 
            + "\nDisease: " + patient_disease.get(id) 
            + "\nEmergency Status: " + patient_emergency_status.get(id));
        }
        else{
            System.out.print("Invalid ID");
        }
    }

    void view_all_paitents(){

        for (i){
            System.out.println("Patient:" + "\nName: " + patient_name.get(i));
        }

    }
    void display_a_paitent(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient ID: ");
        int id = sc.nextInt();
        
        System.out.println(
            "Patient Info:"
            +"\nName: " + patient_name.get(i)
            +"\nAge: " + patient_age.get(i) 
            + "\nDisease: " + patient_disease.get(i) 
            + "\nEmergency Status: " + patient_emergency_status.get(i));
        }
    void chg_patients_emg(){

    }

