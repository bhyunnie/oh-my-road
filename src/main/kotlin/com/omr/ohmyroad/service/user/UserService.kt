package com.omr.ohmyroad.service.user

import com.omr.ohmyroad.controller.user.dto.UserDTO
import com.omr.ohmyroad.repository.user.UserRepository
import org.springdoc.core.converters.models.Pageable
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {
    fun findAllUsers(pageable: Pageable): List<UserDTO> {
        val userList = userRepository.findAll(PageRequest.of(
            pageable.page,
            pageable.size,
            Sort.by("userNo").descending()
        )).toList().map{
            UserDTO.from(it)
        }
        return userList
    }

    fun userCount(): Int {
        val userCount = userRepository.countBy()
        return userCount
    }
}