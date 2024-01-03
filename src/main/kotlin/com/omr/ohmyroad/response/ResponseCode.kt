package com.omr.ohmyroad.response

import org.springframework.http.HttpStatus

enum class ResponseCode(val code: Int, val httpStatus: HttpStatus) {
    OK(HttpStatus.OK.value(), HttpStatus.OK),
    NOT_FOUND(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND)
}