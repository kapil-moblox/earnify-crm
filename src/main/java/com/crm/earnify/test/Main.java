package com.crm.earnify.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    public List<Apple> sortByLamda(List<Apple> raw) {
        Collections.sort(raw,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        return raw;
    }

    public List<Apple> filterAppleByColor(List<Apple> appleList,Predicate<Apple> predicate) {
        return appleList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String...s) {
        Main invoker = new Main();
        List<Apple> appleList = new ArrayList<>();
        Apple f1=new Apple();
        f1.setName("Green");
        f1.setPrice(1.0);

        Apple f2 = new Apple();
        f2.setName("Red");
        f2.setPrice(2.0);

        Apple f3 = new Apple();
        f3.setName("Green");
        f3.setPrice(3.0);

        appleList.add(f1);
        appleList.add(f2);
        appleList.add(f3);

        System.out.println(invoker.filterAppleByColor(appleList,(o1)->o1.getName().equalsIgnoreCase("Green")));
    }
}
