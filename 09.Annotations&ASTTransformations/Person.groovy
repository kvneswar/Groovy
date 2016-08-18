@groovy.transform.ToString()
class Person1{
  def firstName
  def lastName
  def age
}

def person = new Person1()
person.firstName = "Eswar"
person.lastName = "Karumuri"
person.age = 29
println person
