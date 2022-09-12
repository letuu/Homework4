public class Main {
    public static void main(String[] args) {

        // Домашнее задание 1 --------------------------------------------------------------------------
        System.out.println("Задание 1.1");
        int limitAge = 18;
        int age = 15;
        System.out.println("Возраст пользователя: " + age + " лет");
        if (age >= limitAge) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < limitAge) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно подождать еще " + (limitAge - age) + " года");
        }
        System.out.println();


        System.out.println("Задание 1.2");
        int age2 = 25;
        System.out.println("Возраст пользователя: " + age2 + " лет");
        if (age2 < 7) {
            System.out.println("Вы еще очень малы и вероятно ходите в детский сад");
        }
        if (age2 >= 7) {
            if (age2 < 18) System.out.println("Вы ребенок и ходите в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Вы уже закончили школу и можете отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Вы уже окончили университет и Вам пора искать первую работу");
        }
        System.out.println();


        System.out.println("Задание 1.3");
        // capacity place sedentary standing
        // есть ли место в вагоне: сидячее или стоячее или вагон уже полностью забит
        int capacity = 102; //вместимость
        int sedentaryPlace = 60; //сидячих мест
        int standingPlace = capacity - sedentaryPlace; //42 стоячих мест
        int tickets = 80; //количество проданных билетов
        System.out.println("Количество проданных билетов: " + tickets);
        if (tickets < sedentaryPlace) {
            System.out.println("В вагоне есть свободные места, из них " + (sedentaryPlace - tickets) + " сидячих мест и " + standingPlace + " стоячих мест");
        }
        if (tickets >= sedentaryPlace) {
            if (tickets < capacity) System.out.println("В вагоне осталось только " + (capacity - tickets) + " стоячих мест");
        }
        if (tickets >= capacity) {
            System.out.println("Все билеты проданы, в вагоне нет свободных мест");
        }
            System.out.println();


        // Домашнее задание 2 --------------------------------------------------------------------------

        System.out.println("Задание 2.1");
        int limitAge3 = 18;
        int age3 = 15;
        System.out.println("Возраст пользователя: " + age3 + " лет");
        if (age >= limitAge3) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно подождать еще " + (limitAge3 - age3) + " года");
        }
        System.out.println();


        System.out.println("Задание 2.2");
        // 7-17 школа; 18-23 университет; 24+ работа
        int age4 = 24;
        System.out.println("Возраст пользователя: " + age4 + " лет");
        if (age4 < 7) {
            System.out.println("Вы еще очень малы и вероятно ходите в детский сад");
        } else if (age4 < 18) {
            System.out.println("Вы ребенок и ходите в школу");
        } else if (age4 < 24) {
            System.out.println("Вы уже закончили школу и можете отправляться в университет");
        } else {
            System.out.println("Вы уже окончили университет и Вам пора искать первую работу");
        }
        System.out.println();


        System.out.println("Задание 2.3");
        int capacity2 = 102; //вместимость
        int sedentaryPlace2 = 60; //сидячих мест
        int standingPlace2 = capacity2 - sedentaryPlace2; //42 стоячих мест
        int tickets2 = 80; //количество проданных билетов
        System.out.println("Количество проданных билетов: " + tickets2);
        if (tickets2 < sedentaryPlace2) {
            System.out.println("В вагоне есть свободные места, из них " + (sedentaryPlace2 - tickets2) + " сидячих мест и " + standingPlace2 + " стоячих мест");
        } else if (tickets2 < capacity2) {
            System.out.println("В вагоне осталось только " + (capacity2 - tickets2) + " стоячих мест");
        } else {
            System.out.println("Все билеты проданы, в вагоне нет свободных мест");
        }
        System.out.println();


        // Домашнее задание 3 --------------------------------------------------------------------------

        System.out.println("Задание 3.1");
        // Если от 2 до 6 лет, то ему нужно ходить в детский сад;
        // Если от 7 до 18 лет, то ему нужно ходить в школу;
        // Если больше 18 лет, но меньше 24, то его место в университете;
        // А если больше 24, то ему пора ходить на работу
        int age5 = 23;
        System.out.println("Возраст человека: " + age5 + " лет");
        boolean canGoToGarden = age5 >= 2 && age5 <= 6;
        if (canGoToGarden) {
            System.out.println("Если возраст человека равен " + age5 + " лет, то ему нужно ходить в детский сад");
        } else if (age5 > 6 && age5 <= 18) {
            System.out.println("Если возраст человека равен " + age5 + " лет, то ему нужно ходить в школу");
        } else if (age5 > 18 && age5 < 24) {
            System.out.println("Если возраст человека равен " + age5 + " лет, то ему нужно учиться в университете");
        } else if (age5 >= 24) {
            System.out.println("Если возраст человека равен " + age5 + " лет, то ему нужно ходить на работу");
        }
        System.out.println();


        System.out.println("Задание 3.2");
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        // можно ли ребенку кататься одному или в сопровождении взрослого
        int ageChild = 12;
        boolean accompaniment = false;
        if (ageChild < 5) {
            System.out.println("Ребенку " + ageChild + " лет, поэтому он не может кататься на аттракционе");
        } else if (ageChild < 14 && accompaniment) {
            System.out.println("Ребенку " + ageChild + " лет, и его сопровожает взрослый, поэтому он может кататься на аттракционе в сопровождении взрослого");
        } else if (ageChild < 14) {
            System.out.println("Ребенку " + ageChild + " лет, но его не сопровожает взрослый, поэтому он не может кататься на аттракционе");
        } else {
            System.out.println("Ребенку " + ageChild + " лет, поэтому он может кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();


        System.out.println("Задание 3.3");
        // какое из трех чисел бОльшее и выводит результат в консоль
        int one = 5;
        int two = 10;
        int free = 7;
        if (one > two) {
            if (one >= free) {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + one + " самое большое");
            } else {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + free + " самое большое");
            }
        } else if (two > one) {
            if (two >= free) {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + two + " самое большое");
            } else {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + free + " самое большое");
            }
        } else {
            if (one > free) {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + one + " самое большое");
            } else if (free > one) {
                System.out.println("Из чисел " + one + "; " + two + "; " + free + " число " + free + " самое большое");
            } else {
                System.out.println("Все три числа "  + one + "; " + two + "; "  + free +  " равны");
            }
        }
        System.out.println();
        System.out.println("ДЗ4 выполнено");
    }
}