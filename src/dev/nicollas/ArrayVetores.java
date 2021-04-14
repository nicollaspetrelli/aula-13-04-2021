package dev.nicollas;

public class ArrayVetores {
    public static void main(String[] args) {
        // Vetores - Arrays
        int[] array = new int[5];

        array[0] = 9;
        array[1] = 7;
        array[2] = 3;
        array[3] = 5;
        array[4] = 8;

        System.out.println(array[3]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int j : array) {
            System.out.println(j);
        }

        // Os arrays sempre devem ser iniciados passando o tamanho para o array
    }
}
