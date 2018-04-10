package com.qaservice.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 *
 */
@Entity
@Table(name = "answer")
data class Answer(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column(name = "user_id")
        var userId: String = "",

        @Column(name = "question_id")
        var questionId: String = "",

        @Column
        var content: String = "",

        @Column(name = "up_vote")
        var upVote: String = "",

        @Column(name = "down_vote")
        var downVote: String = "",

        @Column(name = "created_at")
        var createdAt: Date = Date(),

        @Column(name = "updated_at")
        var updatedAt: Date = Date()
) : Serializable