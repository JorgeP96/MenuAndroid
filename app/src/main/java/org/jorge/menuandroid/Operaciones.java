package org.jorge.menuandroid;

import android.widget.EditText;

/**
 * Created by Jorge on 05/06/2017.
 */

public class Operaciones {

    private float no1;
    private float no2;

    public Operaciones(EditText no1, EditText no2){
        this.no1 = Float.parseFloat(no1.getText().toString());
        this.no2 = Float.parseFloat(no2.getText().toString());
    }

    public float getNo1() {
        return no1;
    }

    public void setNo1(float no1) {
        this.no1 = no1;
    }

    public float getNo2() {
        return no2;
    }

    public void setNo2(float no2) {
        this.no2 = no2;
    }

    public float suma(){
        float resultado = getNo1() + getNo2();
        return resultado;
    }

    public float resta(){
        float resultado = getNo1() - getNo2();
        return resultado;
    }

    public float multiplicacion(){
        float resultado = getNo1() * getNo2();
        return resultado;
    }

    public float division(){
        float resultado = getNo1() / getNo2();
        return resultado;
    }

}
