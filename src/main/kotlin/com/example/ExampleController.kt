package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller
class ExampleController {
    @Post("/example")
    fun example(example: Example): Boolean {
        return example.booleanValue
    }
}
