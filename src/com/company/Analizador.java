package com.company;

/**
 * Created by criscastro on 17/10/17.
 */
public class Analizador {
    private int indice;
    private  boolean bandera;
    public Analizador(){
         indice=0;
         bandera=true;
    }
    public void S(String st){
            if (indice < st.length()&&st.charAt(indice) == 'a') {
                indice++;
                S(st);
                if (indice < st.length() && st.charAt(indice) == 'b') {
                    indice++;
                } else {
                    bandera=false;
                }
            } else if (indice < st.length()&&st.charAt(indice) == 'c') {
                indice++;
            } else {
                bandera=false;
            }
    }

    public void verificar(String s){
        S(s);
        if(s.length()>indice){
            System.out.println("rechazada");
        }else if(bandera){
            System.out.println("aceptada");

        }
    }





}
