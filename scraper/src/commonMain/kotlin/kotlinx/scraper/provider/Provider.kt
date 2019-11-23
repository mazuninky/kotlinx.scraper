package kotlinx.scraper.provider

import kotlinx.scraper.Source

abstract class Provider<S : Source> {
    abstract suspend fun fetch(source: S): String
}
