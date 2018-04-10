package com.qaservice.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 *
 */
@Entity
@Table(name = "user_category")
data class UserCategory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column(name = "user_id")
        var userId: String = "",

        @Column(name = "category_id")
        var categoryId: String = "",

        @Column(name = "created_at")
        var createdAt: Date = Date(),

        @Column(name = "updated_at")
        var updatedAt: Date = Date()
) : Serializable