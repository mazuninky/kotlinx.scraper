package kotlinx.scraper.provider

import kotlinx.scraper.Source
import kotlinx.scraper.WebPage

abstract class Provider<S : Source> {
    abstract suspend fun fetch(source: S): String
}
