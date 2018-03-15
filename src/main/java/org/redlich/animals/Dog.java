/**
 * Dog.java
 * @version 1.0.0 3/19/2015
 * @author Michael P. Redlich
 */

package org.redlich.animals;

public class Dog implements Animal {
    /**
     * Implementation of the method declared in the Animal interface.
     *
     * @see Animal
     */
    public String speak() {
		return bark();
		}

    /**
     * Writes out the sound the dog makes.
     */
    public String bark() {
		return "woof";
		}
	}

