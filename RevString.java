package com;
import java.io.*; 
import java.util.Scanner; 
  
class RevString { 
    public static void main (String[] args) { 
        
        String str= "Anu", nstr=""; 
        char ch; 
        
      System.out.print("Original word: "); 
      System.out.println("Anu");         
      for (int i=0; i<str.length(); i++) 
      { 
        ch= str.charAt(i);  
        nstr= ch+nstr; 
      } 
      System.out.println("Reversed word: "+ nstr); 
    } 
} 