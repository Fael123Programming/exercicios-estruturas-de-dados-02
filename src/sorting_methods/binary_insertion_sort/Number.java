package sorting_methods.binary_insertion_sort;

public class Number {
    private final int value;
    private final char identity;

    public Number(int value, char identity) {
        this.value = value;
        this.identity = identity;
    }

    public int getValue(){ return this.value; }

    public char getIdentity(){ return this.identity; }
}
