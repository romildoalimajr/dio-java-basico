public class MyClass {
    public static void main(String[] args){

        String myName = "Romildo";

        int anoFabricacao = 2022;

        boolean verdadeira = true;
        boolean falsa = false;

        anoFabricacao = 2018;

        String primeiroNome = "Romildo";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método.: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
