package ClassesJava;

import java.io.*;
import java.util.Scanner;

public class TicTacToe {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";


    public static String p1;
    public static String p2;


    public static String win(String[][] wgrid, String pl1){
        if (wgrid[0][0].equals(wgrid[1][0]) && wgrid[0][0].equals(wgrid[2][0]) && wgrid[0][0] != "-"){
            if (wgrid[0][0].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[0][0].equals(wgrid[0][1]) && wgrid[0][0].equals(wgrid[0][2]) && wgrid[0][0] != "-"){
            if (wgrid[0][0].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[0][0].equals(wgrid[1][1]) && wgrid[0][0].equals(wgrid[2][2]) && wgrid[0][0] != "-"){
            if (wgrid[0][0].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[2][0].equals(wgrid[1][1]) && wgrid[2][0].equals(wgrid[0][2]) && wgrid[2][0] != "-"){
            if (wgrid[2][0].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[2][1].equals(wgrid[1][1]) && wgrid[2][1].equals(wgrid[0][1]) && wgrid[2][1] != "-"){
            if (wgrid[2][1].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[0][2].equals(wgrid[1][2]) && wgrid[2][2].equals(wgrid[0][2]) && wgrid[0][2] != "-"){
            if (wgrid[0][2].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[2][0].equals(wgrid[2][1]) && wgrid[2][0].equals(wgrid[2][2]) && wgrid[2][0] != "-"){
            if (wgrid[2][0].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else if (wgrid[1][1].equals(wgrid[1][2]) && wgrid[1][1].equals(wgrid[1][0]) && wgrid[1][1] != "-"){
            if (wgrid[1][1].equals(pl1)){
                return "Player 1 Won!";
            } else {
                return "Player 2 Won!";
            }
        } else {
            return "Nobody won";
        }
    }

    public static void pos(int x, int y, String player, String[][] pgrid){
        if (y == 0){
            y = 2;
        } else if (y == 2){
            y = 0;
        }

        if (player.equals("X")){
            pgrid[y][x] = player;
        } else {
            pgrid[y][x] = player;
        }
    }


    public static void printGrid(String mat[][]) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
            System.out.println();
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String grid[][] = {{"-", "-", "-"},
                           {"-", "-", "-"},
                           {"-", "-", "-"}};

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1, do you want to be X? Enter 'yes' or 'no'. ");
        String XorO = scanner.nextLine();

        if (XorO.equals("yes")) {
            System.out.println("\nThat means Player 1 is X, and Player 2 is O.\n");
            p1 = RED + "X" + RESET;
            p2 = BLUE + "O" + RESET;
        } else if (XorO.equals("no")) {
            System.out.println("\nThat means Player 1 is O, and Player 2 is X.\n");
            p1 = BLUE + "O" + RESET;
            p2 = RED + "X" + RESET;
        } else {
            System.out.println("\nThat was not a valid answer. Remember, you had to enter 'yes' or 'no'.");
            System.out.println("\nRun the project again.");
        }

        printGrid(grid);

        int turns = 0;
        String won;

        while (turns < 9){
            turns += 1;

            System.out.println("\nPlayer 1, enter your x position.");
            String xpos1 = scanner.nextLine();
            int x1 = Integer.parseInt(xpos1);

            System.out.println("\nPlayer 1, enter your y position.");
            String ypos1 = scanner.nextLine();
            int y1 = Integer.parseInt(ypos1);

            if (y1 == 1){
                y1 = 3;
            } else if (y1 == 3){
                y1 = 1;
            }

            if (grid[y1-1][x1-1].equals("-")){
                if (y1 == 1){
                    y1 = 3;
                } else if (y1 == 3){
                    y1 = 1;
                }
                pos(x1-1, y1-1, p1, grid);
            } else {
                System.out.println("INVALID POSITION");
                break;
            }
            printGrid(grid);

            won = win(grid, p1);
            if (won != "Nobody won"){
                System.out.println("\n" + won);
                break;
            }

            System.out.println("\nPlayer 2, enter your x position.");
            String xpos2 = scanner.nextLine();
            int x2 = Integer.parseInt(xpos2);

            System.out.println("\nPlayer 2, enter your y position.");
            String ypos2 = scanner.nextLine();
            int y2 = Integer.parseInt(ypos2);

            if (y2 == 1){
                y2 = 3;
            } else if (y2 == 3){
                y2 = 1;
            }

            if (grid[y2-1][x2-1] == "-"){
                if (y2 == 1){
                    y2 = 3;
                } else if (y2 == 3){
                    y2 = 1;
                }
                pos(x2-1, y2-1, p2, grid);
            } else {
                System.out.println("INVALID POSITION");
                break;
            }
            printGrid(grid);

            won = win(grid, p1);
            if (won != "Nobody won"){
                System.out.println("\n" + won);
                break;
            }
        }
    }
}
