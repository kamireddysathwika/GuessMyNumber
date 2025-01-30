public class GuessMyNumber {
    public static void main(String[] args) {
        int targetNumber = 42;
        int[] guesses = {35, 40, 42}; 
        boolean isGuessedCorrectly = false;
        for (int guess : guesses) {
            System.out.println("Your guess: " + guess);
            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                isGuessedCorrectly = true;
                break; 
            } else {
                System.out.println("Wrong guess, try again!");
            }
        }
        if (!isGuessedCorrectly) {
            System.out.println("The correct number was: " + targetNumber);
        }
    }
}
