# lab04-OOAD
Scenario-Based Programming Task
Welcome to the world of Petronia — a futuristic city where robotic companions live side-by-side with humans. In Petronia, each human owns one or more intelligent robotic pets that assist them in daily tasks, provide companionship, and even participate in competitions.

These robotic pets come in different types: RoboDogs, RoboCats, and RoboBirds.

Each robotic pet shares common features such as a name, model number, battery level, and a method to recharge the battery.

However, they also have their own unique behaviors. For instance, RoboDogs can guard, RoboCats can climb, and RoboBirds can fly.

Your objective is to create an efficient object-oriented system using classes, inheritance, and proper access to attributes to ensure encapsulation and code reuse.

Your task:
Create a base class RoboPet with the following:
Private attributes: name, model_number, and battery_level
Public methods to set and get these attributes
A public method recharge() that resets the battery level to 100%
Create three subclasses RoboDog, RoboCat, and RoboBird that inherit from RoboPet and include one unique method for each (e.g., guard(), climb(), fly())
Write a main program that:
Creates objects of each subclass
Displays their information
Demonstrates their unique abilities
Uses the recharge() method to show battery management in java
