package com.omr.ohmyroad.repository.user

import com.omr.ohmyroad.repository.CommonEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.BitSet

@Entity
@Table(name = "users", schema = "public")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_no")
    val userNo: Int,

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "user_name")
    val userName: String,

    @Column(name = "display_name")
    val displayName: String,

    @Column(name = "global_name")
    val globalName: String,

    @Column(name = "is_deleted")
    val isDeleted: Boolean,

    @Column(name = "created_at")
    val createdAt: String,

    @Column(name = "updatedAt")
    val updatedAt: String
)