package org.jamin.`in`.controller

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController {
    @GetMapping("/test")
    suspend fun get(): String {
        delay(1000)
        return "hihi"
    }
}