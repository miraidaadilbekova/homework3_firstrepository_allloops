import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            System.out.println("Before the operation: " + i);
            i = i * 10;
            System.out.println("After the operation: " + i);
        }
    }
}




public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 1000) {
            System.out.println(i);
            i *= 10;
        }
    }
}





public class Main {
    public static void main(String[] args) {
        int n = 30;
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }
    }
}



public class Main {
    public static void main(String[] args) {
        int n = 30;
        int i = 1;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i <= n);
    }
}




public class Main {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(i);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Infinite loop");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        int n = 40;
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        } while (i <= n);
    }
}



public class Main {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i <= n; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



public class Main {
    public static void main(String[] args) {
        int n = 40;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}




public class Main {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 1; i <= n; i = i + 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}




public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i = i + 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 1234;
        System.out.print("Enter your PIN: ");
        int yourPin = scanner.nextInt();
        if (yourPin == pin) {
            System.out.println("Access granded!");
        } else {
        }
        System.out.print("Your second try: ");
        int secondTry = scanner.nextInt();
        if (secondTry == pin) {
            System.out.println("Access granded!");
        } else {
            System.out.println("Incorrect PIN");
        }
        System.out.print("Your third try: ");
        int thirdTry = scanner.nextInt();
        if (thirdTry == pin) {
            System.out.println("Access granded!");
        } else {
            System.out.println("Incorrect PIN");
        }
        if (yourPin != pin && secondTry != pin && thirdTry != pin) {
            System.out.println("Card blocked");
        }

        scanner.close();




    }
}






public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = 6;
    System.out.print("Your guess: ");
    int yourGuess = scanner.nextInt();
    if (yourGuess > 6) {
        System.out.println("Too high");
    } else if (yourGuess < 6) {
        System.out.println("Too low");
    } else if (yourGuess == m) {
        System.out.println("Correct!");
        return;
    }
    System.out.print("Second chance: ");
    int secondChance = scanner.nextInt();
    if (secondChance > 6) {
        System.out.println("Too high");
    } else if (secondChance < 6) {
        System.out.println("Too low");
    } else if (secondChance == m) {
        System.out.println("Correct!");
        return;
    }
    System.out.print("Third chance: ");
    int thirdChance = scanner.nextInt();
    if (thirdChance > 6) {
        System.out.println("Too high");
    } else if (thirdChance < 6) {
        System.out.println("Too low");
    } else if (thirdChance == m) {
        System.out.println("Correct");
        return;
    }
    System.out.print("Last chance: ");
    int lastChance = scanner.nextInt();
    if (lastChance > 6) {
        System.out.println("Too high");
    } else if (lastChance < 6) {
        System.out.println("Too low");
    } else if (lastChance == m) {
        System.out.println("Correct!");
        return;
    } else {
        System.out.println("Game over");
    }
}
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter your number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                positive = positive + 1;
            } else if (num < 0) {
                negative = negative + 1;
            } else {
                zeros = zeros + 1;
            }
            if (num % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("STATISTICS");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        scanner.close();

    }

}



import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double pin = 123;
    System.out.print("Enter your PIN: ");
    double enterYourPin = scanner.nextDouble();
    if (enterYourPin == pin) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Second try: ");
        double secondTry = scanner.nextDouble();
        if (secondTry == pin) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Last try: ");
            double lastTry = scanner.nextDouble();
            if (lastTry == pin) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Your account has been blocked.");
                System.out.println("your account t has been locked.");
                scanner.close();
                return;
            }
        }
    }
    double balance = 1000;
    int choice = 0;
    while (choice != 4) {
        System.out.println("***ATM MENU***");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Current balance: " + balance);
        } else if (choice == 2) {
            System.out.println("Enter the deposit amount: ");
            double deposit = scanner.nextDouble();
            if (deposit > 0) {
                balance += deposit;
                System.out.println("Updated balance: " + balance);
            } else {
                System.out.println("Invalid amount. Must be greater that zero.");
            }
        } else if (choice == 3){
            System.out.println("Enter your withdrawal amount: ");
            double withdraw = scanner.nextDouble();
            if (withdraw > 0 && withdraw <= balance) {
                balance -= withdraw;
                System.out.println("Updated balance: " + balance);
            } else {
                System.out.println("Invalid amount of insufficient funds.");
            }
        } else if (choice == 4) {
            System.out.println("Thank ypu for using our ATM!");
        } else {
            System.out.println("Invalid option. Please choose between 1 and 4.");
        }
    }
    scanner.close();



}
}


