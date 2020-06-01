package com.example.thenumbers;

import java.util.Arrays;
import java.util.List;

public class Numbers {


//Генерируем случайные числа начало
    public static int[] getRandomNumbers(){
        int [] numbers = new int[20];
        int one = 1;
        for (int a = 0; a < 20; a ++) {
            int randomNumber = one +  (int) (Math.random() * 10);
            numbers[a] = randomNumber;
        }
        return numbers;
        }
//Генерируем случайные числа конец

//проверяем числа по возрастанию начало
    public static int [] getNumbersAscending(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        return arr;
}
//проверяем числа по возрастанию конец

//проверяем числа по убыванию начало
    public static int [] getNumbersDescending(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] < arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
//проверяем числа по убыванию конец



    }

