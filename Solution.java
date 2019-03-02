package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        
          ArrayList<String> List = new ArrayList<String>();
          
          while(true){
            String s = reader.readLine();
              List.add(s);
              if (s.equals("end")){
                  List.remove(s);
                    break;
              }
              
          }
          
             for (int j = 0; j < List.size(); j++)
            {
                
            System.out.println( List.get(j));
            }  
    }
}
