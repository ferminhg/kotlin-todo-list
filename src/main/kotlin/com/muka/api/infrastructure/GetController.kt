package com.muka.api.infrastructure

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class GetController {

    @GetMapping("/get")
    @ResponseBody
    fun execute() = intArrayOf()
}
