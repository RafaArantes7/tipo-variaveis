public class Operadores3 {

    // Essa é uma forma de realizar a operacao utilizando operadores "?" e ":"
    public static void main(String[] args) {

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        // uma outra forma de realizar esta mesma operação de uma forma mais simples
        // utlizando os mesmos operadores

        String resultado2 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

    }

}
