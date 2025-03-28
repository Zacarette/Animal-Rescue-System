import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
   // Instance variables (if needed)
   private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

   public static void main(String[] args) {
      initializeDogList();
      initializeMonkeyList();

      // Controls the menu
      boolean acceptingInput = true;
      Scanner input = new Scanner(System.in);

      do {
         displayMenu();
         String option = input.nextLine().trim().toLowerCase();

         switch(option) {
            case "1":
               // Input a new dog
               intakeNewDog(input);
               break;

            case "2":
               // Input a new monkey
               intakeNewMonkey(input);
               break;

            case "3":
               // Reserve an animal
               reserveAnimal(input);
               break;

            case "4":
               // Print all of the dogs
               printAnimals("dog");
               break;

            case "5":
               // Print all of the monkies
               printAnimals("monkey");
               break;

            case "6":
               // Print all non-reserved animals
               printAnimals("available");
               break;

            case "q":
               // Quit
               acceptingInput = false;
               break;

            default:
               System.out.println("Invalid option, please input a valid option");
               break;
         }
      } while(acceptingInput);

      System.out.println("Goodbye");
   }

   // This method prints the menu options
   public static void displayMenu() {
      System.out.println("\n\n");
      System.out.println("\t\t\t\tRescue Animal System Menu");
      System.out.println("[1] Intake a new dog");
      System.out.println("[2] Intake a new monkey");
      System.out.println("[3] Reserve an animal");
      System.out.println("[4] Print a list of all dogs");
      System.out.println("[5] Print a list of all monkeys");
      System.out.println("[6] Print a list of all animals that are not reserved");
      System.out.println("[q] Quit application");
      System.out.println();
      System.out.println("Enter a menu selection");
   }

   // Adds dogs to a list for testing
   public static void initializeDogList() {
      Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
      Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
      Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

      dogList.add(dog1);
      dogList.add(dog2);
      dogList.add(dog3);
   }

   // Adds monkeys to a list for testing (optional)
   // Create method for optional testing list
   public static void initializeMonkeyList() {
   }

   // Adds a new dog to dogList
   public static void intakeNewDog(Scanner scanner) {
      System.out.println("What is the dog's name?");
      String name = scanner.nextLine().trim();

      // Check if the dog is a duplicate
      for(Dog dog : dogList)
         if(dog.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis dog is already in our system\n\n");
            return;
         }

      // Gather info about the new dog
      System.out.println("What is " + name + "'s breed?");
      String breed = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s gender? (\"male\", \"female\")");
      String gender = scanner.nextLine().trim().toLowerCase();

      System.out.println("What is " + name + "'s age?");
      String age = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s weight? (in pounds)");
      String weight = scanner.nextLine().trim();

      System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
      String acquisitionDate = scanner.nextLine().trim();

      System.out.println("Where was " + name + "'s acquired? (Country)");
      String acquisitionCountry = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s training status? (\"intake\", \"in service\", \"phase I/II/III/IV/V\", \"farm\")");
      String trainingStatus = scanner.nextLine().trim();

      System.out.println("Is " + name + " reserved? (Y/N)");
      boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

      System.out.println("What is " + name + "'s service country?");
      String inServiceCountry = scanner.nextLine().trim();

      Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

      dogList.add(newDog);
   }

   // Adds a new monkey to `monkeyList`
   public static void intakeNewMonkey(Scanner scanner) {
      System.out.println("What is the monkey's name?");
      String name = scanner.nextLine().trim();

      for(Monkey monkey : monkeyList)
         if(monkey.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis monkey is already in our system\n\n");
            return;
         }

      // Add the code to instantiate a new monkey and add it to the appropriate list
      boolean invalidSpecies = true;

      // Validate the monkey's species
      String species;
      do {
         System.out.println("What is " + name + "'s species?");
         species = scanner.nextLine().trim();

         for(String validSpecies : Monkey.VALID_SPECIES)
            if(species.equalsIgnoreCase(validSpecies))
               invalidSpecies = false;

         if(invalidSpecies)
            System.out.println("Invalid species option");
      } while(invalidSpecies);

      // Gather info about the new monkey
      System.out.println("What is " + name + "'s gender? (\"male\", \"female\")");
      String gender = scanner.nextLine().trim().toLowerCase();

      System.out.println("What is " + name + "'s age?");
      String age = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s weight? (in pounds)");
      String weight = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s height? (head to toe; in inches)");
      String height = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s body length? (head to pelvis; in inches)");
      String bodyLength = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s tail length? (base to tip; in inches)");
      String tailLength = scanner.nextLine().trim();

      System.out.println("When was " + name + "'s acquired? (MM-DD-YYYY)");
      String acquisitionDate = scanner.nextLine().trim();

      System.out.println("Where was " + name + "'s acquired? (Country)");
      String acquisitionCountry = scanner.nextLine().trim();

      System.out.println("What is " + name + "'s training status? (\"intake\", \"in service\", \"phase I/II/III/IV/V\", \"farm\")");
      String trainingStatus = scanner.nextLine().trim();

      System.out.println("Is " + name + " reserved? (Y/N)");
      boolean reserved = scanner.nextLine().trim().equalsIgnoreCase("Y");

      System.out.println("What is " + name + "'s service country?");
      String inServiceCountry = scanner.nextLine().trim();

      Monkey newMonkey = new Monkey(name, species, gender, age, weight, height, bodyLength, tailLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

      monkeyList.add(newMonkey);
   }

   // Reserves an animal
   public static void reserveAnimal(Scanner scanner) {
      System.out.println("What type of animal will be needed? (\"dog\", \"monkey\")");
      String animalType = scanner.nextLine().trim();

      System.out.println("Where will the animal be serving? (Country)");
      String animalServiceCountry = scanner.nextLine().trim();

      // Go through all dogs
      // Reserves the first non-reserved, in-service dog in the country
      if(animalType.equalsIgnoreCase("dog"))
         for(Dog dog : dogList)
            if(true
               && dog.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
               && !dog.getReserved()
            ) {
               dog.setReserved(true);
               dog.setInServiceCountry(animalServiceCountry);

               System.out.println(dog.getName() + " has been reserved");
               return;
            }

      // Go through all monkies
      // Reserves the first non-reserved, in-service monkey in the country
      if(animalType.equalsIgnoreCase("monkey"))
         for(Monkey monkey : monkeyList)
            if(true
               && monkey.getInServiceLocation().equalsIgnoreCase(animalServiceCountry)
               && !monkey.getReserved()
            ) {
               monkey.setReserved(true);
               monkey.setInServiceCountry(animalServiceCountry);

               System.out.println(monkey.getName() + " has been reserved");
               return;
            }

      System.out.println("Unable to reserve a " + animalType + " from " + animalServiceCountry + " at this time");
   }

   // Prints a list of animals depending on the outputType
   public static void printAnimals(String outputType) {
      // Print the animal's name, status, acquisition country and reserve status
      System.out.printf("%-8.15s\t| %-1.15s\t| %-1.15s\t| %s%n%n", "Name", "Status", "Acq. Country", "Reserved");

      switch(outputType) {
         case "dog":
            for(Dog dog : dogList) {
               String name = dog.getName();
               String status = dog.getTrainingStatus();
               String acquisitionCountry = dog.getAcquisitionLocation();
               boolean reserved = dog.getReserved();

               System.out.printf("%-8.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
            }
            break;

         case "monkey":
            for(Monkey monkey : monkeyList) {
               String name = monkey.getName();
               String status = monkey.getTrainingStatus();
               String acquisitionCountry = monkey.getAcquisitionLocation();
               boolean reserved = monkey.getReserved();

               System.out.printf("%-8.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
            }
            break;

         case "available":
            // Prints all non-reserved dogs
            for(Dog dog : dogList) {
               String name = dog.getName();
               String status = dog.getTrainingStatus();
               String acquisitionCountry = dog.getAcquisitionLocation();
               boolean reserved = dog.getReserved();

               boolean available = !reserved && status.equalsIgnoreCase("in service");
               if(!available)
                  continue;

               System.out.printf("%-8.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
            }

            // Prints all non-reserved monkies
            for(Monkey monkey : monkeyList) {
               String name = monkey.getName();
               String status = monkey.getTrainingStatus();
               String acquisitionCountry = monkey.getAcquisitionLocation();
               boolean reserved = monkey.getReserved();

               boolean available = !reserved && status.equalsIgnoreCase("in service");
               if(!available)
                  continue;

               System.out.printf("%-8.15s\t| %-1.15s\t| %-1.15s\t| %s%n", name, status, acquisitionCountry, reserved);
            }
            break;

      }
   }
}
