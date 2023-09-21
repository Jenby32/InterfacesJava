# Object Transport Program
This is a simple Java program that allows you to create objects of type "Schaf" (sheep) or "Tisch" (table) with various characteristics, including "laenge" (length), "breite" (width), "hoehe" (height), "gewicht" (weight), "stabelbar" (stackable), "zerbrechlich" (fragile), and "beschreibung" (description). Additionally, there is a Transport class with a method called transportMachbar that determines if the transport of a given object is feasible or not.


### Before you begin, ensure you have the following installed:

Java Development Kit (JDK)

Git (optional, for cloning the repository)
## Installation
Clone this repository to your local machine (optional):
```shell
git clone https://github.com/yourusername/object-transport-program.git
```
Compile the Java files:
```shell
javac *.java
```

## Usage
You can use this program to create objects of "Schaf" and "Tisch" with specific characteristics and check if they are transportable using the Transport class.

Creating Schaf or Tisch Objects
To create a "Schaf" or "Tisch" object, follow these steps:

Create a new object with the desired attributes. Here's an example of creating a "Schaf" object:

```shell
Schaf schaf1 = new Schaf(20, 100, 30, 50, false, false, "Ist ein Schaf.");
```
Customize the object's characteristics by providing values for laenge, breite, hoehe, gewicht, stabelbar, zerbrechlich, and beschreibung as arguments to the constructor.

Checking Transport Feasibility
To check if the transport of an object is feasible, use the transportMachbar method of the Transport class. Pass the object you want to transport as an argument to this method. It will return true if the transport is possible or false if it is not.

**Example**
Here's an example of how to use this program in your App class:

```shell
public class App {
    public static void main(String[] args) throws Exception {
        // Create a Schaf object
        Schaf schaf1 = new Schaf(20, 100, 30, 50, false, false, "Ist ein Schaf.");
        
        // Create an object of the Transport class to use the transportMachbar function
        Transport transport1 = new Transport();

        // Check if the transport of the Schaf object is feasible
        boolean isTransportPossible = transport1.transportMachbar(schaf1);
        
        // Print the result
        System.out.println("Is transport possible for schaf1? " + isTransportPossible);
    }
}
```

In this example, we create a "Schaf" object schaf1, create an instance of the Transport class transport1, and then check if the transport of schaf1 is possible. The result will be printed to the console.

**Feel free to customize the characteristics of the objects and test the transport feasibility for different scenarios using this program.**
