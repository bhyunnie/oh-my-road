package com.omr.ohmyroad.repository

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@MappedSuperclass
abstract class CommonEntity {
    @Column(name = "created_at", nullable = false)
    var createdAt: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))

    @Column(name = "updated_at", nullable = false)
    var updatedAt: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))
}