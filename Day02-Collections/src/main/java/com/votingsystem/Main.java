package com.votingsystem;

public class Main {
    public static void main(String[] args) {


        Voting votingSystem = new Voting();

        votingSystem.castVote("Nitish");
        votingSystem.castVote("Siddhu");
        votingSystem.castVote("Raj");
        votingSystem.castVote("Nitish");
        votingSystem.castVote("Nitish");
        votingSystem.castVote("Siddhu");

        votingSystem.displayInOrder();
        System.out.println();
        votingSystem.displayinSortedOrder();
        System.out.println();
        votingSystem.displayWinner();
    }
}
