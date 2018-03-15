## Introduction to Object-Oriented Programming & Design Principles

### Trenton Computer Festival (TCF)

#### Animals Application


This small example application accompanies the presentation, **Introduction to Object-Oriented Programming & Design Principles**.  It demonstrates the Design Principle, **Program to Interfaces, Not Implementations** that was reviewed in the presentation.

#### Source Code:

From the root of your application directory, the source code can be found in the folder hierarchy:

`src/main/java/org/redlich/animals`

The first part of this hierarchy, `src/main/java`, follows the convention used by [Gradle](http://www.gradle.org/).  The second part of this hierarchy, `org\redlich\animals`, is referenced in the package access defined in the source code as `package org.redlich.animals;` and is user-defined.

#### Building the Application:

This application may be built and executed with [Gradle](http://www.gradle.org/) using the following command:

	$ gradle clean build run
	C:\> gradle clean build run

from the root of your application directory.

Please note that the `build.gradle` file is setup such that you should have no difficulties building the application provided that the source code folder hierarchy show earlier is maintained.  Your own root folder for the application is independent of the build process.

#### Feeback:

Feedback (good, bad, or indifferent) and questions are **always** welcome and can be sent to [mike@redlich.net](mailto:mike@redlich.net).
