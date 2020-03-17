package book.exercises.E13_bagsqueuesandstacks;

import book.exercises.E13_bagsqueuesandstacks.helper.FixedCapacityStackOfStrings;

/**
 * Exercise 1.3.1:
 * Add a method isFull() to FixedCapacityStackOfStrings
 */
public class E131_IsFullFixedCapacityStackOfStrings {

    FixedCapacityStackOfStrings fixedCapacityStackOfStrings;

    public E131_IsFullFixedCapacityStackOfStrings(int cap){
        fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(cap);
    }

    public boolean isEmpty(){
        return fixedCapacityStackOfStrings.isEmpty();
    }

    public int size(){
        return fixedCapacityStackOfStrings.size();
    }

    public void push(String item){
        fixedCapacityStackOfStrings.push(item);
    }

    public String pop(){
        return fixedCapacityStackOfStrings.pop();
    }

    public boolean isFull(){
        return fixedCapacityStackOfStrings.isFull();
    }


}
