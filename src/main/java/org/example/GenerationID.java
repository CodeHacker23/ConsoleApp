package org.example;

public class GenerationID {
    private static int ID = 1;

    public static int getId(){
        return ID++;
    }
}
