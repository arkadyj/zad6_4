package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List exterminate(ArrayList<Integer> numbers) {

        for (Iterator<Integer> list = numbers.iterator(); list.hasNext(); ) {
            Integer entry = list.next();
            if(entry%2!=0) {
                list.remove();
            }
        }
        return numbers;

    }

}
