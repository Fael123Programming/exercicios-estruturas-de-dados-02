package exercises.fourth_class.shell_sort;

import exercises.aux_class.AuxiliarClass;
import sorting_methods.comparison_sorts.shell_sort.ShellSort;

public class Main {
    public static void main(String[] args) {
        //Root path of the unsorted files.
        final String rootPathUnsortedFiles = "C:\\Users\\rafae\\OneDrive\\Documents\\prg\\java\\" +
                "exercicios-estruturas-de-dados-02\\src\\exercises\\second_class\\unsorted_data\\";
        //Root path to create the new files with sorted data.
        final String rootPathSortedFiles = "C:\\Users\\rafae\\OneDrive\\Documents\\prg\\java\\" +
                "exercicios-estruturas-de-dados-02\\src\\exercises\\fourth_class\\shell_sort\\sorted_data\\";
        int[] numbers; //Array to contain all numbers gotten from the files with unsorted data.
        System.out.println("Shell Sort Ordination");
        System.out.println("----------------------------------------------------------------------");
//        File with 5 numbers.
        System.out.println("File with 5 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados5.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados5.txt", numbers, ShellSort.getReport());
//    ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados100.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados100.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 1000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados1000.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados1000.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 10000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados10_mil.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados10_mil.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 50000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados50_mil.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados50_mil.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados100_mil.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados100_mil.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 500000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(rootPathUnsortedFiles + "dados500_mil.txt");
        ShellSort.sort(numbers);
        System.out.println(ShellSort.getReport());
        AuxiliarClass.recordInfoIntoFile(rootPathSortedFiles + "dados500_mil.txt", numbers, ShellSort.getReport());
//     ----------------------------------------------------------------------------------------------------
    }
}
