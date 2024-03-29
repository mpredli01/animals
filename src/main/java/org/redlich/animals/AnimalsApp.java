/**
 * AnimalsApp.java
 * @version 1.0.0 3/19/2015
 * @author Michael P. Redlich
 */

package org.redlich.animals;

public class AnimalsApp {
    /**
     *
     * @param args none
     */
    public static void main(String[] args) {
        AnimalsApp animalsApp = new AnimalsApp();
        animalsApp.displayHeader();

		Animal cat = new Cat();
		System.out.println("The cat says, " + "\"" + cat.speak() + "\"");

		Animal cow = new Cow();
		System.out.println("The cow says, " + "\"" + cow.speak() + "\"");

		}

	/**
	 *
	 */
	void displayHeader() {
		System.out.println();
		System.out.println("*--------------------------------------------------*");
		System.out.println("* Introduction to OOP & Design Principles          *");
		System.out.println("* Animals Demo Application                         *");
		System.out.println("*--------------------------------------------------*");
		System.out.println();
		}
	}


