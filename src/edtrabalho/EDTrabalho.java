package edtrabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

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

                        System.out.println("Randomico cenário (1000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 10000 teste
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) " + t / 1000000000 + "s (Bubble)");

                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        bubbleSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) " + t / 1000000000 + "s (Bubble)");

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);

                        //Tempo para 1000
                        t = System.nanoTime();

                        bubbleSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bubbleSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bubbleSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) " + t / 1000000000 + "s (Bubble)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bubbleSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) " + t / 1000000000 + "s (Bubble)");

                        break;

                    case 2:
                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        selectionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        selectionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        selectionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        selectionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) " + t / 1000000000 + "s (selectionSort)");

                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        selectionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        selectionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        selectionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        selectionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) " + t / 1000000000 + "s (selectionSort)");

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);

                        //Tempo para 1000
                        t = System.nanoTime();

                        selectionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        selectionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        selectionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) " + t / 1000000000 + "s (selectionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        selectionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) " + t / 1000000000 + "s (selectionSort)");

                    case 3:
                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        InsertionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        InsertionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        InsertionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        InsertionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) " + t / 1000000000 + "s (InsertionSort)");

                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        InsertionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        InsertionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        InsertionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        InsertionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) " + t / 1000000000 + "s (InsertionSort)");

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);

                        //Tempo para 1000
                        t = System.nanoTime();

                        InsertionSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        InsertionSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        InsertionSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) " + t / 1000000000 + "s (InsertionSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        InsertionSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) " + t / 1000000000 + "s (InsertionSort)");

                        break;

                    case 4:
                        if (true) {
                            //criar coleção randomica
                            array1 = randomico(array1, 1000);
                            array2 = randomico(array2, 10000);
                            array3 = randomico(array3, 500000);
                            array4 = randomico(array4, 1000000);


                            //Tempo para 1000
                            t = System.nanoTime();

                            MergeSort ms = new MergeSort(array1);
                            ms.sortGivenArray();

                            t = System.nanoTime() - t;

                            System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 10000
                            t = System.nanoTime();

                            MergeSort ms2 = new MergeSort(array2);
                            ms2.sortGivenArray();

                            t = System.nanoTime() - t;

                            System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 500000
                            t = System.nanoTime();

                            MergeSort ms3 = new MergeSort(array3);
                            ms3.sortGivenArray();

                            t = System.nanoTime() - t;
                            System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 1000000
                            t = System.nanoTime();

                            MergeSort ms4 = new MergeSort(array4);
                            ms4.sortGivenArray();

                            t = System.nanoTime() - t;
                            System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s(MergeSort)");
                        }
                        if (true) {
                            //criação coleção ordenada
                            array1 = criarColecao(array1, 1000);
                            array2 = criarColecao(array2, 10000);
                            array3 = criarColecao(array3, 500000);
                            array4 = criarColecao(array4, 1000000);


                            //Tempo para 1000
                            t = System.nanoTime();

                            MergeSort ms = new MergeSort(array1);
                            ms.sortGivenArray();

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 10000
                            t = System.nanoTime();

                            MergeSort ms2 = new MergeSort(array2);
                            ms2.sortGivenArray();

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 500000
                            t = System.nanoTime();

                            MergeSort ms3 = new MergeSort(array3);
                            ms3.sortGivenArray();

                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (MergeSort)");

                            //Tempo para 1000000
                            t = System.nanoTime();

                            MergeSort ms4 = new MergeSort(array4);
                            ms4.sortGivenArray();

                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (MergeSort)");
                        }

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);
                        

                        //Tempo para 1000
                        t = System.nanoTime();

                        MergeSort ms = new MergeSort(array1);
                        ms.sortGivenArray();

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (MergeSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        MergeSort ms2 = new MergeSort(array2);
                        ms2.sortGivenArray();

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (MergeSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        MergeSort ms3 = new MergeSort(array3);
                        ms3.sortGivenArray();

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (MergeSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        MergeSort ms4 = new MergeSort(array4);
                        ms4.sortGivenArray();

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (MergeSort)");

                        break;

                    case 5:
                        if (true) {
                            //criar coleção randomica
                            array1 = randomico(array1, 1000);
                            array2 = randomico(array2, 10000);
                            array3 = randomico(array3, 500000);
                            array4 = randomico(array4, 1000000);



                            //Tempo para 1000
                            t = System.nanoTime();

                            QuickSort qsu = new QuickSort(array1);
                            qsu.startQuickStart(0, array1.size()-1);

                            t = System.nanoTime() - t;

                            System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 10000
                            t = System.nanoTime();

                            QuickSort qsu2 = new QuickSort(array2);
                            qsu2.startQuickStart(0, array2.size()-1);

                            t = System.nanoTime() - t;

                            System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 500000
                            t = System.nanoTime();

                            QuickSort qsu3 = new QuickSort(array3);
                            qsu3.startQuickStart(0, array3.size()-1);

                            t = System.nanoTime() - t;
                            System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 1000000
                            t = System.nanoTime();

                            QuickSort qsu4 = new QuickSort(array4);
                            qsu4.startQuickStart(0, array4.size()-1);

                            t = System.nanoTime() - t;
                            System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s(QuickSort)");
                        }
                        if (true) {
                            //criação coleção ordenada
                            array1 = criarColecao(array1, 1000);
                            array2 = criarColecao(array2, 10000);
                            array3 = criarColecao(array3, 500000);
                            array4 = criarColecao(array4, 1000000);


                            //Tempo para 1000
                            t = System.nanoTime();

                            QuickSort qsu = new QuickSort(array1);
                            qsu.startQuickStart(0, array1.size()-1);

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 10000
                            t = System.nanoTime();

                            QuickSort qsu2 = new QuickSort(array2);
                            qsu2.startQuickStart(0, array2.size()-1);

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 500000
                            t = System.nanoTime();

                            QuickSort qsu3 = new QuickSort(array3);
                            qsu3.startQuickStart(0, array3.size()-1);

                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (QuickSort)");

                            //Tempo para 1000000
                            t = System.nanoTime();

                            QuickSort qsu4 = new QuickSort(array4);
                            qsu4.startQuickStart(0, array4.size()-1);


                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (QuickSort)");
                        }

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);


                        //Tempo para 1000
                        t = System.nanoTime();

                        QuickSort qsu = new QuickSort(array1);
                        qsu.startQuickStart(0, array1.size()-1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (QuickSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        QuickSort qsu2 = new QuickSort(array2);
                        qsu2.startQuickStart(0, array2.size()-1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (QuickSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        QuickSort qsu3 = new QuickSort(array3);
                        qsu3.startQuickStart(0, array3.size()-1);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (QuickSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        QuickSort qsu4 = new QuickSort(array4);
                        qsu4.startQuickStart(0, array4.size()-1);


                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (QuickSort)");

                        break;

                    case 6:
                        /*
                        Em analise de execução
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);

                        //Tempo para 1000
                        t = System.nanoTime();

                        novoSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        novoSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        novoSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        novoSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) " + t / 1000000000 + "s (novo)");

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);

                        //Tempo para 1000
                        t = System.nanoTime();

                        novoSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        novoSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        novoSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) " + t / 1000000000 + "s (novo)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        novoSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) " + t / 1000000000 + "s (novo)");*/
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
                if (arrayR.get(j) > arrayR.get(j + 1)) {
                    tmp = arrayR.get(j);
                    arrayR.set(j, arrayR.get(j + 1));
                    arrayR.set(j + 1, tmp);
                    controle = false;
                }
            }
            if (controle == true) {
                break;
            }
        }

    }

    private static void selectionSort(ArrayList<Integer> arrayR) {

        for (int i = 0; i < arrayR.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrayR.size(); j++) {
                if (arrayR.get(j) < arrayR.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = arrayR.get(minIndex);
            arrayR.set(minIndex, arrayR.get(i));
            arrayR.set(i, temp);
        }
    }


    private static ArrayList<Integer> criarColecao(ArrayList<Integer> array, int tamanho) {

        for (int i = 0; i < tamanho; i++) {
            array.set(i, i);

        }

        return array;

    }

    private static void InsertionSort(ArrayList<Integer> arrayR) {
        for (int i = 1; i < arrayR.size(); ++i) {
            int key = arrayR.get(i);
            int j = i - 1;

            while (j >= 0 && arrayR.get(j) > key) {
                arrayR.set(j + 1, arrayR.get(j));

                j -= 1;
            }
            arrayR.set(j + 1, key);
        }

    }



    private static ArrayList<Integer> randomico(ArrayList<Integer> array, int tamanho) {

        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {

            int rand = random.nextInt();
            array.add(i, rand);

        }

        return array;
    }

    /*
        Enviado por Lorayne, não executa, código será analisado
    private static void novoSort(ArrayList<Integer> arrayR) {
        for (int atual = 0; atual < arrayR.size() - 1; atual++) {
            int analise = atual;
            while (arrayR.get(analise) < arrayR.get(analise - 1)) {
                Integer arrayAnalise = arrayR.get(analise);
                Integer arrayAnaliseMenosUm = arrayR.get(analise - 1);
                arrayR.set(analise, arrayAnaliseMenosUm);
                arrayR.set(analise - 1, arrayAnalise);

            }

        }
    }*/
}

class MergeSort {

    private ArrayList<Integer> inputArray;

    public MergeSort(ArrayList<Integer> inputArray) {
        this.inputArray = inputArray;
    }

    public void sortGivenArray() {
        divide(0, this.inputArray.size() - 1);
    }

    public void divide(int startIndex, int endIndex) {

        if (startIndex < endIndex && (endIndex - startIndex) >= 1) {
            int mid = (endIndex + startIndex) / 2;
            divide(startIndex, mid);
            divide(mid + 1, endIndex);

            merger(startIndex, mid, endIndex);
        }
    }

    public void merger(int startIndex, int midIndex, int endIndex) {

        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();

        int leftIndex = startIndex;
        int rightIndex = midIndex + 1;

        while (leftIndex <= midIndex && rightIndex <= endIndex) {
            if (inputArray.get(leftIndex) <= inputArray.get(rightIndex)) {
                mergedSortedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            } else {
                mergedSortedArray.add(inputArray.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex <= midIndex) {
            mergedSortedArray.add(inputArray.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= endIndex) {
            mergedSortedArray.add(inputArray.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = startIndex;
        while (i < mergedSortedArray.size()) {
            inputArray.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }
}

 class QuickSort {
     private static ArrayList<Integer> inputArray = new ArrayList<Integer>();

     public QuickSort(ArrayList<Integer> inputArray) {
         QuickSort.inputArray = inputArray;
     }

     public void startQuickStart(int start, int end) {
         int q;
         if (start < end) {
             q = partition(start, end);
             startQuickStart(start, q);
             startQuickStart(q + 1, end);
         }
     }


     int partition(int start, int end) {

         int init = start;
         int length = end;

         Random r = new Random();
         int pivotIndex = nextIntInRange(start, end, r);
         int pivot = inputArray.get(pivotIndex);

         while (true) {
             while (inputArray.get(length) > pivot && length > start) {
                 length--;
             }

             while (inputArray.get(init) < pivot && init < end) {
                 init++;
             }

             if (init < length) {
                 int temp;
                 temp = inputArray.get(init);
                 inputArray.set(init, inputArray.get(length));
                 inputArray.set(length, temp);
                 length--;
                 init++;
             } else {
                 return length;
             }
         }

     }
     static int nextIntInRange(int min, int max, Random rng) {
         if (min > max) {
             throw new IllegalArgumentException("Erro no range [" + min + ", " + max + "].");
         }
         int diff = max - min;
         if (diff >= 0 && diff != Integer.MAX_VALUE) {
             return (min + rng.nextInt(diff + 1));
         }
         int i;
         do {
             i = rng.nextInt();
         } while (i < min || i > max);
         return i;
     }
 }
