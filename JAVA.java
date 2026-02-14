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
import java.util.*;
class RAW_FILE_PRICE_CHECKER {
    public static void main(String[] args) {

        HashMap<String, Integer> PRODUCT_DICTIONARY = new HashMap<>();
        PRODUCT_DICTIONARY.put("PN1", 1);
        PRODUCT_DICTIONARY.put("PN2", 2);
        PRODUCT_DICTIONARY.put("PN3", 3);
        PRODUCT_DICTIONARY.put("PN4", 4);
        PRODUCT_DICTIONARY.put("PN5", 5);
        PRODUCT_DICTIONARY.put("PN6", 6);
        System.out.println(PRODUCT_DICTIONARY);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name (or 'quit' to stop):");
        String p_n = scanner.nextLine();

        if(p_n.equals("quit") || p_n.equals("stop")){
            System.out.println("Program terminated by user.");
        }
        else if(PRODUCT_DICTIONARY.containsKey(p_n)) {
            System.out.println("Product:" + p_n + "\nProduct Price:" + PRODUCT_DICTIONARY.get(p_n));
        }
        else {
            System.out.println("Product is not available");
        }
}
}
class JAVA {

}
class hospital{
    String name;
    Integer age;
    String disease;
    String emergency_status;
    
    HashMap<Integer,String> patient_names = new HashMap<>();
    HashMap<Integer,Integer> patient_age = new HashMap<>();
    HashMap<Integer,String> patient_disease = new HashMap<>();
    HashMap<Integer,String> patient_emergency_status = new HashMap<>();
    
    hospital(String name,Integer age,String disease,String emergency_status){
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.emergency_status = emergency_status;
    }
}

    void display_info(){
        // if (patient_name.containskey(id) == true){
        // }
    }
    void add_patient(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add patient? (yes/no): ");
        int add = sc.nextInt();
        if (add.equals("yes"))
        System.out.println("Enter patient ID: ");
        int id = sc.nextInt();

    
    
    }
    void view_all_paitents(){

    }
    void display_a_paitent(){

    }
    void chg_patients_emg(){

    }

