import java.util.*;



class JAVA{
     public static void main(String[]args){
         hospital h1 = new hospital();
    while (true) {
    System.out.println("1.Add patient\n2.Display Info\n3.Change Patients Emergency");

    Scanner sc = new Scanner(System.in);
    System.out.println("Select a option");
    Integer options = sc.nextInt();

    switch (options) {
        case 1:
            h1.add_patient();
            break;
        case 2:
            h1.display_info();
            break;
        case 3:
            h1.chg_patients_emg();
            break;
    }

    System.out.println("Do ypu want to continue (yes/no) ?");
    sc.nextLine();
    String choice = sc.nextLine().toLowerCase();
    if (choice.equals("no")) {
        break;
    }
    }
    }
 }
class hospital {

     HashMap<Integer, String> patient_names = new HashMap<>();
     HashMap<Integer, Integer> patient_age = new HashMap<>();
     HashMap<Integer, String> patient_disease = new HashMap<>();
     HashMap<Integer, String> patient_emergency_status = new HashMap<>();


     void add_patient() {

         Scanner sc = new Scanner(System.in);
         System.out.println("Do you want to add patient? (yes/no): ");
         String add = sc.nextLine();

         if (add.equals("yes")) {

             System.out.println("Enter patient id: ");
             int id = sc.nextInt();
             sc.nextLine();

             System.out.println("Enter patient name: ");
             String name = sc.nextLine();
             patient_names.put(id, name);

             System.out.println("Enter patient age: ");
             int age = sc.nextInt();
             patient_age.put(id, age);
             sc.nextLine();

             System.out.println("Enter patient disease: ");
             String disease = sc.nextLine();
             patient_disease.put(id, disease);

             System.out.println("Emergency? (yes/no): ");
             String emg = sc.nextLine();
             patient_emergency_status.put(id, emg);

             System.out.println(patient_names);
             System.out.println(patient_age);
             System.out.println(patient_disease);
             System.out.println(patient_emergency_status);
         }
     }

     void display_info() {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter patient ID: ");
         int id = sc.nextInt();

         if (patient_names.containsKey(id) == true) {

             System.out.println(
                     "Patient Info: \nName: " + patient_names.get(id)
                             + "\nAge: " + patient_age.get(id)
                             + "\nDisease: " + patient_disease.get(id)
                             + "\nEmergency Status: " + patient_emergency_status.get(id));
         } else {
             System.out.println("Invalid ID");
         }
     }

     void chg_patients_emg() {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter patient ID: ");
         Integer id = sc.nextInt();

         if (patient_emergency_status.containsKey(id) == true) {

             if (id.equals("yes")) {
                 patient_emergency_status.put(id, "No");
             }
             else if (id.equals("no")) {
                 patient_emergency_status.put(id, "yes");
             }
         } else {
             System.out.print("Invalid ID");
         }
     }
 }














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

// class JAVA{
//     public static void main(String[]args){
//         hospital h1 = new hospital("b",2,"f","j");
//         h1.add_patient();

//     }
// }


// class hospital{
//     String name;
//     Integer age;
//     String disease;
//     String emergency_status;
    
//     hospital(String name,Integer age,String disease,String emergency_status){
//         this.name = name;
//         this.age = age;
//         this.disease = disease;
//         this.emergency_status = emergency_status;
//     }
// }

//     void add_patient(){

//         HashMap<Integer,String> patient_names = new HashMap<>();
//         HashMap<Integer,Integer> patient_age = new HashMap<>();
//         HashMap<Integer,String> patient_disease = new HashMap<>();
//         HashMap<Integer,String> patient_emergency_status = new HashMap<>();
    
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Do you want to add patient? (yes/no): ");
//         String add = sc.nextLine();
        
//         System.out.println("Enter patient id: ");
//         int id = sc.nextInt();
        
//         if (add.equals("yes")){
        
//             System.out.println("Enter patient name: ");
//             String name = sc.nextLine();
//             patient_names.put(id,name);

//             System.out.println("Enter patient age: ");
//             int age = sc.nextInt();
//             patient_age.put(id,age);

//             System.out.println("Enter patient disease: ");
//             String disease = sc.nextLine();
//             patient_disease.put(id,disease);

//             System.out.println("Emergency? (yes/no): ");
//             String emg = sc.nextLine();
//             patient_names.put(id,emg);
//     }
// }

    // void display_info(){
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter patient ID: ");
    //     int id = sc.nextInt();
        
    //     if (patient_name.containskey(id) == true){

    //         System.out.println(
    //         "Patient Info: \nName: " + patient_name.get(id)
    //         +"\nAge: " + patient_age.get(id) 
    //         + "\nDisease: " + patient_disease.get(id) 
    //         + "\nEmergency Status: " + patient_emergency_status.get(id));
    //     }

    //     else{
    //         System.out.print("Invalid ID");
    //     }
    // }



    // void view_all_paitents(){

    //     for (int i=0; patient_name.size<i; i++){
    //         System.out.println("Patient:" + "\nName: " + patient_name.get(i));
    //     }

    // }



    // void display_a_paitent(){ 

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter patient name: ");
    //     String name = sc.nextLine();

    //     if (patient_name.containskey(name) == true)

    //         System.out.println(
    //         "Patient Info:"
    //         +"\nName: " + patient_name.get(i)
    //         +"\nAge: " + patient_age.get(i) 
    //         + "\nDisease: " + patient_disease.get(i) 
    //         + "\nEmergency Status: " + patient_emergency_status.get(i));

    // }

    // void chg_patients_emg(){
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter patient ID: ");
    //     Integer id = sc.nextInt();
        
    //     if (patient_emergency_status.containskey(id) == true){
            
    //         if (id.equals("yes")){
    //             patient_emergency_status.put(id,"No");
    //         }
            
    //         else if (id.equals("no")){
    //             patient_emergency_status.put(id,"yes");
    //         }
    //     }
        
    //     else{
    //         System.out.print("Invalid ID");
    //     }
    // }









// import java.util.*;
// class JAVA{
//     public static void main(String[]args){
//         hospital h1 = new hospital("b",2,"f","j");
//         h1.add_patient();
//     }
// }
// class hospital{
//     String name;
//     Integer age;
//     String disease;
//     String emergency_status;
    
//     hospital(String name,Integer age,String disease,String emergency_status){
//         this.name = name;
//         this.age = age;
//         this.disease = disease;
//         this.emergency_status = emergency_status;
//     }

//     void add_patient(){

//         HashMap<Integer,String> patient_names = new HashMap<>();
//         HashMap<Integer,Integer> patient_age = new HashMap<>();
//         HashMap<Integer,String> patient_disease = new HashMap<>();
//         HashMap<Integer,String> patient_emergency_status = new HashMap<>();
    
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Do you want to add patient? (yes/no): ");
//         String add = sc.nextLine();
        
//         System.out.println("Enter patient id: ");
//         int id = sc.nextInt();
        
//         if (add.equals("yes")){
        
//             System.out.println("Enter patient name: ");
//             String name = sc.nextLine();
//             patient_names.put(id,name);

//             System.out.println("Enter patient age: ");
//             int age = sc.nextInt();
//             patient_age.put(id,age);

//             System.out.println("Enter patient disease: ");
//             String disease = sc.nextLine();
//             patient_disease.put(id,disease);

//             System.out.println("Emergency? (yes/no): ");
//             String emg = sc.nextLine();
//             patient_names.put(id,emg);
//         }
//         System.out.println(patient_names);
//         System.out.println(patient_age);
//         System.out.println(patient_disease);
//         System.out.println(patient_emergency_status);
//     }}








class JAVA{
    public static void main(String[]args){
        // hospital h1 = new hospital("b",2,"f","j");
        // h1.add_patient();
    }
}


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
        
        HashMap<Integer,String> patient_names = new HashMap<>();
        HashMap<Integer,Integer> patient_age = new HashMap<>();
        HashMap<Integer,String> patient_disease = new HashMap<>();
        HashMap<Integer,String> patient_emergency_status = new HashMap<>();
    }
}

class add_patient extends hospital{

    void add_patient(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add patient? (yes/no): ");
        String add = sc.nextLine();
        
        System.out.println("Enter patient id: ");
        int id = sc.nextInt();
        
        if (add.equals("yes")){
        
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

    }
}

class display_info extends hospital{
    
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
}



class view_all_paitents extends hospital{

    void view_all_paitents(){
        for (int i=0; patient_name.size<i; i++){
            System.out.println("Patient:" + "\nName: " + patient_name.get(i));
        }
    }
}

class display_a_paitent extends hospital{ 

    void display_a_paitent(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient name: ");
        String name = sc.nextLine();

        if (patient_name.containskey(name) == true){
            System.out.println(
            "Patient Info:"
            +"\nName: " + patient_name.get(i)
            +"\nAge: " + patient_age.get(i) 
            + "\nDisease: " + patient_disease.get(i) 
            + "\nEmergency Status: " + patient_emergency_status.get(i));
            }
        }
    }

class chg_patients_emg extends hospital{
    
    void chg_patients_emg(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient ID: ");
        Integer id = sc.nextInt();
        
        if (patient_emergency_status.containskey(id) == true){
            
            if (id.equals("yes")){
                patient_emergency_status.put(id,"No");
            }
            
            else if (id.equals("no")){
                patient_emergency_status.put(id,"yes");
            }
        }
        
        else{
            System.out.print("Invalid ID");
        }

    }
}
