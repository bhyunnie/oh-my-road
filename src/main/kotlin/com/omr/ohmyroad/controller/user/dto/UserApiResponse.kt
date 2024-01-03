package com.omr.ohmyroad.controller.user.dto



class UserApiResponse (
    val userId: String,
    val userList: List<UserDTO>,
    val count: Int
)