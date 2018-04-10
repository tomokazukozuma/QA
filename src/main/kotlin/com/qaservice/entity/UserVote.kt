package com.qaservice.entity

import java.io.Serializable
import java.util.*
import javax.persistence.*

/**
 *
 */
@Entity
@Table(name = "user_vote")
data class UserVote(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column(name = "user_id")
        var userId: String = "",

        @Column(name = "question_id")
        var questionId: String = "",

        @Column(name = "answer_id")
        var answerId: String = "",

        @Column(name = "created_at")
        var createdAt: Date = Date(),

        @Column(name = "updated_at")
        var updatedAt: Date = Date()
) : Serializable