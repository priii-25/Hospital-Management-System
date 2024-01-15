import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
/*-------------------------------------------------------------------------------------------------------*
 * ---------------------------------------ABOUT US HERE--------------------------------------------------*
 *-------------------------------------------------------------------------------------------------------*/
class AboutUs
{
    void ourMission(){}
    void ourAchievements(){}
    void listOfDoctors(){}
}
/*-------------------------------------------------------------------------------------------------------*
 * ----------------------------------FEEDBACK PORTAL HERE---------------------------------------------*
 *-------------------------------------------------------------------------------------------------------*/
class FeedbackPortal
{

}
/*-------------------------------------------------------------------------------------------------------*
 * ----------------------------------SCHEDULING CLASS HERE//LISTS---------------------------------------------*
 *-------------------------------------------------------------------------------------------------------*/
class DoctorSchedule
{
    ArrayList<String> timeSlots=new ArrayList<>(List.of(" 9am-10am"," 10am to 11am"," 11am-12 noon"," 12 noon to 1pm","3pm-4pm"," 4pm-5pm"," 5pm-6pm","6pm-7pm"));
    void slotsDisplay(){
        System.out.println("Pick up the slot you want to schedule your apppointment in: ");
        for(String x:timeSlots)
        {
            System.out.println(x);
        }
    }
    /**
     * @param slot
     */
    void slotsAvailable(int slot){
        switch(slot){
            case 1:
            System.out.println("your slot "+ timeSlots.get(0)+" has been booked as per your convience");
            timeSlots.remove(0);
            break;

            case 2:
            System.out.println("your slot "+ timeSlots.get(1)+" has been booked as per your convience");
            timeSlots.remove(1);
            break;

            case 3:
            System.out.println("your slot "+ timeSlots.get(2)+" has been booked as per your convience");
            timeSlots.remove(2);
            break;

            case 4:
            System.out.println("your slot "+ timeSlots.get(3)+" has been booked as per your convience");
            timeSlots.remove(3);
            break;

            case 5:
            System.out.println("your slot "+ timeSlots.get(4)+" has been booked as per your convience");
            timeSlots.remove(4);
            break;

            case 6:
            System.out.println("your slot "+ timeSlots.get(5)+" has been booked as per your convience");
            timeSlots.remove(5);
            break;

            case 7:
            System.out.println("your slot "+ timeSlots.get(6)+" has been booked as per your convience");
            timeSlots.remove(6);
            break;

            case 8:
            System.out.println("your slot "+ timeSlots.get(7)+" has been booked as per your convience");
            timeSlots.remove(7);
            break;

            case 9:
            System.out.println("your slot "+ timeSlots.get(8)+" has been booked as per your convience");
            timeSlots.remove(8);
            break;
        }
    }
}
/*-------------------------------------------------------------------------------------------------------*
 * -------------------------------------MANAGE APPOINTMENTS CLASS---------------------------------------------*
 *-------------------------------------------------------------------------------------------------------*/
class TypeOfAppointment extends DoctorSchedule
{
     void display1(){
        System.out.println("Types of doctors available:\n 1. gynac\n 2. dermatologist\n3. psychiatrist\n4. pediatrician\n5. ophthalmologist\n6. dentist\n7. Orthopedic");
    }
    /**
     * @param TypeOfDoctor
     * @param slott
     */
    void display2(int TypeOfDoctor,int slott){
        switch(TypeOfDoctor)
        {
            case 1:
            System.out.println("You want to book appointment for gynac");
            slotsAvailable(slott);
            break;

            case 2:
            System.out.println("You want to book appointment for dermatologist");
            slotsAvailable(slott);
            break;

            case 3:
            System.out.println("You want to book appointment for psychiatrist");
            slotsAvailable(slott);
            break;

            case 4:
            System.out.println("You want to book appointment for pediatrician");
            slotsAvailable(slott);
            break;

            case 5:
            System.out.println("You want to book appointment for ophthalmologist");
            slotsAvailable(slott);
            break;

            case 6:
            System.out.println("You want to book appointment for dentist");
            slotsAvailable(slott);
            break;

            case 7:
            System.out.println("You want to book appointment for Orthopedic");
            slotsAvailable(slott);
            break;
        }
    }
}
/*-------------------------------------------------------------------------------------------------------*
 * -------------------------------------CREATING USER PORTAL---------------------------------------------*
 *-------------------------------------------------------------------------------------------------------*/
/** @author Priyansahi Rai
 * Class for creating patient's profile
 */
class CreatePortal extends TypeOfAppointment
{
    int appointmentNumber;
    String name;
    int age;
    String mobileNumber;
    char gender;
    float weight;
    float height;
    String email;
    String allergies;
    char type;
    String emergencyContact;
    /**
     * parameterised constructor 
     * @param name
     * @param age
     * @param weight
     * @param height
     * @param gender
     * @param allergies
     * @param type
     */
    //---------------------------------CONSTRUCTOR----------------------------
    CreatePortal(String name,int age,float weight,float height,char gender, String allergies,char type,int count)
    {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.gender = gender;
        this.allergies = allergies;
        this.type=type;
        if(type=='e'){
            count++;
            appointmentNumber=count;
        }
        if(type=='r'){
            count++;
            appointmentNumber=count;
        }
    }
    /**
     * Validation for email
     * @param email
     * @return true the emails is in appropriate format
     */
    //---------------------------------VALIDATION---------------------------------
    private boolean isValidEmail(String email) {
        String regexPattern = "^[A-Za-z0-9+_.-]+@(.+)$"; // A simplified email regex pattern
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    /**
     * validation for mobile phone number
     * @param phoneNumber
     * @return true the emails is in appropriate format
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
        String regexPattern = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    //---------------------------------SETTERS START HERE------------------------------
    /**
     * sets the email if the validation check is true(setter for email)
     * @param email
     */
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }
    public void setMobileNumber(String mobileNumber) {
        if (isValidPhoneNumber(mobileNumber)) {
            this.mobileNumber = mobileNumber;
        } else {
            System.out.println("Invalid mobile number");
        }
    }
    public void setEmergencyContact(String emergencyContact) {
        String emergencyContactStr = String.valueOf(emergencyContact);
        if (isValidPhoneNumber(emergencyContactStr)) {
            this.emergencyContact = emergencyContact;
        } else {
            System.out.println("Invalid emergency contact");
        }
    }
    //---------------------------------GETTERS START HERE-----------------------------
    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public char getGender() {
        return gender;
    }
    public float getWeight() {
        return weight;
    }
    public float getHeight() {
        return height;
    }
    /** 
     * @return the email(getter for email)
     */
    public String getEmail() {
        return email;
    }
    public String getAllergies() {
        return allergies;
    }
    public String getEmergencyContact() {
        return emergencyContact;
    }    
}
/*---------------------------------------------------------------------------------------------------*
 *---------------------------------------MAIN CLASS STARTS HERE------------------------------------*
 *---------------------------------------------------------------------------------------------------*/
public class ThirdDraft 
{
    /**
     * @param args This is the main function
     */
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int count=0;
        CreatePortal[] patient = new CreatePortal[20];
        while (true) 
        {
            System.out.println("------Hospital Management System-------");
            System.out.println("1. Create Patient Profile");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. View History");
            System.out.println("4. Feedback &Testaments Portal");
            System.out.println("5. About Us");
            System.out.println("6. View all appointments for today");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    System.out.print("Enter weight: ");
                    float weight = input.nextFloat();
                    System.out.print("Enter height: ");
                    float height = input.nextFloat();
                    System.out.print("Enter gender (M/F/O): ");
                    char gender = input.next().charAt(0);
                    System.out.print("Emergency or Regular? (e/r): ");
                    char type = input.next().charAt(0);

                    input.nextLine(); 

                    System.out.print("Any allergies (Y/N): ");
                    char allergiesChoice = input.next().charAt(0);
                    String allergies="N/A";
                    input.nextLine();
                    if (allergiesChoice == 'Y' || allergiesChoice == 'y') {
                        System.out.print("Enter allergies: ");
                        allergies = input.nextLine();
                        input.nextLine();
                    }
                    try{
                    patient[count]= new CreatePortal(name, age, weight, height,gender, allergies,type,count);
                    System.out.println("Appointment scheduled with appointment number: " + patient[count].getAppointmentNumber() + ". Remember it for future use");
                    }
                    catch(NullPointerException e){
                        System.out.println(("Maximum number of patient limit reached"));
                    }
                    System.out.println("please enter few contact information");
                    System.out.println("Enter mobile number: ");
                    String mobileNumber = input.nextLine();
                    patient[count].setMobileNumber(mobileNumber);

                    System.out.println("Enter email: ");
                    String email = input.nextLine();
                    patient[count].setEmail(email);

                    System.out.print("Enter emergency contact: ");
                    String emergencyContact = input.nextLine();
                    patient[count].setEmergencyContact(emergencyContact);
                    count++;
                    break;

                case 2:
                    System.out.println("-----Scheduling an appointment-----");
                    System.out.print("Enter appointment number: ");
                    int id = input.nextInt();
                    id=id-1;

                    if (patient[id] != null) 
                    {
                        patient[id].display1();
                        int doc=input.nextInt();
                        patient[id].slotsDisplay();
                        int slotChosen=input.nextInt();
                        patient[id].display2(doc,slotChosen);
                    } 
                    else {
                        System.out.println("Patient profile not created yet.");
                    }
                    break;

                case 3:
                    System.out.print("Enter appointment number: ");
                    int idd = input.nextInt();
                    try{
                    idd=idd-1;
                    if (patient[idd] != null) 
                    {
                        display(patient[idd]);
                    } else 
                    {
                        System.out.println("Patient profile not created yet.");
                    }}
                    catch(NullPointerException e){
                        System.out.println("id doesn't exist");
                    }
                break;

                case 4:
                    break;
                case 5:
                    System.out.println("Exiting the portal");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    /**
     * @param patient it accepts the object, patient in this case and displays the patient's details
     */
    static void display(CreatePortal patient) {
            System.out.println("Patient Name: " + patient.getName());
            System.out.println("Patient Age: " + patient.getAge());
            System.out.println("Patient Gender: " + patient.getGender());
            System.out.println("Patient Mobile Number: " + patient.getMobileNumber());
            System.out.println("Patient Email: " + patient.getEmail());
            System.out.println("Patient Emergency Contact: " + patient.getEmergencyContact());
            System.out.println("Patient Weight: " + patient.getWeight());
            System.out.println("Patient Height: " + patient.getHeight());
            System.out.println("Patient Allergies: " + patient.getAllergies());
        }
}

//List<Appointment> appointments= new ArrayList<>()
//appointments.add(new Appointment(patient[i] name, dateTime));
//LocalDateTime now = LocalDateTime.now();
//appointments.add(new Appointment(patient, now));