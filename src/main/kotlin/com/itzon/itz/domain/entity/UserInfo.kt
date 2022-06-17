package com.itzon.itz.domain.entity

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class UserInfo (
        @Column(nullable = false, length = 30)
        val name: String,

        @Column(unique = true, nullable = false)
        val email: String,

        @Column(nullable = false, length = 13)
        val phoneNumber: String,
){
        fun same(name: String):Boolean {
                return this.name == name
        }
}
