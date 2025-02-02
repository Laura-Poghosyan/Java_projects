package Package3;

import java.io.*;
import java.util.Scanner;

public class Map {
    private char[][] tiles; // Stores the map's tiles
    private int height;     // Number of rows
    private int width;      // Number of columns

    // Constructor
    public Map(String path, Option option) {
        try {
            if (option == Option.SCANNER) {
                readUsingScanner(path);
            } else if (option == Option.BUFFER) {
                readUsingBuffer(path);
            } else {
                throw new IllegalArgumentException("Invalid option for file reading.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read the file using Scanner
    private void readUsingScanner(String path) throws IOException {
        try (Scanner scanner = new Scanner(new File(path))) {
            height = Integer.parseInt(scanner.nextLine());
            width = Integer.parseInt(scanner.nextLine());
            tiles = new char[height][width];

            for (int i = 0; i < height; i++) {
                String[] line = scanner.nextLine().split(" ");
                for (int j = 0; j < width; j++) {
                    tiles[i][j] = line[j].charAt(0);
                }
            }
        }
    }

    // Read the file using BufferedReader
    private void readUsingBuffer(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            height = Integer.parseInt(br.readLine());
            width = Integer.parseInt(br.readLine());
            tiles = new char[height][width];

            for (int i = 0; i < height; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    tiles[i][j] = line[j].charAt(0);
                }
            }
        }
    }

    // Method to display the map
    public void displayMap() {
        System.out.println("Map (Height: " + height + ", Width: " + width + "):");
        for (int i =0; i< height; i++){
            for (int j=0; j <width; j++) {
        System.out.print(tiles[i][j] + " ");

       }
        System.out.println();
      }


        }
    }

