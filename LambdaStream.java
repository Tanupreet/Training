package com.tanu;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
 
public class LambdaStream {
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double res = 0;
        for (int i = 0; i < list.size() && i % 2 == 0 && i > 3; i++) {
            res += (i * 1.5);
        }
        LambdaEx.code(() -> System.out.println());
        System.out.println(res);
        /*
         * Timit.code(() -> { list.forEach(LambdaSimple::printWithHello); });
         */
 
        LambdaEx.code(() -> System.out.println(list.parallelStream()
        		.filter(LambdaStream::GT3)
                .filter(LambdaStream::isPrime)
                .mapToDouble(LambdaStream::compute)
                .sum()));
    }
 
    private static double covertTodouble(List<Integer> list) {
        double res = 0;
        for (int i = 0; i < list.size() && isPrime(i) && GT3(i); i++) {
            res += compute(i);
        }
        return res;
    }
 
    private static double compute(int value) {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }
 
    private static boolean isPrime(int value) {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
 
    private static boolean GT3(int value) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value > 3;
    }
}