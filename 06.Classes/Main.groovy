/*

  1. One class file may contain one or more classes.
  2. A file contains no class called Script.
  3. If we compile the file Main.groovy then Groovy compiler will create two different .class files. i.e. Main.class & NewMain.class
  4. In Groovy, class name & file name doesn't need to be same.

*/
//@groovy.transform.toString()
class Main1{
  static void main(String[] args){
    NewMain main = new NewMain()
    main.firstName = 'Eswar'
    main.setLastName('Karumuri')
    main.printDetails()
    println main
  }
}


class NewMain{
  def firstName
  def lastName
  def age

  public void printDetails(){
    println "FirstName: $firstName, LastName: $lastName, age: $age"
  }
}
