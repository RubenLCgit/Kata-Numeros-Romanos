package org.kataNumerosRomanos;

public class Conversor {
    public String convert(int number){
        String conerversion;
        if (number==3) conerversion = "III";
        else if (number==2) conerversion = "II";
        else conerversion = "I";
        return conerversion;
    }
}
