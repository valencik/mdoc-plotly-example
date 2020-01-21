package mdocplotly

object Hello extends Greeting with App {
  // scalastyle:off
  println(greeting)
  // scalastyle:on
}

trait Greeting {
  lazy val greeting: String = "hello"
}
