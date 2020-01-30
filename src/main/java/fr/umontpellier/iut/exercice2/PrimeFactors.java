package fr.umontpellier.iut.exercice2;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

    ArrayList<Integer> results = new ArrayList<Integer>();

    public List<Integer> computeFactors(int number){
        while (number%2==0){
            results.add(2);
            number /= 2;
        }
        while (number%3==0){
            results.add(3);
            number /= 3;
        }
        if (number==5){
            results.add(15);
        }
        if (number==7){
            results.add(7);
        }
        return results;
    }
}

