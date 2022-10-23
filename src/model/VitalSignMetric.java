package model;

public class VitalSignMetric {
    String name;
    double value;
    

    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }

    
    public VitalSignMetric(String n, double v){
        name = n;
        value = v;
    }

}
