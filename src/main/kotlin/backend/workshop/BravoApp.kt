package backend.workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BravoApp

fun main(args: Array<String>) {
    runApplication<BravoApp>(*args)
}
