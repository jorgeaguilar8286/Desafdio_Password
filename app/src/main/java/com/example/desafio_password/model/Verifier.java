package com.example.desafio_password.model;

public class Verifier {
    public static final int weak = -1;
    public static final int medium = -2;
    public static final int strong = -3;
    public static final int min_length = 4;

    public int evaluatePass(String pass) {
        if(!evaluateLength(pass)) {
            return weak;
        }
        if (!evaluateUpper(pass)) {
            return medium;
        }
        return strong;
    }
    private boolean evaluateUpper(String pass) { return !pass.toLowerCase().equals(pass);}
    private boolean evaluateLength(String pass) { return pass.length() > min_length;}

}
