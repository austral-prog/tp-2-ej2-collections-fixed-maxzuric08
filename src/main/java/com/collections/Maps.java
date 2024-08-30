package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
       Map<String, Integer> map = new HashMap<>();
       Set<String> set = new HashSet<>();
       for(String element : items){ set.add(element);}
       for(String element : set){
       }
               return null;
           }
       }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to add or increment items in the inventory using elements from the items list
        return null;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to decrement items in the inventory using elements from the items list
        return null;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // todo: Implement the logic to remove an item from the inventory if it matches the item string
        return null;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        return null;
    }
}