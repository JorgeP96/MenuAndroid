package org.jorge.menuandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarImc();
        mostrarCalculadora();
    }


    public void mostrarImc(){
        Button btnImc = (Button)findViewById(R.id.btnImc);
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.imc_activity);
                calcularImc();
            }
        });
    }

    public void calcularImc(){
        Button btnCalcularImc = (Button)findViewById(R.id.btnCalcular);
        btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario u = new Usuario((EditText)findViewById(R.id.txtPeso),(EditText)findViewById(R.id.txtAltura));
                Imc imc = new Imc();
                Toast.makeText(getApplicationContext(),"El IMC es: " + imc.calcularImc(u),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void mostrarCalculadora(){
        Button btnCalculadora = (Button)findViewById(R.id.btnCalculadora);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.calculadora_activity);
                sumar();
                restar();
                multiplicar();
                dividir();
            }
        });
    }

    public Operaciones crearOprcn(){
        Operaciones oprcn = new Operaciones((EditText)findViewById(R.id.txtNo1),(EditText)findViewById(R.id.txtNo2));
        return oprcn;
    }

    public void sumar(){
        Button btnSumar = (Button)findViewById(R.id.btnSuma);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearOprcn();
                Toast.makeText(getApplicationContext(), "La suma es: " + crearOprcn().suma(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void restar(){
        Button btnRestar = (Button)findViewById(R.id.btnResta);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearOprcn();
                Toast.makeText(getApplicationContext(), "La resta es: " + crearOprcn().resta(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void multiplicar(){
        Button btnMult = (Button)findViewById(R.id.btnMult);
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearOprcn();
                Toast.makeText(getApplicationContext(), "La multiplicación es: " + crearOprcn().multiplicacion(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void dividir(){
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearOprcn();
                Toast.makeText(getApplicationContext(), "La división es: " + crearOprcn().division(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
