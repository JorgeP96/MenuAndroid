package org.jorge.menuandroid;

/**
 * Created by Jorge on 04/06/2017.
 */

public class Imc {
    public float calcularImc(Usuario u){
        float resultado = u.getPeso() /(u.getAltura() * u.getAltura());
        return resultado;
    }
}
