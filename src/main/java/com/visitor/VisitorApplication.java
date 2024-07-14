package com.visitor;

import com.visitor.models.Circle;
import com.visitor.models.Rectangle;
import com.visitor.models.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class VisitorApplication {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("A", 14);
        mp.put("B", 2);
        mp.put("C", 2);
        mp.put("D", 4);

        Map.Entry<String, Integer> collect = mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toList()).get(2);

        List<Map.Entry<String, Integer>> collect1 = mp.entrySet().stream().sorted(Collections
                .reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());

        List<Map.Entry<Integer, List<Map.Entry<String, Integer>>>> collect2 =
                mp.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).entrySet()
                        .stream().collect(Collectors.toList());

        Map.Entry<Integer, List<String>> integerListEntry = mp.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream().sorted(Collections.reverseOrder(
                                Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(2);
        System.out.println(integerListEntry);
    }
}