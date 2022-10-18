package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {
    public static void phoneBook (){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.nextLine();
            in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            in.nextLine();
            if (phoneBook.get(s) == null)
                System.out.println("Not found");
            else
                System.out.println( s +"="+ phoneBook.get(s));
        }

        in.close();
    }
}
