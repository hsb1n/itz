package com.itzon.itz.domain.entity


import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity

@Entity
class TbUser (
    @Embedded
    var information: UserInfo,

    @AttributeOverride(name = "value", column = Column(name = "password", nullable = false))
    var password: String,
    id: Long = 0L
    ): SampleRootEntity<TbUser>(id) {
        val name: String
            get() = information.name

        val email: String
            get() = information.email

        val phoneNumber: String
            get() = information.phoneNumber

    constructor(
        name: String,
        email: String,
        phoneNumber: String,
        password: String,
        id: Long = 0L
    ) : this (
        UserInfo(name, email, phoneNumber), password, id
        )
    }