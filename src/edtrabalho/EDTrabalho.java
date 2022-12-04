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
            System.out.println("* 6- Ordenar utilizando BucketSort;                *");
            System.out.println("* 7- Ordenar utilizando HeapSort;                *");
            System.out.println("* 8- Ordenar utilizando  couting sort;                *");
            System.out.println("* 9- Ordenar utilizando ShellSort;                *");
            System.out.println("* 10- Ordenar utilizando cocktail;               *");
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

                        bubbleSort(
                                array1);

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

                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);



                        //Tempo para 1000
                        t = System.nanoTime();

                        bucket_sort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (bucket_sort)");

                        //Tempo para 10000
                        t = System.nanoTime();


                        bucket_sort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        bucket_sort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        bucket_sort(array4);
                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s(bucketSort)");


                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);


                        //Tempo para 1000
                        t = System.nanoTime();
                        bucket_sort(array1);


                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s bucketSort");

                        //Tempo para 10000
                        t = System.nanoTime();
                        bucket_sort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        bucket_sort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        bucket_sort(array4);


                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (bucketSort)");


                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);


                        //Tempo para 1000
                        t = System.nanoTime();
                        bucket_sort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        bucket_sort(array2);
                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        bucket_sort(array3);
                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (bucketSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        bucket_sort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (bucketSort)");





                    case 7:

                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);



                        //Tempo para 1000
                        t = System.nanoTime();


                        heapSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (Heap Sort)");

                        //Tempo para 10000
                        t = System.nanoTime();


                        heapSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (Heap Sort )");

                        //Tempo para 500000
                        t = System.nanoTime();
                        heapSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (HeapSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        heapSort(array4);
                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s(HeapSort)");

                if (true) {
                    //criação coleção ordenada
                    array1 = criarColecao(array1, 1000);
                    array2 = criarColecao(array2, 10000);
                    array3 = criarColecao(array3, 500000);
                    array4 = criarColecao(array4, 1000000);


                    //Tempo para 1000
                    t = System.nanoTime();
                    heapSort(array1);


                    t = System.nanoTime() - t;

                    System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s HeapSort");

                    //Tempo para 10000
                    t = System.nanoTime();
                     heapSort(array2);

                    t = System.nanoTime() - t;

                    System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (HeapSort)");

                    //Tempo para 500000
                    t = System.nanoTime();
                    heapSort(array3);

                    t = System.nanoTime() - t;
                    System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (HeapSort)");

                    //Tempo para 1000000
                    t = System.nanoTime();
                    heapSort(array4);


                    t = System.nanoTime() - t;
                    System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (HeapSort)");
                }

                //reversão do Array para executar pior caso
                Collections.reverse(array1);
                Collections.reverse(array2);
                Collections.reverse(array3);
                Collections.reverse(array4);


                //Tempo para 1000
                t = System.nanoTime();
                 heapSort(array1);

                t = System.nanoTime() - t;

                System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (HeapSort)");

                //Tempo para 10000
                t = System.nanoTime();

               heapSort(array2);
                t = System.nanoTime() - t;

                System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (HeapSort)");

                //Tempo para 500000
                t = System.nanoTime();

                heapSort(array3);
                t = System.nanoTime() - t;
                System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (HeapSort)");

                //Tempo para 1000000
                t = System.nanoTime();
                heapSort(array4);

                t = System.nanoTime() - t;
                System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (HeapSort)");




                break;

                    case 8:


                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);



                        //Tempo para 1000
                        t = System.nanoTime();


                        countingSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 10000
                        t = System.nanoTime();


                        countingSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        countingSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        countingSort(array4);
                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "(countingSort)");


                            //criação coleção ordenada
                            array1 = criarColecao(array1, 1000);
                            array2 = criarColecao(array2, 10000);
                            array3 = criarColecao(array3, 500000);
                            array4 = criarColecao(array4, 1000000);


                            //Tempo para 1000
                            t = System.nanoTime();
                        countingSort(array1);


                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s countingSort");

                            //Tempo para 10000
                            t = System.nanoTime();
                        countingSort(array2);

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (countingSort)");

                            //Tempo para 500000
                            t = System.nanoTime();
                        countingSort(array3);

                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (countingSort)");

                            //Tempo para 1000000
                            t = System.nanoTime();
                        countingSort(array4);


                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (countingSort)");


                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);


                        //Tempo para 1000
                        t = System.nanoTime();
                        countingSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        countingSort(array2);
                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        countingSort(array3);
                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (countingSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        countingSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (countingSort)");





                        break;

                    case 9:

                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);



                        //Tempo para 1000
                        t = System.nanoTime();


                        shellSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 10000
                        t = System.nanoTime();


                        shellSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        shellSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        shellSort(array4);
                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s(ShellSort)");


                        //criação coleção ordenada
                        array1 = criarColecao(array1, 1000);
                        array2 = criarColecao(array2, 10000);
                        array3 = criarColecao(array3, 500000);
                        array4 = criarColecao(array4, 1000000);


                        //Tempo para 1000
                        t = System.nanoTime();
                        shellSort(array1);


                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s ShellSort");

                        //Tempo para 10000
                        t = System.nanoTime();
                        shellSort(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        shellSort(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        shellSort(array4);


                        t = System.nanoTime() - t;
                        System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (ShellSort)");


                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);


                        //Tempo para 1000
                        t = System.nanoTime();
                        shellSort(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        shellSort(array2);
                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        shellSort(array3);
                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (ShellSort)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        shellSort(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (ShellSort)");





                        break;

                    case 10:
                        //criar coleção randomica
                        array1 = randomico(array1, 1000);
                        array2 = randomico(array2, 10000);
                        array3 = randomico(array3, 500000);
                        array4 = randomico(array4, 1000000);



                        //Tempo para 1000
                        t = System.nanoTime();


                        cocktail(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (1000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 10000
                        t = System.nanoTime();


                        cocktail(array2);

                        t = System.nanoTime() - t;

                        System.out.println("Randomico cenário (10000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 500000
                        t = System.nanoTime();
                        cocktail(array3);

                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (50000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 1000000
                        t = System.nanoTime();

                        cocktail(array4);
                        t = System.nanoTime() - t;
                        System.out.println("Randomico cenário (1000000) 0.000" + t / 100000 + "s( cocktail)");

                        if (true) {
                            //criação coleção ordenada
                            array1 = criarColecao(array1, 1000);
                            array2 = criarColecao(array2, 10000);
                            array3 = criarColecao(array3, 500000);
                            array4 = criarColecao(array4, 1000000);


                            //Tempo para 1000
                            t = System.nanoTime();
                            cocktail(array1);


                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (1000) 0.000" + t / 100000 + "s  cocktail");

                            //Tempo para 10000
                            t = System.nanoTime();
                            cocktail(array2);

                            t = System.nanoTime() - t;

                            System.out.println("Melhor cenário (10000) 0.000" + t / 100000 + "s (cocktail)");

                            //Tempo para 500000
                            t = System.nanoTime();
                            cocktail(array3);

                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (50000) 0.000" + t / 100000 + "s (cocktail)");

                            //Tempo para 1000000
                            t = System.nanoTime();
                            cocktail(array4);


                            t = System.nanoTime() - t;
                            System.out.println("Melhor cenário (1000000) 0.000" + t / 100000 + "s (cocktail)");
                        }

                        //reversão do Array para executar pior caso
                        Collections.reverse(array1);
                        Collections.reverse(array2);
                        Collections.reverse(array3);
                        Collections.reverse(array4);


                        //Tempo para 1000
                        t = System.nanoTime();
                        cocktail(array1);

                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (1000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 10000
                        t = System.nanoTime();

                        cocktail(array2);
                        t = System.nanoTime() - t;

                        System.out.println("Pior cenário (10000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 500000
                        t = System.nanoTime();

                        cocktail(array3);
                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (50000) 0.000" + t / 100000 + "s (cocktail)");

                        //Tempo para 1000000
                        t = System.nanoTime();
                        cocktail(array4);

                        t = System.nanoTime() - t;
                        System.out.println("Pior cenário (1000000) 0.000" + t / 100000 + "s (cocktail)");


                        break;

                    case 0:
                        System.out.println("Saindo");
                }

            }
        } while (op != 0);
    }

/*Enviado por lorayne */
public static void bucket_sort(ArrayList<Integer> arr)
{


         int max_value = 0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i)> max_value){
                max_value = arr.get(i);
            }
        }


    int[] bucket = new int[max_value + 1];
    int[] sorted_arr = new int[arr.size()];

    for (int i= 0; i <arr.size(); i++)
        bucket[arr.get(i)]++;

    int pos = 0;
    for (int i = 0; i < bucket.length; i++) {
        for (int j = 0; j < bucket[i]; j++) {
            sorted_arr[pos++] = i;
        }
    }

}








    public static void countingSort(ArrayList<Integer> vetor){
        vetor = randomico(vetor, 1000);
        int maior = vetor.get(0);
        for (int i = 1; i < vetor.size(); i++) {
            if (vetor.get(i) > maior) {
                maior = vetor.get(i);
            }
        }
       // int mudarTamanho =maior+1 ;mudarTamanho tamanho

        ArrayList<Integer> c = new ArrayList<>();
        c = randomico(c, 1000);
        int cont =0;
        for (int i = 0; i < vetor.size()-1; i++) {
            c.set(vetor.get(i),cont++);

        }
        int cont2 =0;
        for (int i = 1; i < c.size(); i++) {
            cont2=c.get(i-1)+1;
            c.set(i,cont2);
        }
        int tamanho = vetor.size();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = b.size()-1; i >=0 ; i--) {
            b.set(c.get(vetor.get(i))-1, vetor.get(i));
             c.set(vetor.get(i),-1);


        }

    }



/*Enviado por Lorayne*/
    public static void shellSort(ArrayList<Integer> lista) {
        int h = 1;
        int n = lista.size();

        while(h < n) {
            h = h * 3 + 1;
        }

        h = (int)Math.floor(h / 3);
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = lista.get(i);
                j = i;
                while (j >= h && lista.get(j - h) > c) {
                    lista.set(j,j-i);
                    j = j - h;
                }
                lista.set(j,c);
            }
            h = h / 2;
        }
    }

    /*Enviado Por Lorayne*/
    public static void heapSort(ArrayList<Integer>vet){
        int tamanho = vet.size();
        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--;
                t = vet.get(i);
            }else{
                tamanho--;
                if (tamanho <= 0) {return;
                }
                t = vet.get(tamanho);
                vet.set(tamanho,vet.get(0));
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vet.get(filho + 1) > vet.get(filho))) {
                    filho++;
                }
                if (vet.get(filho) > t){
                    vet.set(pai,vet.get(filho));
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vet.set(pai,t);
        }
    }


    private static void cocktail(ArrayList<Integer> vetor)
    {
        int tamanho, inicio, fim, swap, aux;
        tamanho = vetor.size()/2;
        inicio = 0;
        fim = tamanho - 1;
        swap = 0;
        while (swap == 0 && inicio < fim)
        {
            swap = 1;
            for (int i = inicio; i < fim; i = i + 1)
            {
                if (vetor.get(i) > vetor.get(i+1))
                {
                    aux = vetor.get(i);
                    vetor.set(i,vetor.get(i+1));
                    vetor.set(i+1,aux);
                    swap = 0;
                }
            }
            fim = fim - 1;
            for (int i = fim; i > inicio; i = i - 1)
            {
                if (vetor.get(i) < vetor.get(i-1))
                {
                    aux = vetor.get(i);
                    vetor.set(i,vetor.get(i-1));
                    vetor.set(i-1,aux);
                    swap = 0;
                }
            }
            inicio = inicio + 1;
        }
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

