package com.mung

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MungApplication

fun main(args: Array<String>) {
    runApplication<MungApplication>(*args)
}
