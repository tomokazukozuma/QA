package com.qaservice.repository

import com.qaservice.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Int> {

    /**
     * teamIdで取得
     *
     * @param idList IDリスト
     * @return ユーザーリスト
     */
    fun findByIdIn(idList: List<Int>): List<User>

    /**
     * idリストで削除
     *
     * @param idList IDリスト
     */
    fun deleteByIdIn(idList: List<Int>)
}