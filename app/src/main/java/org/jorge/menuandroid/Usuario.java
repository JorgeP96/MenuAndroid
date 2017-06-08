package org.jorge.menuandroid;

import android.widget.EditText;

/**
 * Created by Jorge on 04/06/2017.
 */

public class Usuario {
    private float peso;
    private float altura;

    public Usuario(EditText peso, EditText altura){
        this.peso = Float.parseFloat(peso.getText().toString());
        this.altura = Float.parseFloat(altura.getText().toString());
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
