package model;
import java.util.ArrayList;

public class Patient {
    float age;
    VitalSigns currentvitalSigns;
    ArrayList<VitalSigns> vitalSignsHistory;


    public Patient(float age){
        this.age = age;
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public boolean isPatientNormal(){
        return currentvitalSigns.areVitalsNormal(age);
    }

    public void addVitals(int rr, int hr, int sbp, double wk, double wp){
        vitalSignsHistory.add(currentvitalSigns);
        currentvitalSigns = new VitalSigns(rr, hr, sbp, wk, wp, this); 
    }

    public String howDoYouFeel() {
        if (isPatientNormal()){
            return "Well";
        }else{
            return "Not good";
        }
    }

    public float getAge() {
        return age;
    }

}
