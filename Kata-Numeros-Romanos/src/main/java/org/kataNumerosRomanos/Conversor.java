package org.kataNumerosRomanos;

public class Conversor {
    public String convert(int number){

        int numUnid = number%10;

        String unidades="";

        if (numUnid==9) unidades = "IX";
        else if (numUnid==8) unidades = "VIII";
        else if (numUnid==7) unidades = "VII";
        else if (numUnid==6) unidades = "VI";
        else if (numUnid==5) unidades = "V";
        else if (numUnid==4) unidades = "IV";
        else if (numUnid==3) unidades = "III";
        else if (numUnid==2) unidades = "II";
        else if (numUnid==1) unidades = "I";
        else unidades = "";

        int numDec = (number/10)%10;

        String decenas="";

        if (numDec==9) decenas = "XC";
        else if (numDec==8) decenas = "LXXX";
        else if (numDec==7) decenas = "LXX";
        else if (numDec==6) decenas = "LX";
        else if (numDec==5) decenas = "L";
        else if (numDec==4) decenas = "XL";
        else if (numDec==3) decenas = "XXX";
        else if (numDec==2) decenas = "XX";
        else if (numDec==1) decenas = "X";
        else decenas = "";

        return decenas+unidades;


    }
}
