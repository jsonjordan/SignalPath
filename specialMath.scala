import scala.annotation.tailrec

def countSteps(n: BigInt): BigInt = {
  	if (n == 0) 0
	else if (n==1) 1
	else {
		@tailrec
		def countStepsAux(n: BigInt, step: BigInt, n1: BigInt, n2: BigInt, n3: BigInt): BigInt = {
			if (n == step) {
			return n1
			}
			var next : BigInt= step + 1
			countStepsAux(n, next, next + n1 + n2, n1, n2)
		}
		return countStepsAux(n, 0, 0, 0, 0)
	}
}

println(countSteps(args(0).toInt))
