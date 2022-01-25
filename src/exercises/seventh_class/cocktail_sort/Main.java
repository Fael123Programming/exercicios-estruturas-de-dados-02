package exercises.seventh_class.cocktail_sort;

import exercises.fourth_class.AuxiliarClass;
import sorting_methods.cocktail_sort.CocktailSort;

public class Main {
    public static void main(String[] args) {
        //Root path of the unsorted files.
        final String ROOT_PATH_UNSORTED_DATA = "src/exercises/unsorted_data/";
        //Root path to create the new files with sorted data.
        final String ROOT_PATH_SORTED_DATA = "src/exercises/seventh_class/cocktail_sort/sorted_data/";
        int[] numbers; //Array to contain all numbers gotten from the files with unsorted data.
        System.out.println("Cocktail Sort");
        System.out.println("----------------------------------------------------------------------");
//        File with 5 numbers.
        System.out.println("File with 5 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados5.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados5.txt", numbers, CocktailSort.getReport());
//    ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados100.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados100.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 1000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados1000.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados1000.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 10000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados10_mil.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados10_mil.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 50000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados50_mil.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados50_mil.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 100000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados100_mil.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados100_mil.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");
        System.out.println("File with 500000 numbers");
        numbers = AuxiliarClass.getNumbersInFile(ROOT_PATH_UNSORTED_DATA + "dados500_mil.txt");
        CocktailSort.sort(numbers);
        System.out.println(CocktailSort.getReport());
        AuxiliarClass.recordInfoIntoFile(ROOT_PATH_SORTED_DATA + "dados500_mil.txt", numbers, CocktailSort.getReport());
//     ----------------------------------------------------------------------------------------------------
    }
}