package mud

class Player(val name: String) {

    private var health = 100
    private val inventory = new Array[Item](10)
    private var location = 0 

    def processCommand(action:String, argument:String): Unit = {
        println("Action = " + action)
        println("Argument = " + argument)
        /*action.toLowerCase match {
            case "drop" => getFromInventory(argument)
            case "look" => ???
            case "take" => addToInventory(argument)
            case "inventory" => inventoryListing()
            case "move" => move(argument)
            case "" => println
            case _ => println("Arglarglarf")

        }*/
    }

    def getFromInventory(itemName: String):Option[Item] = {
        ???
    } 

    def addToInventory(tempItem: Item):Unit = {
        inventory +: Array(tempItem)
    }
    
    def inventoryListing(): String = {
        ???
    }

    def move(dir: String): Unit = {
        ???
    }
}