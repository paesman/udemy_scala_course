object Collections {
  val arr = Array(1,2,3)

  val lst = List(7,4,9,'a',true)

  arr(0)

  lst(2)

  arr(0) = 99

  arr

  arr(2) = 22

  arr

  val lst2 = 1 :: lst

  lst

  val arr2 = Array.fill(10)(math.random)

  def littleArray(i:Int):Array[Int] = Array(i,i,i)

  littleArray(1)

  //pass by name
  def littleArray2(i: => Int):Array[Int] = Array(i,i,i)

  littleArray2(util.Random.nextInt(10))

  val arr3 = Array.tabulate(10)(i => i*i)

  Vector(1,2,3)

  collection.mutable.Buffer(1,2,3)

  1 to 10 by 2

  (1).to(10).by(2)

  arr ++ arr2

  2 +: arr2 :+ 2

  val (before, after) = arr2.splitAt(4)

  arr2.patch(2, Array(1,2,3),0)

  val arr4 = Array(1,3,5,7,9)

  arr4.mkString(", ")

  arr4.mkString



}