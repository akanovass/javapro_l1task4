package com.example.javapro_l1t4;

public class TextResult {
    private static String result="";

    public static void newText(String res){
        result += res;
    }
    public static String getResult() {
        return result;
    }
}
