/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KWAKYE856.inventoryapp;

/**
 *
 * @author ISAAC KWAKYE 10917856
 */


public class EmptyCollectionException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Sets up this exception with an appropriate message.
     */
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
