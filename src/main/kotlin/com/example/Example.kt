package com.example

import io.micronaut.core.annotation.Introspected

@Introspected
data class Example(
    val booleanValue: Boolean = true
)
