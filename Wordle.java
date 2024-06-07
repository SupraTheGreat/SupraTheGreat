package ClassesJava;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Wordle {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";


    private static Set<String> wordsSet;

    public static void Dictionary() throws IOException {
        Path path = Paths.get("C:\\Users\\raghavap\\IdeaProjects\\MyFirstProjectJava\\src\\ClassesJava\\words.txt");
        byte[] readBytes = Files.readAllBytes(path);
        String wordListContents = new String(readBytes, "UTF-8");
        String[] words = wordListContents.split("\r\n");
        wordsSet = new HashSet<>();
        Collections.addAll(wordsSet, words);
    }

    public static boolean contains(String word) {
        return wordsSet.contains(word);
    }

    public static void printA(String[] alphabet, ArrayList<String> gr, ArrayList<String> ye, ArrayList<String> re){
        for (int i = 0; i < alphabet.length; i++){
            if (gr.contains(alphabet[i].toLowerCase())){
                System.out.print(GREEN + alphabet[i] + RESET);
            } else if (ye.contains(alphabet[i].toLowerCase())){
                System.out.print(YELLOW + alphabet[i] + RESET);
            } else if (re.contains(alphabet[i].toLowerCase())){
                System.out.print(RED + alphabet[i] + RESET);
            } else {
                System.out.print(alphabet[i]);
            }
            System.out.print(" ");
        }
    }

    public static String getC(String str, int index) {
        return Character.toString(str.charAt(index));
    }

    static void traverseString(String str, String aword, String iword, ArrayList<String> g, ArrayList<String> y, ArrayList<String> r, String[] currentlist){
        for (int i = 0; i < 5; i++) {
            // Print current character
            if (getC(iword, i).equals(getC(aword, i)) && !g.contains(getC(iword, i))){
                g.add(getC(iword, i));
            } else if (aword.contains(getC(iword, i)) && !y.contains(getC(iword, i)) && !g.contains(getC(iword, i))){
                y.add(getC(iword, i));
            } else if (!r.contains(getC(iword, i)) && !g.contains(getC(iword, i)) && !y.contains(getC(iword, i))) {
                r.add(getC(iword, i));
            }

            if (getC(iword, i).equals(getC(aword, i))) {
                currentlist[i] = GREEN + getC(iword, i) + RESET;
            } else if (aword.contains(getC(iword, i))){
                currentlist[i] = YELLOW + getC(iword, i) + RESET;
            } else {
                currentlist[i] = RED + getC(iword, i) + RESET;
            }
        }
//        System.out.println(g);
//        System.out.println(y);
//        System.out.println(r);
    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> green = new ArrayList<>();
        ArrayList<String> yellow = new ArrayList<>();
        ArrayList<String> red = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        // Accessing words.txt (The list of words) to get a single word
        String word = choose(new File("C:\\Users\\raghavap\\IdeaProjects\\MyFirstProjectJava\\src\\ClassesJava\\words.txt"));

        System.out.println("Welcome to Wordle!");
        System.out.println("\nAssuming you already know how to play, let's start!");

        String[] ListOfLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] currentl = new String[5];
        Dictionary();
        int turns = 0;
        String guess = "dsafd";
        while (turns < 6 || guess.equals(word)) {
            turns += 1;
            System.out.println("\nEnter your guess.");
            guess = scanner.nextLine();
            if (guess.equals(word)){
                System.out.println("\n\n\nYou guessed the word!\n\n\n");
                break;
            } else if (turns >= 6){
                System.out.println("\n\n\nYou didn't guess the word in time...");
                System.out.println("The word was " + word + ".\n\n\n");
                break;
            }
            // The contains method checks whether the argument contains a sequence of characters.
            // In this case, we are checking if the variable contains anything at all.
            if (!contains(guess)){
                System.out.println("That word is invalid. Enter a valid one.");
                while (!contains(guess)){
                    System.out.println("\nEnter your guess.");
                    guess = scanner.nextLine();
                    if (!contains(guess)) {
                        System.out.println("That word is invalid. Enter a valid one.");
                    }
                }
            }
            traverseString(guess, word, guess, green, yellow, red, currentl);
            printA(ListOfLetters, green, yellow, red);
            System.out.println();
            for (int i = 0; i < 5; i++){
                System.out.print(currentl[i]);
            }
        }
    }

    public static String choose(File f) throws FileNotFoundException
    {
        String result = null;
        Random rand = new Random();
        int n = 0;
        for(Scanner sc = new Scanner(f); sc.hasNext(); )
        {
            ++n;
            String line = sc.nextLine();
            if(rand.nextInt(n) == 0)
                result = line;
        }

        return result;
    }
}