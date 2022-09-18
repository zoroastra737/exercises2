package exercises2;

public class Task10 {
    public static void main(String[] args) {
        String input="Ala ma kota";

        String word="ma";
        System.out.println("Word: "+word);
        System.out.println("Result: "+getPosition(input, word));

        word="psa";
        System.out.println("Word: "+word);
        System.out.println("Result: "+getPosition(input, word));

        word=null;
        System.out.println("Word: "+word);
        System.out.println("Result: "+getPosition(input, word));

    }
    private static int getPosition(String input, String word){
       // input.contains(word); //->true/false
       // input.indexOf(word); //->zwróci pozycję danego wyrazu, a gdy go nie znajdzie zwróci -1
       if(StringValidator.isValid(input)&& StringValidator.isValid(word)){
           return input.indexOf(word);
       }
        return 0;
    }
}
