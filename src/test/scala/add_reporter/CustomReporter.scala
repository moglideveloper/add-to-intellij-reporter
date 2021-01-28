package add_reporter

import org.scalatest.Reporter
import org.scalatest.events._

trait CustomReporter extends Reporter {
  override def apply(event: Event): Unit = {
    event match {
      case testStarting : TestStarting =>
        println("test starting")
      case testSucceeded : TestSucceeded =>
        println("test succeeded")
      case testFailed : TestFailed =>
        println("test failed")
      case testIgnored : TestIgnored =>
        println("test ignored")
    }
  }
}