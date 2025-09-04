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
public class age2 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter age");
    int a1 = input.nextInt();
    
    if (a1 >= 18) {
    System.out.println("Verified");
    }
    else if (a1 <= 17){
    System.out.println("Not Verified");
    }
    else {
    System.out.println("Invalid input");
    }
    }
}
