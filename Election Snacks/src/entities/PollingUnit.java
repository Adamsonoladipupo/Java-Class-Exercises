package entities;

import java.util.ArrayList;

public class PollingUnit {
    // the number of ballot boxes is determine by number of candidates
    private ArrayList <BallotBox> OptionA;
    private ArrayList <BallotBox> OptionB;
    private ArrayList <BallotBox> OptionC;
    private ArrayList <Voter> voters = new ArrayList<>();
    private Voter voter;
    private int count = 0;
    private int voterIDNumber = 99;


    public void addVoter(Voter voter){
        String newVoterID = generateVoterID();
        voter.setVoterID(newVoterID);
        this.voters.add(voter);
        count++;

    }

    public Voter getVoter() {
        return voter;
    }

    public ArrayList<BallotBox> getOptionA() {
        return OptionA;
    }

    public void setOptionA(ArrayList<BallotBox> optionA) {
        OptionA = optionA;
    }

    public ArrayList<BallotBox> getOptionB() {
        return OptionB;
    }

    public void setOptionB(ArrayList<BallotBox> optionB) {
        OptionB = optionB;
    }

    public ArrayList<BallotBox> getOptionC() {
        return OptionC;
    }

    public void setOptionC(ArrayList<BallotBox> optionC) {
        OptionC = optionC;
    }

    public ArrayList<Voter> getVoters() {
        return voters;
    }

    public void setVoters(ArrayList<Voter> voters) {
        this.voters = voters;
    }

    private String generateVoterID(){
        ++voterIDNumber;
        String voterID = "vid" + voterIDNumber;
        //this.voterIDNumber++;
        return voterID;
    }

    public int votersSize() {
        return this.count;
    }
}
