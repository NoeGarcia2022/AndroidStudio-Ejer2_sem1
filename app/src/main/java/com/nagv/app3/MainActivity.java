package com.nagv.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Todas estas variables son del tipo global y son reconocidas o se pueden
    //utilizar dentro de toda la clase java: MainActivity2
    private Button b1,b2,b3,b4,b5;
    private EditText num1,num2;
    private TextView resultado;
    View focusView = null;
    String Cadena = "Noe Antonio Garcia Valle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast mensaje = Toast.makeText(this,"Bienvenidos, " +Cadena,Toast.LENGTH_LONG);
        mensaje.show();

        num1=(EditText) findViewById(R.id.valor1);
        num2=(EditText) findViewById(R.id.valor2);
        focusView=num1;
        focusView.requestFocus();
        b1 = (Button)findViewById(R.id.btnSumar);
        b2 = (Button)findViewById(R.id.btnRestar);
        b3 = (Button)findViewById(R.id.btnMultiplicar);
        b4 = (Button)findViewById(R.id.btnDividir);
        b5 = (Button)findViewById(R.id.btnAcercaDe);
        resultado=(TextView) findViewById(R.id.tvResultado);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    public void onClick(View v) {
        String valor1="";String valor2="";
        String mensaje1="";String res="";
        float a; float b; float c;

        switch (v.getId()){
            case R.id.btnSumar:
                valor1 = num1.getText().toString();
                valor2 = num2.getText().toString();
                if((valor1 != "")&&(!valor2.isEmpty())){
                    a=Float.parseFloat(valor1);
                    b=Float.parseFloat(valor2);
                    c=a+b;
                    res=String.valueOf(c);
                    mensaje1="La suma de "+a+"+"+b+" es = "+c;
                }else{
                    focusView=num1;
                    focusView.requestFocus();
                    res="0.0";
                    mensaje1="Debe completar todos los campos";
                }
                break;

            case R.id.btnRestar:
                valor1 = num1.getText().toString();
                valor2 = num2.getText().toString();
                if ((valor1 != "")&&(!valor2.isEmpty())){
                a=Float.parseFloat(valor1);
                b=Float.parseFloat(valor2);
                c=a-b;
                res=String.valueOf(c);
                mensaje1="La resta de "+a+"-"+b+" es = "+c;
                }else{
                    focusView=num1;
                    focusView.requestFocus();
                    res="0.0";
                    mensaje1="Debe completar todos los campos";
                }
                break;

            case R.id.btnMultiplicar:
                valor1 = num1.getText().toString();
                valor2 = num2.getText().toString();
                if ((valor1 != "")&&(!valor2.isEmpty())) {
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a * b;
                    res = String.valueOf(c);
                    mensaje1 = "La multiplicacion de " + a + "x" + b + " es = " + c;
                }else{
                    focusView=num1;
                    focusView.requestFocus();
                    res="0.0";
                    mensaje1="Debe completar todos los campos";
                }
                break;

            case R.id.btnDividir:
                valor1 = num1.getText().toString();
                valor2 = num2.getText().toString();
                if ((valor1 != "")&&(!valor2.isEmpty())) {
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a / b;
                    res = String.valueOf(c);
                    mensaje1 = "La division de " + a + "/" + b + " es = " + c;
                }else{
                    focusView=num1;
                    focusView.requestFocus();
                    res="0.0";
                    mensaje1="Debe completar todos los campos";
                }
                break;

            case R.id.btnAcercaDe:
                mensaje1="Creado por: By Noe Garcia";
                res="0.0";
                break;
            default:
                break;
        }
        resultado.setText(res);
        Toast mensaje = Toast.makeText(this, mensaje1, Toast.LENGTH_LONG);
        mensaje.show();
    }
}