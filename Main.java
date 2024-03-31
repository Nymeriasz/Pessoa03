package Pessoa03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] people = new Pessoa[3];
        for (int i=0; i<people.length; i++){
            people[i]=new Pessoa();
            System.out.println("Name "+(i+1)+":");
            people[i].setName(scanner.nextLine());
            System.out.println("Age "+(i+1)+":");
            people[i].setAge(scanner.nextInt());
            scanner.nextLine();
        }
        for (int i=0;i< people.length;i++){
            System.out.println("Name: "+people[i].getName());
            System.out.println("Age: "+people[i].getAge());
        }
    }
}
