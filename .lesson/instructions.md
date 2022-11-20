# Instructions  

Up until now we've just been using one class, **Main**. The purpose of this class is to be the entry point of the program because it contains the **main()** method. 

With more complex programs, we usually create other classes to work with. These classes have a different purpose than the **Main** class. They can be used to create objects. **Objects** are complex data types that have state and behavior. 

**State** is an object's characteristics. For example, let's say we are working with a Dog object. What kind of state do you think a Dog should have? Here are some ideas:
- furColor
- name
- breed

**Behavior** is what an object can do. Some things a dog object could probably do are:
- bark
- sleep
- chewOnShoe

Classes can be used to define the state and behavior for the objects that are being created from them. In this lab, we'll learn about how to define and create objects.

## Steps
  1. To begin, take a look at the files we have to work with. There is the **Main.java** file that contains the **Main** class, which contains the **main()** method. There is also the **WaterBottle.java** file that contains the **WaterBottle** class.
  <br>
  We want to use the **WaterBottle** class to create WaterBottle objects. Before we create them, we first have to define what state and behavior a WaterBottle object should have.

  2. Go to the **WaterBottle.java** file. It currently just has a class definition. A **class definition** is used to create a class and it is made up of the **class** keyword, the name of the class, and a code block. Keep in mind that the class name has to be spelled *exactly* the same as the name of the file.
```Java
class WaterBottle {


}
```
Let's add some state. Copy and paste this statement into your class's code block:
```Java
public int waterLevel;
```
State is one or more variables that are defined in a class and which are given to any objects created from that class.

What we did by adding that statement was add a characteristic that every WaterBottle object that we create is going to have; every WaterBottle will have a waterLevel. 

  3. Next, we'll add in a constructor. A **constructor** is a special method that is used initialize the state of a newly created object. Copy and paste the following code below the state in your **WaterBottle** class:
```Java
public WaterBottle() {
  waterLevel = 100;
}
```
Notice that the constructor does not have a return type and it has the same name as the class. When we create a WaterBottle object, this constructor will be called and set the object's initial waterLevel to 100. We'll learn more about constructors in later labs.

  4. Next, let's add some behavior. Copy and paste the following code below the constructor in your **WaterBottle** class:
```Java
public void drink(){
  if (waterLevel == 0){
    System.out.println("No more water!");
  }
  else if (waterLevel < 10){
    System.out.println("Enough for a sip");
    waterLevel = 0;
  }
  else{
    System.out.println("Drank a mouthful");
    waterLevel -= 10;
  }
}
```
```Java
public void check(){
  System.out.println("Water level: " + waterLevel);
}
```
What we did was add two methods into the class. These methods are both given to any objects created from the class. If we want to use one of the methods, we have to first have an object created. We then use the object to call the method.

The first method, **drink()**, is called it changes the the current object's waterLevel. Depending on the waterLevel, we get certain output printed out to the console.

The second method, **check()**, prints out the current object's waterLevel to the console.

  5. Now that we have a our **WaterBottle** class defined, we are ready to create WaterBottle objects! Copy and paste the following code into the **Main.java** file's **main()** method:
```Java
WaterBottle bottleOne = new WaterBottle();
```
This statement creates a variable of the type **WaterBottle**, meaning it will only be able to point to WaterBottle objects. Next, we assigned this variable to a new WaterBottle object. To create the object, we used the **new** keyword that is used whenever we try to create any object. Lastly, there is a constructor call. This calls the constructor we defined in our WaterBottle class.

  6. Now that we have an object to use, let's see use some of its methods. Copy and paste the following code into the **Main.java** file's **main()** method below any code that is already there:
```Java
bottleOne.check();
bottleOne.drink();
bottleOne.check();
```
Notice the syntax we used in these three statements. We first referenced the object using the variable's name. We then used **dot notation** to access the object's behavior and called some of its methods. 

We first called **check()** on the object to check its current WaterLevel. We then called the object's **drink()** method to change its waterLevel, and then we called **check()** to see the updated waterLevel. Run the program to see the results of these statements.

  7. Now it's your turn. Create a second WaterBottle object and make sure to assign it to a variable of the corresponding type, like we did in step 5. 
  8. After you've created the object, use dot notation to call the **drink()** method twice and then the **check()** method once.
  
Great job! You successfully defined state and behavior for a class, created an object of that class, and used that object's methods. 

### Test:
Use the test provided. You can use the code at the end of Main.java to test your code.

#### Sample output:
```
Water level: 100
Drank a mouthful
Water level: 90
Drank a mouthful
Drank a mouthful
Water level: 80
```
  
  