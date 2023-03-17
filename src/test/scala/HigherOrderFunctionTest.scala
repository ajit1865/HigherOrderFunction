import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class HigherOrderFunctionTest extends AnyFlatSpec {

  val testobj = new HigherOrderFunction()

  //test cases for add
  "add1" should "return the sum of two numbers" in {
    testobj.add(1, 3) shouldEqual (4)
  }
  "add2" should "return the sum of two numbers" in {
    testobj.add(4, 4) shouldEqual (8)
  }
  "add3" should "return the sum of two numbers" in {
    testobj.add(9, 3) shouldEqual (12)
  }

  //test cases for sum of list
  "sumoflist First" should "return the sum of List" in {
    testobj.sumOfList(List(1, 2, 3, 4)) shouldEqual (10)
  }
  "sumoflist Second" should "return the sum of List" in {
    testobj.sumOfList(List(7, 3, 4)) shouldEqual (14)
  }
  "sumoflist Third" should "return the sum of List" in {
    testobj.sumOfList(List(4, 5)) shouldEqual (9)
  }
}
