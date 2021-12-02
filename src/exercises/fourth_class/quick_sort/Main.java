package exercises.fourth_class.quick_sort;

import exercises.fourth_class.AuxiliarClass;
import sorting_methods.quick_sort.QuickSort;

public class Main {
    public static void main(String[] args) {
        //Root path of the unsorted files.
        final String rootPathUnsortedFiles = "C:\\Users\\rafae\\OneDrive\\Documents\\prg\\java\\" +
                "exercicios-estruturas-de-dados-02\\src\\exercises\\second_class\\unsorted_data\\";
        //Root path to create the new files with sorted data.
        final String rootPathSortedFiles = "C:\\Users\\rafae\\OneDrive\\Documents\\prg\\java\\" +
                "exercicios-estruturas-de-dados-02\\src\\exercises\\fourth_class\\quick_sort\\sorted_data\\";
        int[] numbers; //Array to contain all numbers gotten from the files with unsorted data.
        System.out.println("Quick Sort Ordination");
        System.out.println("----------------------------------------------------------------------");
//        File with 5 numbers.
        System.out.println("File with 5 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados5.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados5.txt", numbers, QuickSort.getReport());
//    ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados100.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados100.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 1000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados1000.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados1000.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 10000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados10_mil.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados10_mil.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 50000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados50_mil.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados50_mil.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados100_mil.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados100_mil.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 500000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados500_mil.txt");
        QuickSort.enhancedSort(numbers);
        System.out.println(QuickSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados500_mil.txt", numbers, QuickSort.getReport());
//     ----------------------------------------------------------------------------------------------------
    }
}