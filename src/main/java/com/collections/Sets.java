package com.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    public static String checkDrinks(String drink_name, List<String> drink_ingredients){
        Set<String> set= new HashSet<>();
        for(String element : drink_ingredients){ set.add(element);}
        for(String element : set) {
            if (ALCOHOLS.contains(element)) {
                return drink_name + " Cocktail";
            }}
        return drink_name+" Mocktail";
}
}
