# Rescue Animal System
## About the Project
This is a Java-based application designed to manage rescue animals, specifically dogs and monkeys. The system allows users to intake new animals, reserve animals for service, and view lists of available or reserved animals.
## Features
- **Intake a New Dog:** Allows the user to add a new dog to the system.
- **Intake a New Monkey:** Allows the user to add a new monkey to the system.
- **Reserve an Animal:** Reserves a dog or monkey for service in a specific country.
- **View Animals:** Displays lists of all dogs, all monkeys, and available animals (non-reserved).
- **Simple Menu System:** Easy-to-use command-line interface with straightforward options for managing the animals.
## Classes
1. **RescueAnimal:** Base class containing common attributes for both dogs and monkeys, such as name, gender, age, weight, and service status.
2. **Dog:** Subclass of `RescueAnimal` that adds a breed attribute and specific dog-related methods.
3. **Monkey:** Subclass of `RescueAnimal` that includes additional attributes like species, height, body length, and tail length.
4. **Driver:** The main class that provides a menu for the user to interact with the system.
## Setup and Installation
### Requirements
Java (JDK 8 or higher) installed on your machine.
### Steps
1. **Clone the Repository in Git Bash:**  
   `git clone https://github.com/Zacarette/SNHU-IT-145.git`  
2. **Compile the Java files:**  
   `javac RescueAnimal.java Dog.java Monkey.java Driver.java`  
3. **Run the program:**  
   `java Driver`
## Usage
1. **Main Menu:** After starting the application, the user will be presented with the main menu to select options:  
   - Intake a new dog (1)
   - Intake a new monkey (2)
   - Reserve an animal (3)
   - Print a list of all dogs (4)
   - Print a list of all monkeys (5)
   - Print a list of all animals that are not reserved (6)
   - Quit the application (q)
2. **Intake a New Animal:** When adding a new animal (dog or monkey), the user is prompted for the following information:  
   - Name
   - Breed (for dogs) / Species (for monkeys)
   - Gender
   - Age
   - Weight
   - Acquisition Date
   - Acquisition Country
   - Training Status
   - Reservation Status
   - In-Service Country
3. **Reserving an Animal:** When reserving an animal, the user must specify the type of animal (dog or monkey) and the country where the animal will serve.
4. **Viewing Animals:** The system will print the details of the animals in the following categories:  
   - All dogs
   - All monkeys
   - All non-reserved animals
## Author
Michael Zaccaria
