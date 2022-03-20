public class Person {
    //Instance variables
    String firstName;
    String lastName;
    int age;
    //getFirstName with return value
    public String getFirstName(){
        return firstName;
    }
    //getLastName with return value
    public String getLastName(){
        return lastName;
    }
    //getAge with return value
    public int getAge(){
        return age;
    }
    //set the value of firstname
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //set the value of lastname
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //set the value of age
    public void setAge(int age){
        this.age = age;
        if(age<=0 || age >=100){
            this.age = 0;
        }
    }
    //person age is teen or not between 12 to 20
    public boolean isTeen(){
        int a = this.age;
        boolean r;
        if(a>12 && a<20){
            r = true;
        } else {
            r = false;
        }
        return r;
    }
    //fullname is empty or not
    public String getFullname(){
        String fullName;
        String ret;
        if(firstName.isEmpty() == true && lastName.isEmpty() == true){
            ret = "";
        } else {
            ret = firstName.concat(lastName);;
        }
        return ret;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("result of Empty String");
        person.setFirstName("");    //set the value of firstname
        person.setLastName("");    //set the value of firstname
        System.out.println("getfirstname = " +person.getFirstName());   //get first name
        System.out.println("getlastname = " +person.getLastName()); //get last name
        System.out.println("result of fullname with empty string");
        System.out.println("fullName = " + person.getFullname());     //get full name
        System.out.println("result of age not is teen between 12 to 20");
        person.setAge(10);                     //Set the age
        //person.setAge(101);
        System.out.println("teen = "+ person.isTeen());      //person is teen or not
        System.out.println("age = " + person.getAge());      //get the age
        person.setAge(18);                                   //set age
        System.out.println("result of age is teen between 12 to 20");       //person is teen or not
        System.out.println("teen = "+ person.isTeen());       //person is teen or not
        System.out.println("age = " + person.getAge());       //get the age
        person.setFirstName("john");                         //get first name
        System.out.println("result of lastname is empty"); //get full name
        System.out.println("fullName = " + person.getFullname()); //get full name
        person.setLastName("smith");                               //get last name
        System.out.println("result of both firstname and lastname is ");  //get full name
        System.out.println("fullName = " + person.getFullname());  //get full name





    }





}
