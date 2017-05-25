package com.company;

/**
 * Created by marcin on 25.05.2017.
 */
public class MyArrayItem {
    private Object data;
    private MyArrayItem next;

    public MyArrayItem(Object data) {
        this.data = data;
    }

    public void setNext(MyArrayItem next) {
        this.next = next;
    }

    public MyArrayItem getNext() {
        return this.next;
    }

    public Object getData() {
        return this.data;
    }
}
