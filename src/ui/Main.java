package ui;

import model.Patient;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Patient a = new Patient(0.0f);
        a.addVitals(40, 1, 6, 0.5, 0.8);
        a.addVitals(15, 1, 1, 1.0, 1.2);
        a.addVitals(35, 140, 60, 2.5, 3.5);
        System.out.println("a, How do you feel? " + a.howDoYouFeel());

        Patient b = new Patient(1.5f);
        b.addVitals(60, 3, 8, 0.6, 0.8);
        b.addVitals(55, 3, 8, 1.3, 1.4);
        b.addVitals(100, 60, 60, 200.5, 215.5);
        System.out.println("b, How do you feel? " + b.howDoYouFeel());

        Patient c = new Patient(5.0f);
        c.addVitals(80, 1, 6, 0.8, 0.9);
        c.addVitals(15, 1, 1, 1.0, 1.2);
        c.addVitals(35, 140, 60, 2.5, 5.5);
        System.out.println("c, How do you feel? " + c.howDoYouFeel());

        Patient d = new Patient(6.8f);
        d.addVitals(45, 2, 6, 5.8, 6.2);
        d.addVitals(45, 1, 6, 6.8, 7.0);
        d.addVitals(250, 148, 600, 100.5, 105.5);
        System.out.println("d, How do you feel? " + d.howDoYouFeel());

        Patient e = new Patient(15.0f);
        e.addVitals(6, 1, 6, 0.5, 0.8);
        e.addVitals(6, 1, 1, 1.2, 1.5);
        e.addVitals(6, 14, 6, 5.5, 6.5);
        System.out.println("e, How do you feel? " + e.howDoYouFeel());

        Patient f = new Patient(0.7f);
        f.addVitals(40, 1, 6, 5.2, 6.0);
        f.addVitals(15, 20, 15, 7.5, 8.1);
        f.addVitals(35, 20, 30, 15.3, 16.5);
        System.out.println("f, How do you feel? " + f.howDoYouFeel());

    }
}
