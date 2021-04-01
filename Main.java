public class Main {
    
    public static void main(String[] args) {

        int one = 13;
        int two = 20;
        int three = 10;
        System.out.println(hasTeen(one, two, three));

    }
    
    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

// hasTeen(13, 20, 10) → true
// hasTeen(20, 19, 10) → true
// hasTeen(20, 10, 13) → true

public static boolean hasTeen(int a, int b, int c) {

    return (a >= 13 && a <= 13) || (b >= 13 && b <= 13) || (c >= 13 && c <= 13);
    
}

}