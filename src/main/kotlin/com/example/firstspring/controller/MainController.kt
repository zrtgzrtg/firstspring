package com.example.firstspring


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import com.example.firstspring.service.JokeService
import org.springframework.boot.context.properties.bind.DefaultValue

@Controller 
class MainController(val jokeService: JokeService){
    @GetMapping("/")
    fun root(model: Model):String {
        model.addAttribute("name","thymeleaf")
        return "index"
    } 
    @GetMapping("/jokeList") 
    fun jokeList(model: Model,@RequestParam(name = "count",defaultValue = "10")count:Int):String{
        val jokeList = jokeService.getNJokes(count)
        model.addAttribute("list",jokeList)
        return "jokes"
    }


}