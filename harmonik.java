package Diziler;

public class harmonik {
    public static void main(String[] args) {
        double[] number = {1,2,3,4,5};
        double sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += 1 / number[i];
        }
        double result = number.length / sum;
        System.out.println(result);


    }
}
