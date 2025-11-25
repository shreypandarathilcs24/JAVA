import java.util.Scanner;

class WrongAgeException extends Exception {
    WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int father_age;

    Father(int father_age) throws WrongAgeException {
        if (father_age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.father_age = father_age;
    }
}

class Son extends Father {
    int son_age;

    Son(int father_age, int son_age) throws WrongAgeException {
        super(father_age);

        if (son_age > father_age) {
            throw new WrongAgeException("Son's age cannot be greater than father's age.");
        }
        this.son_age = son_age;
    }
}

public class exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Father's Age: ");
        int father_age = sc.nextInt();

        System.out.print("Enter Son's Age: ");
        int son_age = sc.nextInt();

        try {
            Son s = new Son(father_age, son_age);
            System.out.println("Ages are valid!");
        } catch (WrongAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
