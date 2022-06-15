package com.itzon.itf.web.stor.stor005.dto

import com.itzon.itz.domain.entity.TbKotlinInfo

data class STOR005SaveRequestDto(
        val kotlinId : Long = 0L,
        val kotlinNm : String = "",
        val authId : String = ""
)  {
        fun toEntity() : TbKotlinInfo = TbKotlinInfo.Builder()
                                                .setKotlinId(kotlinId)
                                                .setKotlinNm(kotlinNm)
                                                .setAuthId(authId)
                                                .build()


}


