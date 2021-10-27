package sortingMethods.binaryInsertionSort;

public class Number {
    private int value;
    private char identity;

    public Number(int value, char identity) {
        this.value = value;
        this.identity = identity;
    }

    public int getValue(){ return this.value; }

    public char getIdentity(){ return this.identity; }
}
