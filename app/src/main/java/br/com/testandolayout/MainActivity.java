package br.com.testandolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, resultado;
    EditText ed_valor1, ed_valor2;
    TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = (Button) findViewById(R.id.btn_soma);
        Button btn_subtrair = (Button) findViewById(R.id.btn_subtrai);
        Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplica);
        Button btn_dividir = (Button) findViewById(R.id.btn_divide);

        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        ed_valor1 = (EditText) findViewById(R.id.pt_valor1);
        ed_valor2 = (EditText) findViewById(R.id.pt_valor2);


       /* btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              num1 = Double.parseDouble(ed_valor1.getText().toString());
              num2 = Double.parseDouble(ed_valor2.getText().toString());
              resultado = num1 + num2;
              tv_resultado.setText(String.valueOf(resultado));

            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(ed_valor1.getText().toString());
                num2 = Double.parseDouble(ed_valor2.getText().toString());
                resultado = num1 - num2;
                tv_resultado.setText(String.valueOf(resultado));

            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(ed_valor1.getText().toString());
                num2 = Double.parseDouble(ed_valor2.getText().toString());
                resultado = num1 * num2;
                tv_resultado.setText(String.valueOf(resultado));
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(ed_valor1.getText().toString());
                num2 = Double.parseDouble(ed_valor2.getText().toString());
                resultado = num1 / num2;
                tv_resultado.setText(String.valueOf(resultado));
            }
        });*/
    }

    public void adicionar() {
        num1 = Double.parseDouble(ed_valor1.getText().toString());
        num2 = Double.parseDouble(ed_valor2.getText().toString());
        resultado = num1 + num2;
        tv_resultado.setText(String.valueOf(resultado));
    }

    public void subtrair() {
        num1 = Double.parseDouble(ed_valor1.getText().toString());
        num2 = Double.parseDouble(ed_valor2.getText().toString());
        resultado = num1 - num2;
        tv_resultado.setText(String.valueOf(resultado));
    }
    public void multiplicar() {
        num1 = Double.parseDouble(ed_valor1.getText().toString());
        num2 = Double.parseDouble(ed_valor2.getText().toString());
        resultado = num1 * num2;
        tv_resultado.setText(String.valueOf(resultado));
    }
    public void dividir() {
        num1 = Double.parseDouble(ed_valor1.getText().toString());
        num2 = Double.parseDouble(ed_valor2.getText().toString());
        resultado = num1 / num2;
        tv_resultado.setText(String.valueOf(resultado));
    }

    public void opera(View v) {
        switch (v.getId()) {
            case R.id.btn_soma: adicionar(); break;
            case R.id.btn_subtrai: subtrair(); break;
            case R.id.btn_multiplica: multiplicar(); break;
            case R.id.btn_divide: dividir(); break;
            default: System.out.println("Falha"); break;
        }

    }
}