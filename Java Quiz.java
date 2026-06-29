import java.util.Scanner;

public class javaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("*********************");
        System.out.println("Welcome to Quizzyy!!");
        System.out.println("*********************");
        //array for question
        String[] quest = {"Question 1: What is the correct way to declare a variable in Java?",
                "Question 2: Which of the following is NOT a primitive data type in Java?",
                "Question 3: Which method is the entry point of a Java program?",
                "Question 4: What does the 'new' keyword do in Java?"};
        //2d array for options
        String[][] options = {{"1. var name = \"John\";", "2. String name = \"John\";", "3. name String = \"John\";", "4. declare String name = \"John\";"},
                {"1. int", "2. double", "3. String", "4. boolean"},
                {"1) public void main()", "2) public static void main(String[] args)", "3) public main(String[] args)", "4) static main()"},

                {"1. Creates a new variable", "2. Declares a new class", "3) Allocates memory for an object and calls its constructor", "4) Starts a new method"}
        };
        for (int i = 0; i < quest.length; i++) {
            System.out.println(quest[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            int[] guessSheet = {2, 3, 2, 3};
            System.out.print("Your answer: ");
            int guess = sc.nextInt();
            System.out.print(" ");
            if (guess == guessSheet[i]) {
                score++;
                System.out.println("# ****Correct**** #");
            } else {
                System.out.println("#*****Wrong******#");
            }

        }
        System.out.println("Your total score is " + score + " out of 4");
        sc.close();
    }
}
