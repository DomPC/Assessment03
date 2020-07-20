package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 == o2){
        }
        if (o1 >= o2){
            return -2;
        }
        else
        // TODO Auto-generated method stub
        return 3;
    }
}
