//  Class author:  Rodwell Alfred (King of Coding)
//  Date created:  11/2/25
//  General description: a class containing a main method that calls other methods to produce each of the patterns listed below
//


public class Pattern {

    // Pre: rows tells how many lines of stars to print.
    // Post: prints stars that grow by two each line.
    public static void stars(int rows){
        String stars = "*";
        while (rows > 0) {
            System.out.println(stars);
            stars += "**";
            rows--;
        }
    }

    // Pre: rows tells how many lines to print.
    // Post: prints a triangle made of numbers.
    public static void triangle(int rows){
        int number = 1;
        while (number <= rows){
            int num2 = 0;
            while (num2 < number){
                System.out.print(number);
                num2++;
            } 
            System.out.println("");
            number += 1; 
        } 
    }

    // Pre: start is the first odd number to use.
    // Post: prints lines of odd numbers going down.
    public static void odds(int start){
        for (int n = 1; start >= 1; start -= 2){
            for (int m = 0; m < start; m++){
                System.out.print(start);
            }
            System.out.println("");
        }
            }


    // Pre: maxE is how tall the pattern should be.
    // Post: prints E and O lines that switch each time.
    public static void eo(int maxE){
        int numero = 1;
        char letter = 'O';
     
        if (maxE % 2 == 0){
            letter = 'O';
        } else {
            letter = 'E';
        }

        while (numero <= maxE){
            int num3 = 0;
            while (num3 < numero){
                System.out.print(letter);
                num3++;
            }
            if (letter == 'O'){
                letter = 'E';
            } else if (letter == 'E'){
                letter = 'O';
            } 
            System.out.println("");
            numero += 1;
        }

        while (numero > 0){
            int num3 = 0;
            while (num3 < numero){
                System.out.print(letter);
                num3++;
            }
            if (letter == 'O'){
                letter = 'E';
            } else if (letter == 'E'){
                letter = 'O';
            } 
            System.out.println("");
            numero -= 1;
        }
    }

    // Pre: rows is how many lines the pyramid should have.
    // Post: prints a number pyramid that gets smaller each row.
    public static void pyramid(int rows){
        int g = 1;
        while (rows >= g){
            int h = 1;
            while (h < g){
                System.out.print(" ");
                h++;
            }

            int t = 1;
            int count = 2 * (rows - g) + 1;
            while (t <= count){
                System.out.print(g);
                t++;
            }
            System.out.println("");
            g++;
        }
    }

    public static void main(String[] args) { 
        eo(6);
    }
}
