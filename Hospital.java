import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
interface Sch{
    void slotsDisplay();
    void slotsAvailable(int slot);
}
 interface Portal{
   boolean isValidEmail(String email);
   boolean isValidPhoneNumber(String phoneNumber);
   void setEmail(String email);
   void setMobileNumber(String mobileNumber);
   void setEmergencyContact(String emergencyContact);

}
 class AboutUs {
    static void ourMission() {
        System.out.println("\nOur Mission:");
        System.out.println("At Medtec Hospital, our mission is to provide high-quality healthcare services to our community.");
        System.out.println("We are dedicated to improving the health and well-being of our patients through");
        System.out.println("compassionate care, innovative treatments, and a patient-centered approach.");
    }

    static void ourAchievements() {
        System.out.println("\n Our Achievements and Recognitions:");
        System.out.println("1. Accredited by the Healthcare Accreditation Board for excellence in patient care.");
        System.out.println("2. Recognized as the 'Best Hospital in the Region' for three consecutive years.");
        System.out.println("3. Achieved a 98% patient satisfaction rate in our recent survey.");
        System.out.println("4. Received awards for outstanding contributions in medical research and education.");
    }
    static void listOfDoctors() {
        System.out.println("\nList of Our Doctors:");
        System.out.println("1. Dr. doc1 - Gynecologist");
        System.out.println("2. Dr. doc2 - Dermatologist");
        System.out.println("3. Dr. doc3 - Psychiatrist");
        System.out.println("4. Dr. doc4- Pediatrician");
        System.out.println("5. Dr. doc5 - Ophthalmologist");
        System.out.println("6. Dr. doc6 - Dentist");
        System.out.println("7. Dr. doc7 - Orthopedic Surgeon");
    }
}
class FeedbackPortal 
{
    protected static ArrayList<String> feedbackList = new ArrayList<>();
    void Feedback(String feedback) {
        feedbackList.add(feedback);
        System.out.println("Thank you for your feedback. It has been recorded.");
    }
    static void testaments() {
        System.out.println("Feedback from Patients:");
        for (String feedback : feedbackList) {
            System.out.println(feedback);
        }
    }
}
class DoctorSchedule extends FeedbackPortal implements Sch
{
    static ArrayList<String> timeSlots=new ArrayList<>(List.of(" 9am-10am"," 10am to 11am"," 11am-12 noon"," 12 noon to 1pm"," 3pm-4pm"," 4pm-5pm"," 5pm-6pm"," 6pm-7pm"));
    @Override
    public void slotsDisplay(){
        System.out.println("Pick up the slot you want to schedule your apppointment in: ");
        for(String x:timeSlots)
        {
            System.out.println(x);
        }
    }
    /**
     * @param slot
     */
    @Override
    public void slotsAvailable(int slot){
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
        System.out.println("Types of doctors available:\n 1. gynac\n 2. dermatologist\n 3. psychiatrist\n 4. pediatrician\n 5. ophthalmologist\n 6. dentist\n 7. Orthopedic");
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
/** @author Priyansahi Rai
 * Class for creating patient's profile
 */
class CreatePortal extends TypeOfAppointment implements Portal
{
    private int appointmentNumber;
    private String name;
    private int age;
    private String mobileNumber;
    private char gender;
    private float weight;
    private float height;
    private String email;
    private String allergies;
    private char type;
    private String emergencyContact;
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
    CreatePortal(String name,int age,float weight,float height,char gender, String allergies,int count)
    {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.gender = gender;
        this.allergies = allergies;
        count++;
        appointmentNumber=count;
    }
    /**
     * Validation for email
     * @param email
     * @return true the emails is in appropriate format
     */
    //---------------------------------VALIDATION---------------------------------
    @Override
    public boolean isValidEmail(String email) {
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
    @Override
     public boolean isValidPhoneNumber(String phoneNumber) {
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
    @Override
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }
    @Override
    public void setMobileNumber(String mobileNumber) {
        if (isValidPhoneNumber(mobileNumber)) {
            this.mobileNumber = mobileNumber;
        } else {
            System.out.println("Invalid mobile number");
        }
    }
    @Override
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
public class Hospital
{
    /**
     * @param args This is the main function
     */
    static{
        System.out.println("|-----------------------------------------------|");
        System.out.println("|Welcome to the Online Portal of Medtec Hospital|");
        System.out.println("|-----------------------------------------------|");
                System.out.println("     _____");
                System.out.println("    ,\\_+_/,");
                System.out.println("   '(\"\"\")'");
                System.out.println("   '(|o,o|)'");
                System.out.println("    '; = ;'");
                System.out.println("     _) (_");
                System.out.println("   /' \\_/ '\\");
                System.out.println("  /\\(_ : _)/\\");
                System.out.println(" /||/)___( \\ \\");
                System.out.println("|_)'    \\/ /");
                System.out.println("   |      (_/");
                System.out.println("   |       |");
                System.out.println("   |       |");
                System.out.println("   |_______|");
                System.out.println("    \\  |  /");
                System.out.println("     : | :");
                System.out.println("     ; | ;");
            }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int count=0;
        CreatePortal[] patient = new CreatePortal[20];
        ArrayList<String> appointments= new ArrayList<>();
        while (true) 
        {
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
                    System.out.println("***************************");
                    System.out.println("Create your Patient Profile");
                    System.out.println("*****************************");
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    System.out.print("Enter weight(kgs): ");
                    float weight = input.nextFloat();
                    System.out.print("Enter height(cms): ");
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
                    System.out.println("**********************");
                    System.out.println("Scheduling Appointment");
                    System.out.println("**********************");
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
                        appointments.add("Patient Name: "+patient[id].getName()+" and the slotChosen : " + slotChosen);
                    } 
                    else {
                        System.out.println("Patient profile not created yet.");
                    }
                    break;

                case 3:
                System.out.println("************************");
                    System.out.println("View Patient Records");
                    System.out.println("**********************");
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
                    catch(IndexOutOfBoundsException e){
                        System.out.println("id doesn't exist");
                    }
                    break;

                case 4:
                        System.out.println("  __");
                        System.out.println(" (`/\\");
                        System.out.println(" `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__");
                        System.out.println("  `=\\/\\               \\ /               \\\\");
                        System.out.println("   `=\\/                V                 \\\\");
                        System.out.println("   //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\");
                        System.out.println("  //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\");
                        System.out.println(" ===( INK )==========\\\\|//====================");
                        System.out.println("_____\\___/____________`---`_____________________");
                System.out.println("Feedback & Testament");
                System.out.println("Please Leave a feedback");
                System.out.print("Enter appointment number: ");
                int i= input.nextInt();
                input.nextLine();
                String fb=input.nextLine();
                try{
                patient[i].Feedback(fb);
                 }
                 catch(NullPointerException e){
                    System.out.println("id doesn't exist");
                 }


                case 5:
                System.out.println("*************");
                    System.out.println("About us!");
                    System.out.println("************");
                AboutUs.ourAchievements();
                AboutUs.ourMission();
                AboutUs.listOfDoctors();
                break;

                case 6:
                System.out.println("****************");
                System.out.println("Today's Schedule");
                System.out.println("******************");
                for (var ii: appointments){
                    System.out.println(ii);
                }
                break;
                
                case 7:
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
