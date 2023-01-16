class Animal{
  String name;
  int age;
  String species;

  //method
  void walk(){
    System.out.println("The animal is walking fine");
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Animal animal1 = new Animal();
    animal1.name ="Dog";
    animal1.age = 17;
    animal1.species ="German sheperd";

    Animal animal2 = new Animal();
    animal2.name = "Sheep";
    animal2.age = 12;
    animal2.species ="New England";
    animal2.walk();

     System.out.println(animal1.name);
     System.out.println(animal1.age);
     System.out.println(animal2.name);
     System.out.println(animal2.species);
    
  }
}