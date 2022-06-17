package com.itzon.itz.domain.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.MappedSuperclass


@Entity
class BaseEntity (
    @CreatedDate
    @Column(nullable = false)
    val createDateTime: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    @Column(nullable = false)
    var modifiedDateTime: LocalDateTime = LocalDateTime.now(),

    @CreatedBy
    @Column(nullable = false)
    val createId: String,

    @LastModifiedBy
    @Column(nullable = false)
    val modifedId: String
): SampleEntity()

