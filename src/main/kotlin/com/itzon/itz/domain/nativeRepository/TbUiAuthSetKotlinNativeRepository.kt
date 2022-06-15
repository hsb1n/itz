package com.itzon.itz.domain.nativeRepository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface TbUiAuthSetKotlinNativeRepository
//    : JpaRepository<TbUiAuthSet, String>
{

    @Query (value = """ SELECT 
                            UI_ELEMENT_PK AS uiElementPk
                            , UI_AUTH AS uiAuth
                            , AUTH_ID AS authId
                            , UI_AUTH_ID AS uiAuthId
                        FROM TB_UI_AUTH_SET 
                            WHERE UI_AUTH LIKE concat('%',:uiAuth,'%') 
                            AND AUTH_ID LIKE concat('%', :authId, '%') """
            , nativeQuery = true)
    fun stor005SearchData(@Param("uiAuth") uiAuth : String, @Param("authId") authId : String) : List<Map<String,Any>>
}