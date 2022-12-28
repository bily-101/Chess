import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame

class DrawRectangleInJFrame : JFrame("Draw A Rectangle In JFrame") {
    init {

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(400, 400)

        isVisible = true
    }

    override fun paint(g: Graphics) {
        super.paint(g)

        g.drawRect(50, 50, 300, 100)

        g.color = Color.RED

        g.fillRect(50, 50, 300, 100)
    }


}

fun main() {
    DrawRectangleInJFrame()
}