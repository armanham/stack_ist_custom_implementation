package com.company;

import java.util.ArrayList;

public class MyStack implements MyList {

    private ArrayList<Object> arrayList = new ArrayList<>();

    @Override
    public boolean empty() {
        return arrayList.isEmpty();
    }

    @Override
    public int search(Object o) {
        int indexOfObject = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == o) {
                indexOfObject = i;
            }
        }
        return indexOfObject;
    }

    @Override
    public Object push(Object item) {
        arrayList.add(item);
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public Object pop() {
        Object top = arrayList.get(arrayList.size() - 1);
        arrayList.remove(top);
        return top;
    }

    @Override
    public Object peek() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arrayList=" + arrayList +
                '}';
    }
}
