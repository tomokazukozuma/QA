package com.qaservice.entity

import java.io.Serializable
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GenerationType

/**
 *
 */
@Entity
@Table(name = "question")
data class Question(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,

        @Column(name = "user_id")
        var userId: String = "",

        @Column
        var title: String = "",

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