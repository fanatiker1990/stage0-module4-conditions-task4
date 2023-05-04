package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int numberMax= (first > second&&first>third)?  numberMax=first:( (second>first&&second>third)? (numberMax=second):(numberMax=third));
        System.out.println(numberMax);
    }
}
