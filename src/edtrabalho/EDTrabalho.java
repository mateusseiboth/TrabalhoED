package edtrabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateusseiboth
 */
public class EDTrabalho {

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        ArrayList<Integer> array4 = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        Random gerador = new Random();

        long t;

        int op = 0;

        do {

            System.out.println("================Speedtest.alg=======================");
            System.out.println("* 1- Ordenar utilizando BubbleSort (melhorado);    *");
            System.out.println("* 2- Ordenar utilizando SelectionSort;             *");
            System.out.println("* 3- Ordenar utilizando InsertionSort;             *");
            System.out.println("* 4- Ordenar utilizando MergeSort;                 *");
            System.out.println("* 5- Ordenar utilizando QuickSort;                 *");
            System.out.println("* 6- Ordenar utilizando __________;                *");
            System.out.println("* 7- Ordenar utilizando __________;                *");
            System.out.println("* 8- Ordenar utilizando __________;                *");
            System.out.println("* 9- Ordenar utilizando __________;                *");
            System.out.println("* 10- Ordenar utilizando __________;               *");
            System.out.println("======================©2022=========================");
            op = entrada.nextInt();

            if (op < 0 || op > 10) {
                System.out.println("Opção invalida");
            } else {
                switch (op) {
                    case 1:
                        
                        
                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        bubbleSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s (Bubble)");

                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        bubbleSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (Bubble)");

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);

                        //Tempo para 1000
                        t = System.nanoTime();

                        bubbleSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (Bubble)");


                        break;

                    case 2:
                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        SelectionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000)" + t / 1000000000 + "s (SelectionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        SelectionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000)" + t / 1000000000 + "s (SelectionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        SelectionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000)" + t / 1000000000 + "s (SelectionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        SelectionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000)" + t / 1000000000 + "s (SelectionSort)");

                    case 3:
                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        InsertionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000)" + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        InsertionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000)" + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        InsertionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000)" + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        InsertionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000)" + t / 1000000000 + "s (InsertionSort)");
                        break;

                    case 4:
                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        MergeSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000)" + t / 1000000000 + "s (MergeSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        MergeSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000)" + t / 1000000000 + "s (MergeSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        MergeSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000)" + t / 1000000000 + "s (MergeSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        MergeSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000)" + t / 1000000000 + "s (MergeSort)");

                        break;

                    case 5:

                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        QuickSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000)" + t / 1000000000 + "s (QuickSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        QuickSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000)" + t / 1000000000 + "s (QuickSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        QuickSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000)" + t / 1000000000 + "s (QuickSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        QuickSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000)" + t / 1000000000 + "s (QuickSort)");

                        break;

                    case 6:

                        //ToDo
                        break;

                    case 7:

                        //ToDo
                        break;

                    case 8:

                        //ToDo
                        break;

                    case 9:
                        //ToDo
                        break;

                    case 10:
                        //ToDo
                        break;

                    case 0:
                        System.out.println("Saindo");
                }

            }
        } while (op != 0);
    }

    private static void bubbleSort(ArrayList<Integer> arrayR) {
        boolean controle = false;
        int tmp = 0;
        for (int i = 0; i < arrayR.size() - 1; i++) {
            controle = true;
            for (int j = 0; j < arrayR.size() - i - 1; j++) {
                if (arrayR.get(j) > arrayR.get(j+1)) {
                    tmp = arrayR.get(j);
                    arrayR.set(j, arrayR.get(j+1));
                    arrayR.set(j+1, tmp);
                    controle = false;
                }
            }
            if (controle == true) {
                break;
            }
        }

    }

    private static void SelectionSort(ArrayList<Integer> arrayR) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void MergeSort(ArrayList<Integer> array1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void QuickSort(ArrayList<Integer> array1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static ArrayList<Integer> criarColecao(ArrayList<Integer> array, int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            array.add(i);

        }

        return array;

    }

    private static void InsertionSort(ArrayList<Integer> array1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static ArrayList<Integer> randomico(ArrayList<Integer> array, int tamanho) {
        
        
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {

            int rand = random.nextInt();
            array.add(i, rand);

        }
        

        return array;
    }

}
