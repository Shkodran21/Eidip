/**
 * @author sfaniq2s
 */
public class SWIFT {

    public static String iban(String kürzel,int bankzahl,long kontozahl){
        if(kürzel.length() != 2 | Integer.toString(bankzahl).length() != 8 | Long.toString(kontozahl).length() != 6){
            throw new IllegalArgumentException();
        }
        String kürzel2 = "";
        for(int i = 0;i<kürzel.length();i++){
            kürzel2 += Character.toUpperCase(kürzel.charAt(i));
        }
        return kürzel2 + pruefzahl(kürzel,Integer.toString(bankzahl) + kontonummer(kontozahl)) + Integer.toString(bankzahl) + kontonummer(kontozahl);
    }
    public static String landeskuerzel(String kürzel){
        if(kürzel.length() != 2){
            throw new IllegalArgumentException();
        }
        for(int i = 0;i < kürzel.length();++i){
            if(!Character.isLetter(kürzel.charAt(i)) | Character.isLowerCase(kürzel.charAt(i))){
                throw new IllegalArgumentException();
            }
        }
        return kürzel;
    }
    public static String bankleitzahl(int bankzahl){
        if(Integer.toString(bankzahl).length() != 8){
            throw new IllegalArgumentException();
        }
        return Integer.toString(bankzahl);
    }
    public static String kontonummer(long kontozahl){
        if(Long.toString(kontozahl).length() != 6){
            throw new IllegalArgumentException();
        }
        String z1 = "";
        for(int i = 0;i < 10-Long.toString(kontozahl).length();i++){
            z1 += "0";
        }
        z1 += Long.toString(kontozahl);
        return z1;
    }
    public static String bban(int bankzahl,long kontozahl){
        String s = bankleitzahl(bankzahl);
        s += kontonummer(kontozahl);
        return s;
    }
    public static int zahlFuerUpper(char groß){
        if(Character.isLowerCase(groß) | !Character.isLetter(groß)){
            throw new IllegalArgumentException();
        }
        switch(groß){
            case 'A':
                return 10;
            case 'B':
                return 1 + 10;
            case 'C':
                return 2 + 10;
            case 'D':
                return 3 + 10;
            case 'E':
                return 4 + 10;
            case 'F':
                return 5 + 10;
            case 'G':
                return 6 + 10;
            case 'H':
                return 7 + 10;
            case 'I':
                return 8 + 10;
            case 'J':
                return 9 + 10;
            case 'K':
                return 10 + 10;
            case 'L':
                return 11 + 10;
            case 'M':
                return 12 + 10;
            case 'N':
                return 13 + 10;
            case 'O':
                return 14 + 10;
            case 'P':
                return 15 + 10;
            case 'Q':
                return 16 + 10;
            case 'R':
                return 17 + 10;
            case 'S':
                return 18 + 10;
            case 'T':
                return 19 + 10;
            case 'U':
                return 20 + 10;
            case 'V':
                return 21 + 10;
            case 'W':
                return 22 + 10;
            case 'X':
                return 23 + 10;
            case 'Y':
                return 24 + 10;
            case 'Z':
                return 25 + 10;
        }
        return 0;
    }
    public static String bbanErgaenzung(String land){
        if(land.length() != 2){
            throw new IllegalArgumentException();
        }
        for(int i = 0;i < land.length();++i){
            if(!Character.isLetter(land.charAt(i)) | Character.isLowerCase(land.charAt(i))){
                throw new IllegalArgumentException();
            }
        }
        int z1 = zahlFuerUpper(Character.toUpperCase(land.charAt(0)));
        int z2 = zahlFuerUpper(Character.toUpperCase(land.charAt(1)));
        String z = Integer.toString(z1);
        z += Integer.toString(z2);
        z += "00";
        return z;
    }
    public static long zahlAlsStringMod97(String s) {
        if(s.length() != 24){
            throw new IllegalArgumentException();
        }
        for(int i = 0;i < s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                throw new IllegalArgumentException();
            }
        }
        long z = Long.parseLong(s.substring(0, 9));
        z = z % 97;
        z = Long.parseLong(Long.toString(z) + s.substring(9,16));
        z = z % 97;
        z = Long.parseLong(Long.toString(z) + s.substring(16,s.length()-1));
        z = z % 97;
        z = Long.parseLong(Long.toString(z) + s.charAt(s.length()-1));
        z = z % 97;
        return z;
    }
    public static String pruefzahl(String kürzel,String bban){
        String z2 = bbanErgaenzung(kürzel);
        long z = zahlAlsStringMod97(bban + z2);
        if(98 - z > 9){
            return Long.toString(98 - z);
        }else{
            return "0" + Long.toString(98 - z);
        }
    }
}