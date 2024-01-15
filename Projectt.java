package Project;

import java.util.*;

interface authorization {
    int administrator_Id = 0;
    int team_manager_Id = 1;
}

interface race {
    private void race_scheduler() {}
    private void input_results() {}
}

class current_race_details {
    public void display_race_details(String location,double track_distance,int race_BeginTime,int race_EndTime) {
        System.out.println("The current race loccation is " + location);
        System.out.println("The track is of distnce " + track_distance + "km");
        System.out.println("The race will begin at : " + race_BeginTime + "and will end at : " + race_EndTime);
    }
    private void edit_race_details() {
        String Location;
        double track_distance;
        int race_BeginTime;
        int race_EndTime;
    }
}

class championship {
    public void view_championship_details() {}   
    private void edit_championship_details() {}
    public void view_championship_standings() {}
    public void view_upcoming_races() {}
    public void view_past_races() {}
}

interface teams {
    private void add_team() {}
    private void delete_team() {}
    private void edit_team() {}
}

class team {
    private void update_PitStop_team() {}
    private void update_mechanics() {}
    public void view_teamSheets() {}
}

class driver {
    private void update_drivers() {}
    public void view_driver_details() {}
}

class administrator implements authorization {
    static {
        System.out.println("Welcome administrator ");
    }
    public void authorize() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your name");
        String administrator_name = sc.next();
        System.out.println("Please enter your Card Number");
        Long Administrator_id = sc.nextLong();
        if (Administrator_id != authorization.administrator_Id) {
            System.out.println("Invalid Card Number");
            System.exit(0);
        }
        System.out.println("Please enter your password");
        String administrtor_password = sc.next();
        int temp = administrator_name.length();
        String Administrator_Id = (""+ administrator_name.charAt(0) + administrator_name.charAt(temp) + authorization.administrator_Id + administrtor_password.charAt(0) + administrtor_password.charAt(1));
        System.out.println("Your unique Id is : " + Administrator_Id);
        sc.close();            
    }
}

class team_manager {}

class viewer {}

class choose {
    public int choosee() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please Choose who are you");
        System.out.println("1-ADMINISTRTOR\t2-TEAM MANAGER\t3-VIEWER");
        int a = sc.nextInt();
        sc.close();
        return a;
    }
}

/*---------------------------------------------------------------------------------------------------
-----------------------------------------MAIN CLASS STARTS HERE--------------------------------------
-----------------------------------------------------------------------------------------------------*/

public class Projectt {
    static 
    {
        System.out.println("WELCOME TO F1 MANAGMENT SYSTEM");
    }
    public static void main(String args[]) {
        choose choose_option = new choose();
        int ChoosenOption = choose_option.choosee();

    
        if(ChoosenOption == 1) {
            administrator newAdministrator = new administrator();
            newAdministrator.authorize();
        }
    }
}
