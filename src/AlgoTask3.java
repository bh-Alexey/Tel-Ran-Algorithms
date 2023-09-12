public class AlgoTask3 {
    public static void main(String[] args) {

    }

    public static int symbolInString(String line, char symbol) {
        int counter = 0;
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }

    public static int recursiveCharsCounter(String line, char symbol) {
        if (line.isEmpty()) {
            return 0;
        }
        int counter = (line.charAt(0) == symbol) ? 1 : 0;
        int recursiveCounter = recursiveCharsCounter(line.substring(1), symbol);
        return counter + recursiveCounter;
    }
}
