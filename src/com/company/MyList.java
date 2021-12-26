package com.company;

public interface MyList<E> {
    boolean empty();

    int search(Object o);

    E push(E item);

    E pop();

    E peek();
}
