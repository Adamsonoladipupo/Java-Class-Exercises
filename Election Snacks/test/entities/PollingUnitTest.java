package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PollingUnitTest {
    PollingUnit pollingUnit;

    @BeforeEach
    public void setUp(){
        pollingUnit = new PollingUnit();
    }

    @Test
    public void Test(){
        Voter voter1 = new Voter("Adamson", "adams@gmail.com");
        pollingUnit.addVoter(voter1);
        assertEquals(1, pollingUnit.votersSize());
        System.out.println(voter1.getVoterID());

        Voter voter2 = new Voter("emmanuel", "emma@gmail.com");
        pollingUnit.addVoter(voter2);
        assertEquals(2, pollingUnit.votersSize());
        System.out.print(voter2.getVoterID());
        voter1.setVoterID("123");
        System.out.print(voter1.getVoterID());

    }

}