package ru.vsu.cs.OOP2023.andreev_n_r;

public class CycleLinkedList<T> extends DoubleLinkedList<T>{
    @Override
    protected Node<T> getNode(int i) {
        int i_ = (Math.abs(i) % size + size) % size;
        return super.getNode(i_);
    }
}
