package com.javapractice.collectionframeworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapImplementation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Alice Johnson");
        emp1.setDepartment("Marketing");
        emp1.setEmail("alice.johnson@example.com");
        emp1.setContactNum("555-1234");
        emp1.setSalary(60000);

        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("Bob Smith");
        emp2.setDepartment("Sales");
        emp2.setEmail("bob.smith@example.com");
        emp2.setContactNum("555-5678");
        emp2.setSalary(55000);

        Employee emp3 = new Employee();
        emp3.setId(103);
        emp3.setName("Carol Williams");
        emp3.setDepartment("HR");
        emp3.setEmail("carol.williams@example.com");
        emp3.setContactNum("555-8765");
        emp3.setSalary(58000);

        Employee emp4 = new Employee();
        emp4.setId(104);
        emp4.setName("David Brown");
        emp4.setDepartment("IT");
        emp4.setEmail("david.brown@example.com");
        emp4.setContactNum("555-4321");
        emp4.setSalary(75000);

        Employee emp5 = new Employee();
        emp5.setId(105);
        emp5.setName("Emma Davis");
        emp5.setDepartment("Finance");
        emp5.setEmail("emma.davis@example.com");
        emp5.setContactNum("555-6543");
        emp5.setSalary(67000);

        Employee emp6 = new Employee();
        emp6.setId(104);
        emp6.setName("David Brown");
        emp6.setDepartment("IT");
        emp6.setEmail("david.brown@example.com");
        emp6.setContactNum("555-4321");
        emp6.setSalary(75000);
/*
        HashMap<String,Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put("Employee-1",emp1);
        employeeHashMap.put("Employee-2",emp2);
        employeeHashMap.put("Employee-3",emp3);
        employeeHashMap.put("Employee-4",emp4);
        employeeHashMap.put("Employee-5",emp5);
        employeeHashMap.put("Employee-6",emp6);

        System.out.println(employeeHashMap);

        System.out.println(employeeHashMap.get("Employee-1"));
*/
        LinkedHashMap<Integer,Employee> employeeLinkedHashMap = new LinkedHashMap<>();
        employeeLinkedHashMap.put(111,emp1);
        employeeLinkedHashMap.put(222,emp2);
        employeeLinkedHashMap.put(333,emp3);
        employeeLinkedHashMap.put(444,emp4);
        employeeLinkedHashMap.put(555,emp5);
        employeeLinkedHashMap.put(666,emp6);
//        to print all employees in key-pair values using lambda function
        employeeLinkedHashMap.forEach((key,value) -> System.out.println(key + " : " + value));
        System.out.println();

        TreeMap<String,Employee> employeeTreeMap = new TreeMap<>();
        employeeTreeMap.put("Employee-1",emp1);
        employeeTreeMap.put("Employee-2",emp2);
        employeeTreeMap.put("Employee-3",emp3);
        employeeTreeMap.put("Employee-4",emp4);
        employeeTreeMap.put("Employee-5",emp5);
        employeeTreeMap.put("Employee-6",emp6);

//     to print all employees in key-pair values

        for (Entry<String,Employee> employeeEntry :employeeTreeMap.entrySet()){
            System.out.println(employeeEntry.getKey() + " : " + employeeEntry.getValue());
        }





    }
}
