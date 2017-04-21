val a = 5
val b = 6

def double(a:Int, b:Int):Int = a*b

double(a,b)

val output = (a,b) match {
  case (1,2) => "one"
  case (2,3) => "two"
  case (3,4) => "three"
  case (5,6) => "match!"
  case (_,6) => "halb match"
  case (_,_) => "any match"
}


