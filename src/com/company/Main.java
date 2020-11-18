package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    Integer[] integers={1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] ars) throws  Exception {
Main main=new Main();
ArrayList<Integer> list =new ArrayList<>();
main.Convert(list);
main.print(list);


    }

    void Convert(ArrayList list)
    {

for (int i=0;i<integers.length;i++)
{
    list.add(integers[i]);
}

    }
void print(ArrayList list)
{
    
        System.out.println(list);
}



}
