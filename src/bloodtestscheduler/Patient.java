package bloodtestscheduler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikram
 */

public class Patient implements Prioritizable{
    private String name;
    private String priority; // urgent, medium, low
    private int age;
    private String gpDetails;
    private boolean fromHospital;

    // Constructor
    public Patient(String name, String priority, int age, String gpDetails, boolean fromHospital) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }

     @Override
    public String getPriority() { 
        return priority; 
    }
    
    // Getters
    public String getName() { 
        return name; 
    }
    
    public int getAge() { 
        return age; 
    }
    
    public String getGpDetails() { 
        return gpDetails; 
    }
    
    public boolean isFromHospital() { 
        return fromHospital; 
    }
    
}
