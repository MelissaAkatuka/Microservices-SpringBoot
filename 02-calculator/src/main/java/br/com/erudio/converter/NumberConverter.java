package br.com.erudio.converter;

public class NumberConverter {

    public static Double convertToDouble(String stringNumber) {
        if(stringNumber == null) return 0D;
        //troca todas as vírgulas por ponto
        String number = stringNumber.replaceAll(",", ".");
        //faz o parse
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String stringNumber) {
        if(stringNumber == null) return false;
        //troca todas as vírgulas por ponto
        String number = stringNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
