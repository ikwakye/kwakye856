/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KWAKYE856.inventoryapp;

/**
 *
 * @author ISAAC KWAKYE 10917856
 */
public interface StackADT<T> {
    
    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}

