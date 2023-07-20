import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Array (vetor) --> com um tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Isabelly";
        arrayEstatico[4] = "Erika";
        arrayEstatico[5] = "João Victor";

        // Classes nomeObjetos = new Classes();
        //ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); // indice 0
        arrayDinamico.add("Maria"); // indice 1
        arrayDinamico.add("Pedro"); // indice 2
        arrayDinamico.add("Isabelly"); // indice 3
        arrayDinamico.add("Erika"); // indice 4
        arrayDinamico.add("João Victor"); // indice 5

        System.out.println("Imprimindo o Array Estatico");
        for (int indice = 0; indice < arrayEstatico.length; indice ++){
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println("Imprimindo o ArrayList");
        
        System.out.println("Tamanho do arrayList "  + arrayDinamico.size());

        /*for (int indice = 0; indice < arrayEstatico.length; indice ++){
            System.out.println(arrayEstatico[indice]);
        }*/
    }
}