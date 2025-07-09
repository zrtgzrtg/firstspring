package com.example.firstspring


import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import com.example.firstspring.service.JokeService
import org.springframework.boot.context.properties.bind.DefaultValue

@RestController 
class DataController(val jokeService: JokeService){

}