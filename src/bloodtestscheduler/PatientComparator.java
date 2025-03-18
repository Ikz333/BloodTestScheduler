package bloodtestscheduler;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikram
 */

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        // Compare by priority (urgent > medium > low)
        int priorityCompare = p1.getPriority().compareTo(p2.getPriority());
        if (priorityCompare != 0) {
            return -priorityCompare; // Higher priority first
        }

        // Compare by age (older patients first)
        int ageCompare = Integer.compare(p2.getAge(), p1.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        }

        // Compare by hospital status (hospital patients first)
        return Boolean.compare(p2.isFromHospital(), p1.isFromHospital());
    }
}