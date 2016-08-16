println 'Hello Word !!!'

/*
  1. Scripts doesn't need the class declaration.
  2. Groovy compiler will compile and put the body of the script into a class file and into run method. 

  Look at the AST browser in Groovy Console.
*/

/*

  public class script1471200128426 extends groovy.lang.Script {

      public script1471200128426() {
      }

      public script1471200128426(groovy.lang.Binding context) {
          super(context)
      }

      public static void main(java.lang.String[] args) {
          org.codehaus.groovy.runtime.InvokerHelper.runScript(script1471200128426, args)
      }

      public java.lang.Object run() {
          this.println('Hello Word !!!')
      }

  }

*/
