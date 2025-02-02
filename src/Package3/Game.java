package Package3;

public class Game {
    public static void main(String[] args) {
        String path = "src/Package3/path.txt"; // Assuming the file is in the same directory as the program

        System.out.println("Loading map using Scanner:");
        Map mapUsingScanner = new Map(path, Option.SCANNER);
        mapUsingScanner.displayMap();

        System.out.println("\nLoading map using BufferedReader:");
        Map mapUsingBuffer = new Map(path, Option.BUFFER);
        mapUsingBuffer.displayMap();
    }
}
