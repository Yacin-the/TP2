package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if(i%3==0 && i%5==0) return "FizzBuzz";
        if(i%3==0) return "Fizz";
        if(i%5==0) return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        throw new RuntimeException("Not yet implemented !");
    }
}
