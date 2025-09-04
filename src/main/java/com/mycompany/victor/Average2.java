/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.victor;
import java.util.Scanner;
/**
 *
 * @author corte
 */
public class Average2 {
    public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter Grade:");
    int g1 = input.nextInt();
    System.out.println("Enter Grade:");
    int g2 = input.nextInt();
    System.out.println("Enter Grade:");
    int g3 = input.nextInt();
    System.out.println("Enter Grade:");
    int g4 = input.nextInt();
    
    int ave = (g1 + g2 + g3 + g4) /4;
    System.out.println("Average:" +ave);
    
    
    }    
}
