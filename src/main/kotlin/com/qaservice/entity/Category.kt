package com.qaservice.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 *
 */
@Entity
@Table(name = "category")
data class Category(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column
        var name: String = "",

        @Column(name = "created_at")
        var createdAt: Date = Date(),

        @Column(name = "updated_at")
        var updatedAt: Date = Date()
) : Serializable