package mud

class Room(val name: String, val dsc: String, private var items: List[Item], private val exits: Array[Int], private val tag: String) {

  
  def description(): Unit = {
    println("Name: " + name)
    println("Description: " + dsc)
    println("Items Nearby: " + items)
    println("Accessible Exits: " + exits)
  }
  def getExit(dir: Int): Option[Room] = {
    ???
  }
  def getItem(itemName: String): Option[Item] = {
    items.find(_.name.toLowerCase == itemName.toLowerCase) match {
        case Some(item) =>
            items = items.filter(_ != item)
            println("U got " + itemName)
            Some(item)
        case None => println("There is nothing there o.o "); None
    }
  }
  

  def dropItem(item: Item): Unit = items ::= item
}


object Room {
    val rooms = readRooms()

    def readRooms(): Array[Room] = {
        val source = scala.io.Source.fromFile("world.txt")
        val lines = source.getLines()
        val r = Array.fill(lines.next.toInt)(readRoom(lines))
        source.close()
        r
    }
    def readRoom(lines: Iterator[String]): Room = ???

}

