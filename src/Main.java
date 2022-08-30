import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int age = 22;
        if (age >=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        System.out.println("задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >=18 && age <24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("задание 3");
        int capacity = 120;
        int seating = 60;  // сидячие места
        int standingPlaces = capacity - seating; // стоячие места
        int occupiedBySedentary = 60; // зан сид
        int occupiedStanding = 55;  // зан ст
        if (occupiedBySedentary < seating ) {
            System.out.println("Осталось еще " + (seating - occupiedBySedentary)  + " сидячих мест ");
        }
        if (seating == occupiedBySedentary) {
            System.out.println(" Сидячих мест нет");
        }
        if (occupiedStanding < standingPlaces) {
            System.out.println("Осталось еще  " + (standingPlaces - occupiedStanding) + " стоячих мест ");
        }
        if (standingPlaces == occupiedStanding) {
            System.out.println(" Стоячих мест нет");



        }


    }
}