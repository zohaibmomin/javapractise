package com.practise.challengeFunctional;

public class TestingPrimeCheck {
    public static void main(String[] args) {
        PrimeCheck p = (num)->{
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    return false;
                }
            }
          return true;
        };
        System.out.println(p.isPrime(89));
    }
}
