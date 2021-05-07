package com.example

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class ExampleJacksonIntrospectedTest {

    @Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    fun defaultValueShouldBeTrue() {
        val request = HttpRequest.POST("/example", "{}").header("Content-Type", "application/json")
        val response = client.toBlocking().retrieve(request, Boolean::class.java)
        Assertions.assertTrue(response)
    }
}
