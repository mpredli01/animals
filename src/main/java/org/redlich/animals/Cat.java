/**
 * Cat.java
 * @version 1.0.0 3/19/2015
 * @author Michael P. Redlich
 */

package org.redlich.animals;

public class Cat implements Animal {
    /**
     * Implementation of the method declared in the Animal interface.
     *
     * @see Animal
     */
    public String speak() {
		return meow();
		}

    /**
     * @return the sound the cat makes.
     */
    public String meow() {
		return "meow";
		}
	}

