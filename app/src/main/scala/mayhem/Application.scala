import org.lwjgl.LWJGLException
import org.lwjgl.opengl.{DisplayMode, Display}

object Application {
  def main(args: Array[String]) {
    println("Uber-Mayhem Welcomes You")

    try {
      Display.setDisplayMode(new DisplayMode(600, 600))
      Display.create()
    } catch {
      case e: LWJGLException =>
      {
        e.printStackTrace()
        sys.exit(0)
      }
    }

    while (!Display.isCloseRequested) {
      Display.update()
    }
    Display.destroy()
  }
}