package model;

import java.util.ArrayList;

public class VitalSigns {
    Patient patient;
    ArrayList<VitalSignMetric> metrics;


    public VitalSigns(int rr, int hr, int bp, double w_in_k, double w_in_p, Patient p){

        metrics = new ArrayList<VitalSignMetric>();
        metrics.add(new VitalSignMetric("Respiratory Rate", rr));
        metrics.add(new VitalSignMetric("Heart Rate", hr));
        metrics.add(new VitalSignMetric("Blood Pressure", bp));
        metrics.add(new VitalSignMetric("Weight in KG", w_in_k));
        metrics.add(new VitalSignMetric("Weight in lbs", w_in_p));
        patient = p;
    }

    public boolean areVitalsNormal(float age){
        boolean result = true;
        for (VitalSignMetric vsign : metrics)
            if (!isVitalSignNormal(vsign)) result = false;
        return result;
    }
        

    public boolean isVitalSignNormal(VitalSignMetric metric){
        boolean result = true;
        float age = patient.getAge();
        if (metric.getName() == "Respiratory Rate"){
            if ((age == 0.0f) && ((metric.getValue()<30) || (metric.getValue()>50))) result = false;
            if ((inAgeRange(age, 0, 12)) && (inRange(metric.getValue(), 20, 30))) result = false;
            if ((age >= 13.0f) && (inRange(metric.getValue(), 12, 20))) result = false;
        }

        if (metric.getName() == "Heart Rate"){
            if ((age == 0.0f) && ((metric.getValue()<120) || (metric.getValue()>160))) result = false;
            if ((inAgeRange(age, 0, 1)) && (inRange(metric.getValue(), 80, 140))) result = false;
            if ((inAgeRange(age, 1, 3)) && (inRange(metric.getValue(), 80, 130))) result = false;
            if ((inAgeRange(age, 3, 5)) && (inRange(metric.getValue(), 80, 120))) result = false;
            if ((inAgeRange(age, 5, 12)) && (inRange(metric.getValue(), 70, 110))) result = false;
            if ((age >= 13.0f) && (inRange(metric.getValue(), 55, 105))) result = false;
        }
        
        if (metric.getName() == "Blood Pressure"){
            if ((age == 0.0f) && ((metric.getValue()<50) || (metric.getValue()>70))) result = false;
            if ((inAgeRange(age, 0, 1)) && (inRange(metric.getValue(), 4, 10))) result = false;
            if ((inAgeRange(age, 1, 3)) && (inRange(metric.getValue(), 10, 14))) result = false;
            if ((inAgeRange(age, 3, 5)) && (inRange(metric.getValue(), 14, 18))) result = false;
            if ((inAgeRange(age, 5, 12)) && (inRange(metric.getValue(), 20, 42))) result = false;
            if ((age >= 13.0f) && (metric.getValue()<50)) result = false;
        }
            
        if (metric.getName() == "Weight in KG"){
            if ((age == 0.0f) && ((metric.getValue()<2) || (metric.getValue()>3))) result = false;
            if ((inAgeRange(age, 0, 1)) && (inRange(metric.getValue(), 4, 10))) result = false;
            if ((inAgeRange(age, 1, 3)) && (inRange(metric.getValue(), 10, 14))) result = false;
            if ((inAgeRange(age, 3, 5)) && (inRange(metric.getValue(), 14, 18))) result = false;
            if ((inAgeRange(age, 5, 12)) && (inRange(metric.getValue(), 20, 42))) result = false;
            if ((age >= 13.0f) && (metric.getValue()<50)) result = false;
        }

        if (metric.getName() == "Weight in lbs"){
            if ((age == 0.0f) && ((metric.getValue()<4.5) || (metric.getValue()>7))) result = false;
            if ((inAgeRange(age, 0, 1)) && (inRange(metric.getValue(), 9, 22))) result = false;
            if ((inAgeRange(age, 1, 3)) && (inRange(metric.getValue(), 22, 31))) result = false;
            if ((inAgeRange(age, 3, 5)) && (inRange(metric.getValue(), 31, 40))) result = false;
            if ((inAgeRange(age, 5, 12)) && (inRange(metric.getValue(), 41, 92))) result = false;
            if ((age >= 13.0f) && (metric.getValue()<110)) result = false;
        }

        return result;
    }

    public boolean inRange(double d, double min, double max){
        if ((d < min) || (d > max)) return false;
        else return true;
    }

    public boolean inAgeRange(double age, double min, double max){
        if((age>min) && (age<=max))return true;
        else return false;
    }

}
