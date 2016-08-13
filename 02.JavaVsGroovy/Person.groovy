@groovy.transform.ToString()
 class Person{
  String firstName
  String lastName
  int age

   void printDetails(){
    println "Person Details: $firstName, $lastName, $age"
  }

  static void main(String[] args){
    Person user = new Person (firstName:"Eswar", lastName:"Karumuri")
    println user.printDetails()
    println user
  }

}
