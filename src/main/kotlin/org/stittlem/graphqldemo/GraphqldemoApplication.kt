package org.stittlem.graphqldemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@SpringBootApplication
class GraphqldemoApplication

fun main(args: Array<String>) {
	runApplication<GraphqldemoApplication>(*args)
}

@Controller
class GraphqlController {
	private val users = listOf(User("mike", "stittleburg", "mstittleburg@gmail.com"))

	@QueryMapping
	fun users() = users;
}

data class User(val firstName : String, val lastName: String, val email: String)