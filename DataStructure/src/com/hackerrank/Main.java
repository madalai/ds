package com.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(); 
        int count = Integer.parseInt(s1);
        for(int i = 1; i<= count;i++){
        String s = sc.nextLine();                 // Reading input from STDIN
        String str[]= s.split(" ");
        double h = Double.parseDouble(str[0]);
         double x = Double.parseDouble(str[1]);
          double z = Double.parseDouble(str[2]);
          
          double razT = Math.sqrt(2*h/32);
          double rahulT = z/x;
          
          if(rahulT <= razT){
              System.out.println("Rahul");
          }
          else{
              System.out.println("Raj");
          }
        }

    }

}
