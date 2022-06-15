package com.itzon.itz.domain.entity

import com.itzon.itf.web.stor.stor005.dto.STOR005SaveRequestDto
import javax.persistence.*

@Entity
@Table(name = "TB_KOTLIN_INFO")
class TbKotlinInfo  (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("KOTLIN_ID", length = 20)
    var kotlinId : Long,

    @Column("KOTLIN_NAME", length = 50)
    var kotlinNm : String? = null,

    @Column("AUTH_ID", length = 20, nullable = false)
    var authId : String

 )
//    : BaseEntity()
{
    class Builder {
        private var kotlinId : Long = 0L
        private var kotlinNm : String = ""
        private var authId : String = ""

        fun setKotlinId( kotlinId: Long ) : Builder {
            this.kotlinId = kotlinId
            return this
        }

        fun setKotlinNm( kotlinNm: String ) : Builder {
            this.kotlinNm = kotlinNm
            return this
        }

        fun setAuthId( authId: String ) : Builder {
            this.authId = authId
            return this
        }

        fun build() = TbKotlinInfo(kotlinId,kotlinNm,authId)
    }

     fun update(stor005SaveReqeustDto : STOR005SaveRequestDto) {
         this.kotlinId = stor005SaveReqeustDto.kotlinId
         this.kotlinNm = stor005SaveReqeustDto.kotlinNm
         this.authId = stor005SaveReqeustDto.authId
     }
 }



