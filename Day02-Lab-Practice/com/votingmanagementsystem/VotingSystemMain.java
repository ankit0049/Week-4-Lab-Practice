package com.votingmanagementsystem;
public class VotingSystemMain {
	public static void main(String[] args) {
		// Creating an instance of VotingSystem to manage votes
		VotingSystem votingSystem = new VotingSystem();

		// Casting some votes
		votingSystem.castVote("Ankit");
		votingSystem.castVote("Vinay");
		votingSystem.castVote("Ashish");
		votingSystem.castVote("Ajeet");
		votingSystem.castVote("Alice");
		votingSystem.castVote("Bob");
		votingSystem.castVote("Chaman");

		// Displaying the votes in the order they were cast
		votingSystem.displayVotesInOrder();

		// Displaying the results sorted by the number of votes
		votingSystem.displayResultsSortedByVotes();

		// Displaying the total votes per candidate
		votingSystem.displayTotalVotes();
	}
}
