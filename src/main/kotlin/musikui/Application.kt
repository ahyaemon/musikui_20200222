package musikui

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("musikui")
                .mainClass(Application.javaClass)
                .start()
    }
}

@Controller("/")
class HelloController {
    @Get("/")
    fun hello() = "hello! !"
}
