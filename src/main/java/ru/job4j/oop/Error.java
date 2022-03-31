package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error test = new Error();
        Error test1 = new Error(true, 123, "Text1");
        Error test2 = new Error(false, 456, "Text2");
        Error test3 = new Error(true, 789, "Text3");
        test.printInfo();
        test1.printInfo();
        test2.printInfo();
        test3.printInfo();
    }
}
