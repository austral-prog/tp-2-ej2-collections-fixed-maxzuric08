package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
       Map<String, Integer> map = new HashMap<>();
       Set<String> set = new HashSet<>(items);
       for(String element:set){
           int count = 0;
           for(String element_1 : items){
               if(element_1.equals(element)){count+=1;}
           }
           map.put(element,count);
       }
               return map;
           }

           public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
            Set<String> set = new HashSet<>(items);
                for(String element:set){
                    int count = 0;
                    for(String element_1 : items) {
                        if (element_1.equals(element)) {
                            count += 1;
                        }}

                    if (!inventory.containsKey(element)){
                    inventory.put(element,count);}
                    else {inventory.put(element,inventory.get(element)+count);}

                }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        Set<String> set = new HashSet<>(items);
        for(String element:set){
            int count = 0;
            for(String element_1 : items) {
                if (element_1.equals(element)) {
                    count += 1;
                }}

            if (inventory.get(element)>count){
                inventory.put(element,inventory.get(element)-count);}
            else {inventory.put(element,0);}

        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        for(String element : inventory.keySet()) {
        if (element==item){
            inventory.remove(element); return inventory;}
        }
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        for(String element : inventory.keySet()) {
            if (inventory.get(element)<=0){
                inventory.remove(element);
        }
    }
        List<Map.Entry<String, Integer>> new_list= new ArrayList<>(inventory.entrySet());
        return new_list;
}}
