package com.itzon.itz.domain.repository

import com.itzon.itz.domain.entity.TbKotlinInfo
import org.springframework.data.jpa.repository.JpaRepository

interface TbKotlinInfoRepository : JpaRepository<TbKotlinInfo,Long> {

    fun countByKotlinId(kotlinId : Long) : Int

    fun findByKotlinId(kotlinId: Long) : TbKotlinInfo
}