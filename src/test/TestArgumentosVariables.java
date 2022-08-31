package test;
//Pasar un argumneto a un metodo

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3,2,4,1);
        imprimirNumeros(20,1);
        variosParametros("Alex", 20,9,3,4); 
    }

    //Varios argumentos definidos el argumentos variable"int... variable" debe de ser el ultimo parametro en el metodo
    private static void variosParametros(String nombre,int...numeros)
    {
        System.out.println("Nombre = "+ nombre);
        imprimirNumeros(numeros);
    }
    //Metodo recibe elementos indefenidos. Ademas se convierte en un array automaticamente la variable numeros
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
                System.out.println("Elemento: "+ numeros[i]);
        }
    }

}
