package com.omr.ohmyroad.controller.study

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudyController () {
    @GetMapping("/api/study/current")
    fun list () {

    }
}