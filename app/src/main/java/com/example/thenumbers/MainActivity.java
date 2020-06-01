package com.example.thenumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<TextView> listTextView;
    int[] numbersText;
    int howManyClicksHaveBeenMade = 0;
    TextView textViewNumber1;
    TextView textViewNumber2;
    TextView textViewNumber3;
    TextView textViewNumber4;
    TextView textViewNumber5;
    TextView textViewNumber6;
    TextView textViewNumber7;
    TextView textViewNumber8;
    TextView textViewNumber9;
    TextView textViewNumber10;
    TextView textViewNumber11;
    TextView textViewNumber12;
    TextView textViewNumber13;
    TextView textViewNumber14;
    TextView textViewNumber15;
    TextView textViewNumber16;
    TextView textViewNumber17;
    TextView textViewNumber18;
    TextView textViewNumber19;
    TextView textViewNumber20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNumber1 = findViewById(R.id.textView1);
        textViewNumber2 = findViewById(R.id.textView2);
        textViewNumber3 = findViewById(R.id.textView3);
        textViewNumber4 = findViewById(R.id.textView4);
        textViewNumber5 = findViewById(R.id.textView5);
        textViewNumber6 = findViewById(R.id.textView6);
        textViewNumber7 = findViewById(R.id.textView7);
        textViewNumber8 = findViewById(R.id.textView8);
        textViewNumber9 = findViewById(R.id.textView9);
        textViewNumber10 = findViewById(R.id.textView10);
        textViewNumber11 = findViewById(R.id.textView11);
        textViewNumber12 = findViewById(R.id.textView12);
        textViewNumber13 = findViewById(R.id.textView13);
        textViewNumber14 = findViewById(R.id.textView14);
        textViewNumber15 = findViewById(R.id.textView15);
        textViewNumber16 = findViewById(R.id.textView16);
        textViewNumber17 = findViewById(R.id.textView17);
        textViewNumber18 = findViewById(R.id.textView18);
        textViewNumber19 = findViewById(R.id.textView19);
        textViewNumber20 = findViewById(R.id.textView20);

        listTextView = new ArrayList<TextView>();


        listTextView.add(textViewNumber1);
        listTextView.add(textViewNumber2);
        listTextView.add(textViewNumber3);
        listTextView.add(textViewNumber4);
        listTextView.add(textViewNumber5);
        listTextView.add(textViewNumber6);
        listTextView.add(textViewNumber7);
        listTextView.add(textViewNumber8);
        listTextView.add(textViewNumber9);
        listTextView.add(textViewNumber10);
        listTextView.add(textViewNumber11);
        listTextView.add(textViewNumber12);
        listTextView.add(textViewNumber13);
        listTextView.add(textViewNumber14);
        listTextView.add(textViewNumber15);
        listTextView.add(textViewNumber16);
        listTextView.add(textViewNumber17);
        listTextView.add(textViewNumber18);
        listTextView.add(textViewNumber19);
        listTextView.add(textViewNumber20);



        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        numbersText = Numbers.getRandomNumbers();
        setText(listTextView, numbersText);



    }
    //устанавливаем рандомные значения для наших TextView
    public void setText(List list, int [] numbers){
        listTextView = list;
        for (int a = 0; a < 20; a++){
            listTextView.get(a).setText(String.valueOf(numbers[a]));
            System.out.println(numbers[a]);
        }
    }

 //проверка по возрастанию и убыванию
    public void AscendingAndDescendingSortingMethod(View view) {
        howManyClicksHaveBeenMade++;
        if (howManyClicksHaveBeenMade % 2 == 0){
            setText(listTextView, Numbers.getNumbersAscending(numbersText));
        }else{
            setText(listTextView, Numbers.getNumbersDescending(numbersText));
        }
    }
//показать все числа начало
    public void AllNumbers(View view) {
        setText(listTextView, numbersText);
    }
//показать все числа конец

//показать четные числа начало
    public void EvenNumbers(View view) {

        for (int a = 0; a < numbersText.length ; a++){
            if (numbersText[a]%2 == 0){
                listTextView.get(a).setText(String.valueOf(numbersText[a]));
            }else{
                listTextView.get(a).setText("X");
            }

        }


    }
    //показать четные числа начало конец
}
