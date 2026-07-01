/*task is to create a Ecapsulation class in Java that demonstrates encapsulation.
This class should have two private attributes: name( String ) and age( int ) whose default values should be name as "Geeks" and age as 10.
The class should provide public getter and setter methods to access and modify these private attributes.
Note: In custom test cases Person() should be written first and in setName('name') function write the name is single quotes.*/

class Encapsulation {

    private String name = "Guddu";
    private int age = 20;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setName("Zainu");
        obj.setAge(19);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}