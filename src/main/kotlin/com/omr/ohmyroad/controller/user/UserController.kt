package com.omr.ohmyroad.controller.user

import com.omr.ohmyroad.controller.user.dto.UserApiRequest
import com.omr.ohmyroad.controller.user.dto.UserApiResponse
import com.omr.ohmyroad.controller.user.dto.UserDTO
import com.omr.ohmyroad.service.user.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.apache.coyote.Response
import org.springdoc.core.converters.models.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(originPatterns = ["*", "http://localhost:3000"])
class UserController(private val userService: UserService) {

    @Operation(
        summary = "유저 목록 요청",
        description = "유저 목록을 조회한다",
        responses = [ApiResponse(
            responseCode = "200",
            description = "전체 유저 목록 조회에 대한 응답",
            useReturnTypeSchema = true,
        )]
    )
    @GetMapping("/api/user/list")
    fun getUserList (userApiRequest: UserApiRequest, pageable: Pageable): ResponseEntity<UserApiResponse> {
        val userDTOs: List<UserDTO> = userService.findAllUsers(pageable = pageable)
        return ResponseEntity.ok(
            UserApiResponse(
                userId = userApiRequest.userId,
                userList = userDTOs,
                count = userDTOs.size
            )
        )
    }

    @GetMapping("/api/user/count")
    fun getUserCount (userApiRequest: UserApiRequest) : ResponseEntity<UserApiResponse> {
        val userCount: Int = userService.userCount();
        return ResponseEntity.ok(
            UserApiResponse(
                userId = userApiRequest.userId,
                userList = emptyList(),
                count = userCount
            )
        )
    }
}