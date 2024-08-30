package com.collections;

import java.util.List;

public class Lists {
    public static int IndexOf(String color, List<String> colors){
        for(int i = 0; i < colors.size(); i++) {
            if (colors.get(i) == color) {
                return i;}}
    return -1;
    }
    public static int indexOfByIndex(String color, List<String> colors, Integer index){
        for(int i = index; i < colors.size(); i++) {
            if (colors.get(i) == color) {
                return i;}}
        return -1;
    }
    public static int indexOfEmpty(List<String> colors){
        for(int i = 0; i < colors.size(); i++) {
            int stop = 0;
            if (colors.get(i).equals("") && stop < 1){return i;}
        }
    return -1;}

    public static int put(String color, List<String> colors){
        for(int i = 0; i < colors.size(); i++) {
            int stop = 0;
            if (colors.get(i).equals("") && stop < 1){colors.set(i,color);return i;}
        }
    return -1;}

    public static int remove(String color,List<String> colors){
        if (colors.contains(color)){
            int a = 0;
            for(String element : colors){if(color==element){a+=1;}}
            return a;}
        return 0;
    }
}



