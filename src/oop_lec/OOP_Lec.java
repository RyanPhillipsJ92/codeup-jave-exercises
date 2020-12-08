package oop_lec;

public class OOP_Lec {

        public static void main(String[] args) {

            // == slide 3 (classes and objects)
//
//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.firstName);
//            System.out.println(rick.lastName);
//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);



            // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



            // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello('?'));

            // -- Dog Method Example --

            Dog d1 = new Dog();
            d1.age = 3;
            d1.breed = "corgi";
            d1.canBreed = false;
            d1.name = "Tater";
//
            d1.callForDog("Tater");


            // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

            // -- DogHelper Example --
            Dog dog = new Dog();
            dog.name = "Sparky";
            dog.age = 3;
            dog.callForDog("Sparky");

            System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);

            System.out.println(DogHelper.humanToDogYears(dog.age));
            // ======================== slide 7 (class vs. object fields)

//            oop_lec.Person theBestDrummerAlive = new oop_lec.Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            oop_lec.Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(oop_lec.Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



            // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


            // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


            // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


       }

    }

