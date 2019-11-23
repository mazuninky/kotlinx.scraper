package kotlinx.scraper

sealed class Source

data class WebPage(val url: String) : Source()
