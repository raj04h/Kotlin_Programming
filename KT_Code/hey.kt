fun countLikeDislike(A: String, P: String): Int {
    var count = 0
    for (i in A.indices) {
        if (A[i] == P[i]) {
            count++
        }
    }
    return count
}

fun main() {
    val A = readLine() ?: ""
    val P = readLine() ?: ""
    
    val result = countLikeDislike(A, P)
    println(result)
}
