package com.shankar.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingCollectionsWithLambda {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(20);
        arrayList.add(2);
        arrayList.add(210);
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(1);

        //here changing the sorting to descending order using the compare method with lambda expression
        Collections.sort(arrayList, (a, b) -> a > b ? -1 : a < b ? 1 : 0);
        System.out.println(arrayList);

        //by default sorts in ascending order customized using lambda to descending order
        TreeSet<Integer> treeSet = new TreeSet<>((a, b) -> a > b ? -1 : a < b ? 1 : 0);
        treeSet.add(20);
        treeSet.add(2);
        treeSet.add(210);
        treeSet.add(0);
        treeSet.add(10);
        treeSet.add(1);
        System.out.println(treeSet);

        //by default sorts in ascending order for the key customized using lambda to descending order
        TreeMap<Integer, String> treeMap = new TreeMap<>((a, b) -> a > b ? -1 : a < b ? 1 : 0);
        treeMap.put(20, "A");
        treeMap.put(2, "B");
        treeMap.put(210, "C");
        treeMap.put(0, "D");
        treeMap.put(10, "E");
        treeMap.put(1, "F");
        System.out.println(treeMap);

        //sorting customized object using lambda expression
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Shankar"));
        employeeList.add(new Employee(8, "Kiran"));
        employeeList.add(new Employee(3, "Prakash"));
        employeeList.add(new Employee(2, "Sumit"));
        employeeList.add(new Employee(0, "Gayatri"));
        employeeList.add(new Employee(9, "Geeta"));
        employeeList.add(new Employee(2, "Sagar"));
        employeeList.add(new Employee(4, "Shivansh"));
        System.out.println(employeeList);
        Collections.sort(employeeList, (a, b) -> a.eno < b.eno ? -1 : a.eno > b.eno ? 1 : 0);
        System.out.println(employeeList);


    }
}

class Employee {
    int eno;
    String name;

    public Employee(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }
}
