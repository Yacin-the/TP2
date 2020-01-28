package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if(i%3==0 && i%5==0) return "FizzBuzz";
        if(i%3==0) return "Fizz";
        if(i%5==0) return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        int j=0;
        String[] x = new String[i];
        while(j<i){
            x[j]=getValue(j+1);
            j++;
        }
        return x;
    }
}
