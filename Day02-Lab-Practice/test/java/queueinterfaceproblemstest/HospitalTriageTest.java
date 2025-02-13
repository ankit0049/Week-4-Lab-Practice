package queueinterfaceproblemstest;

import com.queueinterface.hospitaltrigesystem.Patient;
import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTriageTest {

    @Test
    public void testPatientTriageOrder() {
        // Create a priority queue to manage patient triage based on severity (higher severity first)
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));

        // Add patients with different severity levels
        pq.add(new Patient("Jay", 1));
        pq.add(new Patient("Viru", 5));
        pq.add(new Patient("Ajay", 9));

        // Expected patient order (highest severity first)
        String[] expectedOrder = {"Ajay", "Viru", "Jay"};

        // Check if patients are dequeued in correct order
        for (String expectedName : expectedOrder) {
            assertEquals(expectedName, pq.poll().name, "Incorrect triage order!");
        }
        System.out.println("Correct triage order!");
    }
}
