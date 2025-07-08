package com.example.firstspring


import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import com.example.firstspring.service.JokeService
import org.springframework.boot.context.properties.bind.DefaultValue

@RestController 
class MainController(val jokeService: JokeService){
    @GetMapping("/")
    fun root():String {
        return "Hello,Spring!"
    } 
    @GetMapping("/jokeList") 
    fun jokeList(@RequestParam(name = "count",defaultValue = "10")count:Int):MutableList<String>{
        return jokeService.getNJokes(count)
    }

}