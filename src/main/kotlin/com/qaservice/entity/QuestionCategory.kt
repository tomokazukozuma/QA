package com.qaservice.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 *
 */
@Entity
@Table(name = "question_category")
data class QuestionCategory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column(name = "question_id")
        var questionId: String = "",

        @Column(name = "category_id")
        var categoryId: String = "",

        @Column(name = "created_at")
        var createdAt: Date = Date(),

        @Column(name = "updated_at")
        var updatedAt: Date = Date()
) : Serializable