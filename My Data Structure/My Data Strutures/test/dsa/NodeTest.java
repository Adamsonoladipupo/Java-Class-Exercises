package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void createANodeTest() {
        Node node = new Node();
        node.data = 3;
        System.out.println(node);
    }



}