package kotlinx.scraper.provider

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.scraper.WebPage

class WebProvider : Provider<WebPage>() {
    override suspend fun fetch(source: WebPage): String {
        val client = HttpClient()

        val page = client.get<String>(source.url)

        client.close()

        return page
    }
}
