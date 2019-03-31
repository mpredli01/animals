/**
 * Cow.java
 * @version 1.0.0 3/19/2015
 * @author Michael P. Redlich
 */

package org.redlich.animals;

public class Cow implements Animal {
    /**
     * Implementation of the method declared in the Animal interface.
     *
     * @see Animal
     */
    public String speak() {
		return moo();
		}

    /**
     * Writes out the sound the cow makes.
     */
    public String moo() {
		return "moo";
		}
	}

