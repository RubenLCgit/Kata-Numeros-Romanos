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

        int numCent = (number/100)%10;

        String centenas="";

        if (numCent==9) centenas = "CM";
        else if (numCent==8) centenas = "DCCC";
        else if (numCent==7) centenas = "DCC";
        else if (numCent==6) centenas = "DC";
        else if (numCent==5) centenas = "D";
        else if (numCent==4) centenas = "CD";
        else if (numCent==3) centenas = "CCC";
        else if (numCent==2) centenas = "CC";
        else if (numCent==1) centenas = "C";
        else centenas = "";

        int numMill = (number/1000)%10;

        String millar="";

        if (numMill==3) millar = "MMM";
        else if (numMill==2) millar = "MM";
        else if (numMill==1) millar = "M";
        else millar = "";

        return millar+centenas+decenas+unidades;


    }
}
