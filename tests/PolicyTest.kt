fun main() {
    val signalcase_1 = Signal(80, 75, 15, 13, 6)
    check(Policy.score(signalcase_1) == 108)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(80, 76, 12, 21, 7)
    check(Policy.score(signalcase_2) == 69)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(86, 85, 9, 7, 10)
    check(Policy.score(signalcase_3) == 212)
    check(Policy.classify(signalcase_3) == "accept")
}
