package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if(i==3) return "Fizz";
        if(i==5) return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        throw new RuntimeException("Not yet implemented !");
    }
}
