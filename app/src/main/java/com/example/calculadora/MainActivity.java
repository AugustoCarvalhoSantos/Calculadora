package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnMultiplica;
    Button btnDivide;
    Button btnSubtrai;

    int n1, n2, soma, multi, divi, subt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.resultado);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnMultiplica = (Button) findViewById(R.id.btnMultiplica);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnSubtrai = (Button) findViewById(R.id.btnSubtrai);
    }

    public void Somar(View view) {
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());

        if(n1 < 100000 && n1 > 0 && n2 < 100000 && n2 > 0){
            soma = n1 + n2;
            result.setText(Integer.toString(soma));
        } else{
            result.setText("Não foi possivel realizar a operação");
        }
    }
        public void Multiplicar(View view){
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            if (n1 < 100000 && n1 > 0 && n2 < 100000 && n2 > 0) {
                multi = n1 * n2;
                result.setText(Integer.toString(multi));
            }else{
                result.setText("Não foi possivel realizar a operação");
            }
        }
        public void Dividir(View view) {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            if (n1 < 100000 && n1 > 0 && n2 < 100000 && n2 > 0) {
                divi = n1 / n2;
                result.setText(Integer.toString(divi));
            }else{
                result.setText("Não foi possivel realizar a operação");
            }
        }
            public void Subtrair(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                if (n1 < 100000 && n1 > 0 && n2 < 100000 && n2 > 0) {
                    subt = n1 - n2;
                    result.setText(Integer.toString(subt));
                }else{
                    result.setText("Não foi possivel realizar a operação");
                }
            }
}
