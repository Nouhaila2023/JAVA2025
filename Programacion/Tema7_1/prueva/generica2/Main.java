package Tema7_1.prueva.generica2;

public class Main {

    public static void main(String[] args) {

    Q<Integer> x = new Q<>();
    x.Test(12);

    Q<String> y = new Q<>();
    y.Test("Hello");


    }
}

class Q<T>{
    void Test(T a){
        System.out.println(a);
    }
}