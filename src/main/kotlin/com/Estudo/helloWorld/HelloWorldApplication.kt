package com.Estudo.helloWorld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class HelloWorldApplication

fun main(args: Array<String>) {
	runApplication<HelloWorldApplication>(*args)
}

// verificar anotações  no build.gradle.kts Duvidas
// verificar se não tem uma forma mais simples de fazer o deploy
// Problemas para iniciar a jvm utilizado H2 para verificação e Build

@RestController
class MessageResource {
	@GetMapping
	fun Hello(): (String) {
		return "Hello Caina!!!!!"
	}
}
