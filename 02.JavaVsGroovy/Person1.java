public class Person1{
  private String firstName;
  private String lastName;
  private int age;

  public Person1(){

  }

  public Person1(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String toString(){
    return "Person Details: " + this.firstName + ", " + this.lastName + ", " + this.age;
  }

  public void printDetails(){
    System.out.println("Person Details: " + this.firstName + ", " + this.lastName + ", " + this.age);
  }

}
