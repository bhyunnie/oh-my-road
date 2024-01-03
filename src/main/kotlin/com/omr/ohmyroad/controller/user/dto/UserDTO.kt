package com.omr.ohmyroad.controller.user.dto

import com.omr.ohmyroad.repository.user.User


class UserDTO (
    val userNo: Int,
    val userId: String,
) {
    companion object {
        fun from(user: User): UserDTO {
            return UserDTO(
                userNo = user.userNo, userId = user.userId
            );
        }
    }
}