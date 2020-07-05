package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String number ="";
    public double num1 = 0;
    private double num2 = 0;
    protected String symbol;


    private TextView solucion;
    private Button num_siete,num_ocho,num_nueve,num_cuatro,num_cinco,num_seis,num_uno,num_dos,num_tres,num_cero;
    private Button mas,menos,multi,div,igual,ce;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        solucion =  findViewById(R.id.solucion);

        num_cero = findViewById(R.id.num_cero);
        num_uno = findViewById(R.id.num_uno);
        num_dos = findViewById(R.id.num_dos);
        num_tres = findViewById(R.id.num_tres);
        num_cuatro = findViewById(R.id.num_cuatro);
        num_cinco  = findViewById(R.id.num_cinco);
        num_seis = findViewById(R.id.num_seis);
        num_siete = findViewById(R.id.num_siete);
        num_ocho  = findViewById(R.id.num_ocho);
        num_nueve = findViewById(R.id.num_nueve);


        mas = findViewById(R.id.num_mas);
        menos = findViewById(R.id.num_menos);
        multi = findViewById(R.id.num_multi);
        div = findViewById(R.id.num_div);
        ce   = findViewById(R.id.num_ce);
        igual = findViewById(R.id.num_igual);

        //listener for button

        num_cero.setOnClickListener(this);
        num_uno.setOnClickListener(this);
        num_dos.setOnClickListener(this);
        num_tres.setOnClickListener(this);
        num_cuatro.setOnClickListener(this);
        num_cinco.setOnClickListener(this);
        num_seis.setOnClickListener(this);
        num_siete.setOnClickListener(this);
        num_ocho.setOnClickListener(this);
        num_nueve.setOnClickListener(this);

        mas.setOnClickListener(this);
        menos.setOnClickListener(this);
        div.setOnClickListener(this);
        multi.setOnClickListener(this);
        ce.setOnClickListener(this);
        igual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.num_mas:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_menos:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_div:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.num_multi:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

                case R.id.num_ce:
                symbol = "";
                number = "";
                num1 = 0;
                num2 = 0;
                solucion.setText("");
                break;

            case R.id.num_igual:

                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText("= " + (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("= " + (num1 - num2));
                        break;
                    case "/":
                        solucion.setText("= " + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("= " + (num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                number = "";

                break;

        }
    }
}
