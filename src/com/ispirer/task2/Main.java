package com.ispirer.task2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        for (int i = 19; i > 0; i--) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < 20; i++) {
            list.remove(i);
        }

    }
}
