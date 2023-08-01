package com.example.unscramblecompose.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20
object DataProvider {
    private val _words = listOf(
        "kot", "pies", "drab", "kawa", "samolot", "wino", "gracz", "woda", "dom",
        "karma", "tanie", "bilet", "muzyk", "rybak", "chleb", "motyw",
        "las", "papuga", "talerz", "stacja", "grupa", "butelka", "kurczak",
        "okno", "drzewo", "lampa", "sklep", "kasa", "broda", "papier", "szafa",
        "dzwon", "kotek"
    )

    val words: List<String>
        get() = _words.shuffled().take(MAX_NO_OF_WORDS)

}