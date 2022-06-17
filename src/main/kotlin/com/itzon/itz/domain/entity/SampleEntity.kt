package com.itzon.itz.domain.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.domain.AbstractAggregateRoot
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
@Entity
abstract class SampleEntity  (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SampleEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

abstract class SampleRootEntity<T : AbstractAggregateRoot<T>>(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
) : AbstractAggregateRoot<T>() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SampleEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}





