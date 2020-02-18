package drlewis

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.scene.canvas.GraphicsContext
import scalafx.scene.paint.Color
import scalafx.animation.AnimationTimer
import scalafx.Includes._
import scalafx.scene.input.KeyEvent
import scalafx.scene.input.KeyCode

object DrLewis extends JFXApp {
    val grid = new Grid
    val canvas = new Canvas(800, 800)
    val gc = canvas.graphicsContext2D
    val renderer = new Renderer(gc)

    stage = new JFXApp.PrimaryStage {
        title = "Dr. Lewis"
        scene = new Scene(800,  800){
            
            content = canvas
            onKeyPressed = (ke: KeyEvent) => ???
            
            var lastTime = -1L
            val timer = AnimationTimer(time => {
                if(lastTime >= 0) {
                    val delay = (time - lastTime) / 1e9
                    grid.update(delay)
                    renderer.render(grid)
                }
                lastTime = time
            })
            timer.start()
        }
    }

}