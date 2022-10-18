package generics;

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
    //Write your code here
    public <T> void printArray (T [] array){
        for (T element: array) {
            System.out.println(element);
        }
    }

}

