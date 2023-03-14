package org.kataNumerosRomanos;

public class Conversor {
    public String convert(int number){
        String conerversion;
        if (number==9) conerversion = "IX";
        else if (number==8) conerversion = "VIII";
        else if (number==7) conerversion = "VII";
        else if (number==6) conerversion = "VI";
        else if (number==5) conerversion = "V";
        else if (number==4) conerversion = "IV";
        else if (number==3) conerversion = "III";
        else if (number==2) conerversion = "II";
        else conerversion = "I";
        return conerversion;
    }
}
