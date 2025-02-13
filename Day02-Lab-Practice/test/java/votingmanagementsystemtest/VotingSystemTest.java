package votingmanagementsystemtest;

import com.votingmanagementsystem.VotingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        // Initializing VotingSystem before each test
        votingSystem = new VotingSystem();

        // Casting some votes for testing
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Vinay");
        votingSystem.castVote("Ashish");
        votingSystem.castVote("Ajeet");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
    }

    @Test
    void testCastVote() {
        // Casting a new vote and checking if it's counted
        votingSystem.castVote("Chaman");

        // Getting total votes for Chaman
        int chamanVotes = votingSystem.getTotalVotes().getOrDefault("Chaman", 0);
        assertEquals(1, chamanVotes);
    }

    @Test
    void testTotalVotes() {
        // Checking if Alice's votes are counted correctly
        int aliceVotes = votingSystem.getTotalVotes().get("Alice");
        assertEquals(2, aliceVotes);

        // Checking if Ankit's votes are counted correctly
        int ankitVotes = votingSystem.getTotalVotes().get("Ankit");
        assertEquals(1, ankitVotes);
    }

    @Test
    void testSortedResultsByVotes() {
        // Getting results sorted by vote count
        Map<String, Integer> sortedResults = votingSystem.getSortedResultsByVotes();

        // Ensuring the candidate with most votes is first
        String topCandidate = sortedResults.keySet().iterator().next();
        assertEquals("Alice", topCandidate);
    }
}
