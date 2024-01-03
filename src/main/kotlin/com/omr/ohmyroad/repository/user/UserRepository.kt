package com.omr.ohmyroad.repository.user

import org.springdoc.core.converters.models.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserRepository: PagingAndSortingRepository<User,Int> {
    fun findUsersByUserId(userId:String): Optional<User>

    fun countBy(): Int
}