public class wineAge {

    public int age;
    String brand;
    int price;


    public int getAge() {
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    @Override
    public String toString() {
        return "wineAge{" +
                "age=" + age +
                '}';
    }

    public wineAge(String winebrand, int wineprice, int wineage){
        brand = winebrand;
        age = wineage;
        price = wineprice;

    }
}/*(d) Question 1The OOP concept of absraction is only showing the essential attributes and will hide information that is not needed for the user.
It helps to reduce the complexity for programming.
An object of an abstract cannot be created by using a new key word.
It can only be instantiated by using a concrete subclass or defining the abstract method.
A class can be instantiated by directly using a new keyword*/

/*(e) Encapsulation is the wrapping of data into a single unit e.g. it puts code together.
Data abstraction simplifies a body of data by reducing it.
Polymorphism will let an object take on other forms for example when a parent class is refered to a child class object.
Inheritance in Java is creating new class one already existing ones so that you can reuse methods.
 */
