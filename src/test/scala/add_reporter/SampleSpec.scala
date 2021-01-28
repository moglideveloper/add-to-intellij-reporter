package add_reporter

import org.scalatest.flatspec.AsyncFlatSpecLike
import org.scalatest.matchers.should.Matchers

class SampleSpec extends AsyncFlatSpecLike with Matchers with CustomReporter {

  "empty test" should "pass" in {
    succeed
  }

  it should "then fail" in {
    fail()
  }
}
