package mud
import scala.io.StdIn._

object PirateGame {    
    def main(args: Array[String]): Unit = {

        var running:Boolean = true
        println("Welcome to Gametime\n\n")
        println("What is your name? ")
        val name = readLine()
        val p1 = new Player(name)
        println(p1.name)

        val testItem = new Item("Test Item", "It's mysterious, you don't know what it does o.o")
        val currentLocation = new Room("Test Room", "Actually a room for testing", List[Item](testItem), Array[Int](1, 2, 3, 4, 5, 6), "0")
        

        currentLocation.getItem("Test Item")

        println("Type Quit to quit")
       /* while(running) {
            p1.processCommand(readLine().split(" ").map(_.toString))
        }*/
        
    }
}