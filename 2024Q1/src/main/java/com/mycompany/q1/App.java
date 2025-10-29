/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_Lab
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         // Cities
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // 2D array [city][0=car, 1=bike]
        int[][] accidents = new int[3][2];

        // Input
        //for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter the number of car accidents for " + cities[0]);
            accidents[0][0] = scan.nextInt();
            System.out.println("Enter the number of motor bike accidents for " + cities[0]);
            accidents[0][1] = scan.nextInt();
            
            System.out.println("Enter the number of car accidents for " + cities[1]);
            accidents[1][0] = scan.nextInt();   //1 represent the city i'm assigning my acc to
            System.out.println("Enter the number of motor bike accidents for " + cities[1]);
            accidents[1][1] = scan.nextInt();
            
            System.out.println("Enter the number of car accidents for " + cities[2]);
            accidents[2][0] = scan.nextInt();
            System.out.println("Enter the number of motor bike accidents for " + cities[2]);
            accidents[2][1] = scan.nextInt();
        //}

        // Display report
        System.out.println("\nCity\t\tCars\tBikes");
        int highest = 0;
        String highestCity = "";
        int total;
        
        for (int i = 0; i < cities.length; i++) {
            
            System.out.println(cities[i] + "\t" + accidents[i][0] + "\t" + accidents[i][1]);
            
            
        }
        
        for(int i =0; i<cities.length; i++){
            total = accidents[i][0] + accidents[i][1];
            System.out.println("\n" + cities[i] +": "+ total);
            
            if (total > highest) {
                highest = total;
                highestCity = cities[i];
            }
        }

        System.out.println("City with most accidents: " + highestCity + " (" + highest + ")");
        
    }
}
