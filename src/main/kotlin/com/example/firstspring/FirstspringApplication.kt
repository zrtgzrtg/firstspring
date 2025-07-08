package com.example.firstspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstspringApplication

fun main(args: Array<String>) {
	runApplication<FirstspringApplication>(*args)
}
