package ru.geekbrains.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        Competitor[]competitors = {
                new Cat(),
                new Human(),
                new Robot(),
        };
        for (int i = 0; i < competitors.length; i++) {
            competitors[i].run(300);
            competitors[i].jump(2);
        }
        Wall[]walls = {
                new Cat(),
                new Human(),
                new Robot(),
        };
        System.out.println();
        for (int j = 0; j < walls.length; j++) {
            walls[j].hop(2);
        }
        System.out.println();
        Treadmill[]treadmills = {
                new Cat(),
                new Human(),
                new Robot(),
        };
        for (int j = 0; j < treadmills.length; j++) {
            treadmills[j]. escape(700);
        }
    }

}
