fun main() {

    val likes = 501

    val result = if (likes % 10 !== 1) {
        println("Понравилось $likes людям")
    } else if (likes % 100 !== 11) {
        println("Понравилось $likes человеку")
    } else println("Понравилось $likes людям")
}