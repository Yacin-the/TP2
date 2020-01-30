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
        while (number%5==0){
            results.add(5);
            number /= 5;
        }
        while (number%7==0){
            results.add(7);
            number /= 7;
        }
        while (number%9==0){
            results.add(9);
            number /= 9;
        }
        if (number!=1){
            results.add(number);
        }
        return results;
    }
}

