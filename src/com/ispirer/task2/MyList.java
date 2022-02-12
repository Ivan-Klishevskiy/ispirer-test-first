package com.ispirer.task2;

public class MyList<T> {

    private final int DEFAULT_SIZE = 16;

    private final int CUT_RATE = 4;

    private Object[] list = new Object[DEFAULT_SIZE];

    private int pointer = 0;


    public void add(T item) {
        if (pointer == list.length - 1) {
            resize(list.length * 2);
        }
        list[pointer++] = item;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(list, 0, newArray, 0, pointer);
        list = newArray;
        EventListener.changedEvent("new length: " + newLength);
    }

    public int size() {
        return pointer;
    }

    public T get(int index) {
        return (T) list[index];
    }

    public int indexOf(T object) {
        for (int i = 0; i < size(); i++) {
            if (list[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (pointer - index >= 0) System.arraycopy(list, index + 1, list, index, pointer - index);
        list[pointer] = null;
        pointer--;
        if (list.length > DEFAULT_SIZE && pointer < list.length / CUT_RATE) {
            int newLength =list.length / 2;
            resize(newLength);
        }
    }
}
