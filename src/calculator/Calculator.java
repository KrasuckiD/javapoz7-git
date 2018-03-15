package calculator;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int min(int a, int b){
        return a-b;
    }

    public int factorisl (int n){
        int result = 1;
        for (int i = 0; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
