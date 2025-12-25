package entities;

import java.util.Arrays;

public class Voter {
    private String name;
    private String email;

    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    private String voterID;
    private int count = 999;

    public Voter(String name, String email){
        this.name = name;
        this.email = email;
    }
    public Ballot getBallot() {
        return ballot;
    }

    public void setBallot(Ballot ballot) {
        this.ballot = ballot;
    }

    private Ballot ballot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoterID() {
        return voterID;
    }

//    private String generateVoterID(){
//        String prefix = "";
//        for (int count = 0; count < 4; count++){
//            char letter = this.name.charAt(count);
//            prefix += letter;
//        }
//        String voterID = prefix + (count+1);
//        this.count++;
//        return voterID;
//    }
}
