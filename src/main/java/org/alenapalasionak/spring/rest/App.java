package org.alenapalasionak.spring.rest;

import org.alenapalasionak.spring.rest.configurtion.MyConfig;
import org.alenapalasionak.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);//определяем,
        // где будем брать бины

        Communication communication = context.getBean("communication", Communication.class);
        //1.
        //List<Employee> employeeList = communication.getAllEmployees();
        //System.out.println(employeeList);

        //2.
//        Employee employee = communication.getEmployee(3);
//        System.out.println(employee);

       //добавление нового работника
        // Employee employee = new Employee("Svet", "Sokolov", "IT", 7200);
        //communication.saveEmployee(employee);

        //апдейт работника
//        Employee employee = new Employee("Svet", "Sokolov", "IT", 900);
//        employee.setId(20);
//        communication.saveEmployee(employee);

        //delete
        communication.deleteEmployee(20);
    }
}
