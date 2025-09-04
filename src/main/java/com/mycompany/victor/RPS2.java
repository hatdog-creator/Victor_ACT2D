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
public class RPS2 {
    public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter player 1:");
    int p1 = input.nextInt();
    System.out.println("Enter player 2:");
    int p2 = input.nextInt();
    
    if (p1 == 1 && p2 == 1)
    {
    System.out.println("Draw");
    }
    else if (p1 == 2 && p2 == 2)
    {
    System.out.println("Draw");
    }
    else if (p1 == 3 && p2 == 3)
    {
    System.out.println("Draw");
    }
    else if (p1 == 1 && p2 == 2)
    {
    System.out.println("Player 2 Win");
    }
    else if (p1 == 1 && p2 == 3)
    {
    System.out.println("Player 1 Win");
    }
    else if (p1 == 2 && p2 == 1)
    {
    System.out.println("Player 1 Win");
    }
    else if (p1 == 2 && p2 == 3)
    {
    System.out.println("Player 2 Win");
    }
    else if (p1 == 3 && p2 == 1)
    {
    System.out.println("Player 2 Win");
    }
    else if (p1 == 3 && p2 == 2)
    {
    System.out.println("Player 1 Win");
    }
    else {
    System.out.println("Invalid input");
    }
    }
}
