package com.example.firstspring.service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.stereotype.Service
import com.example.firstspring.service.WebClientConfig


@Service
class JokeService(val webClient: WebClient) {
    fun getJoke():String {
        return webClient.get()
        .uri("https://icanhazdadjoke.com/")
        .header("Accept","text/plain")
        .retrieve()
        .bodyToMono(String::class.java)
        .block() ?: "No joke today"
        Thread.sleep(20)
    }
    fun getNJokes(numJokes:Int):MutableList<String> {
        val mutList:MutableList<String> = mutableListOf()
        for (i in 0..numJokes) {
            mutList.add(this.getJoke())
        }
        return mutList
    }
    
}
