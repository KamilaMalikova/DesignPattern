package com.company.CompositePattern;

import java.util.ArrayList;
import java.util.Random;

public class Generate {
    private static int numNodes = 15;
    private static int maxOfSubNodes = 3;
    private static int levels = 4;
    private static boolean isComposite = true;
    static private TodoList root;

    static public TodoList generateAll(){
        root = new Project("Node", generateSubNodes());
        return root;
    }

    static private ArrayList<TodoList> generateSubNodes(){
        int numOfSubNodes = (int)new Random().nextInt(maxOfSubNodes);
        ArrayList<TodoList> nodes = new ArrayList<>();
        for (int i = 0; i < numOfSubNodes; i++){
            isComposite = getRandomBoolean();
            System.out.println(isComposite);
            if (numNodes == 1){
                nodes.add(new ToDo("Leaf"));
                numNodes--;
                break;
            }
            if (isComposite){
                nodes.add(new Project("Node", generateSubNodes()));
                numNodes--;
            }
            else {
                nodes.add(new ToDo("Leaf"));
                numNodes--;
            }

        }
        return nodes;
    }

    private static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

}
