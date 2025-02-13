package com.votingmanagementsystem;

import java.util.*;

public class VotingSystem {
    // HashMap to store votes by candidate name
    private Map<String, Integer> votesHashMap = new HashMap<>();

    // LinkedHashMap to store votes maintaining the order in which votes were cast
    private Map<String, Integer> votesLinkedHashMap = new LinkedHashMap<>();

    // TreeMap to store votes and automatically sort them in descending order
    private TreeMap<Integer, List<String>> votesTreeMap = new TreeMap<>(Collections.reverseOrder());

    // Cast a vote for the candidate
    public void castVote(String candidateName) {
	   int newVoteCount = votesHashMap.getOrDefault(candidateName, 0) + 1;

	   // Remove the candidate's old vote count from TreeMap
	   if (votesHashMap.containsKey(candidateName)) {
		  int oldVoteCount = votesHashMap.get(candidateName);
		  votesTreeMap.get(oldVoteCount).remove(candidateName);
		  if (votesTreeMap.get(oldVoteCount).isEmpty()) {
			 votesTreeMap.remove(oldVoteCount);
		  }
	   }

	   // Update HashMap and LinkedHashMap
	   votesHashMap.put(candidateName, newVoteCount);
	   votesLinkedHashMap.put(candidateName, newVoteCount);

	   // Update TreeMap
	   votesTreeMap.putIfAbsent(newVoteCount, new ArrayList<>());
	   votesTreeMap.get(newVoteCount).add(candidateName);
    }

    // Displays all votes in the order in which they were cast
    public void displayVotesInOrder() {
	   System.out.println("\nVotes in Order (LinkedHashMap):");
	   for (Map.Entry<String, Integer> entry : votesLinkedHashMap.entrySet()) {
		  System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
	   }
    }

    // Displays the results sorted by vote count
    public void displayResultsSortedByVotes() {
	   System.out.println("\nResults Sorted by Votes (TreeMap):");
	   for (Map.Entry<Integer, List<String>> entry : votesTreeMap.entrySet()) {
		  for (String candidate : entry.getValue()) {
			 System.out.println("Candidate: " + candidate + ", Votes: " + entry.getKey());
		  }
	   }
    }

    // Displays the total number of votes for each candidate
    public void displayTotalVotes() {
	   System.out.println("\nTotal Votes (HashMap):");
	   for (Map.Entry<String, Integer> entry : votesHashMap.entrySet()) {
		  System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
	   }
    }

    // Getter method for total votes (for testing)
    public Map<String, Integer> getTotalVotes() {
	   return new HashMap<>(votesHashMap);
    }


    // Getter method for sorted results (for testing)
    public Map<String, Integer> getSortedResultsByVotes() {
	   Map<String, Integer> sortedVotes = new LinkedHashMap<>();
	   for (Map.Entry<Integer, List<String>> entry : votesTreeMap.entrySet()) {
		  for (String candidate : entry.getValue()) {
			 sortedVotes.put(candidate, entry.getKey());
		  }
	   }
	   return sortedVotes;
    }
}
