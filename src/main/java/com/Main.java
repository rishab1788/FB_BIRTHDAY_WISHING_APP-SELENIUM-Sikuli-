package com;

/**
 * Created by Rishabh on 8/14/2017.
 */
public class Main {


    public static void main (String args[]) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;


        node1.node = node2;
        node2.node = node3;
        node3.node = node4;


    }

}

