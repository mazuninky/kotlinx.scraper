package kotlinx.scrapper

sealed class Source

data class WebPage(val url: String) : Source()
