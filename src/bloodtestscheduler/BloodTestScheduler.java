/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

import java.awt.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author ikram
 */
public class BloodTestScheduler {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private List<Patient> patientList;
    private Stack<Patient> noShowStack;
    private PriorityQueue<Patient> priorityQueue;

    public BloodTestScheduler() {
        patientList = new ArrayList<>();
        noShowStack = new Stack<>();
        priorityQueue = new PriorityQueue<>(new PatientComparator());
    }

    // Add a new patient
    public void addPatient(Patient p) {
        patientList.add(p);
        priorityQueue.add(p);
    }

    // Get the next patient based on priority
    public Patient getNextPatient() {
        return priorityQueue.poll();
    }

    // Add a no-show patient to the stack
    public void addNoShow(Patient p) {
        if (noShowStack.size() >= 5) {
            noShowStack.remove(0); // Remove the oldest no-show if stack is full
        }
        noShowStack.push(p);
    }

    // Display the last 5 no-shows using recursion
    public void displayNoShows(Stack<Patient> stack, int count) {
        if (stack.isEmpty() || count >= 5) {
            return; // Base case
        }
        Patient patient = stack.pop();
        System.out.println("No-show: " + patient.getName());
        displayNoShows(stack, count + 1); // Recursive call
    }

}
