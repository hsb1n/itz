package com.itzon.itf.web.stor.stor005.service

import com.itzon.itf.web.stor.stor005.dto.STOR005SaveRequestDto
import com.itzon.itz.domain.entity.TbKotlinInfo
import com.itzon.itz.domain.nativeRepository.TbUiAuthSetKotlinNativeRepository
import com.itzon.itz.domain.repository.TbKotlinInfoRepository
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.sql.DriverManager.println

@Service
class STOR005Service(
//                          private val tbUiAuthSetKotlinRepository: TbUiAuthSetKotlinRepository,
    private val tbUiAuthSetKotlinNativeRepository: TbUiAuthSetKotlinNativeRepository,
    private val tbKotlinInfoRepository: TbKotlinInfoRepository
) {


//    fun stor005FindAll() : List<TbUiAuthSet> = tbUiAuthSetKotlinRepository.findAll()

    fun stor005FindAllKot() : List<TbKotlinInfo> = tbKotlinInfoRepository.findAll()

    fun searchData(map : Map<String,Any>) :  List<Map<String,Any>> {
        println("....map : ${map}" )
        val uiAuth = map["uiAuth"] as String
        val authId = map["authId"] as String
        println (" : ${uiAuth} : ${authId}")
        return tbUiAuthSetKotlinNativeRepository.stor005SearchData(uiAuth,authId)
    }

//    @Transactional
    fun save(stor005SaveRequestDto : List<STOR005SaveRequestDto>) : String {
        var result : String = ""

        for (data in stor005SaveRequestDto) {
            val count : Int = tbKotlinInfoRepository.countByKotlinId(data.kotlinId)
            println("....kotlinId : ${data.kotlinId}")

            if(count > 0) {
                val tbKotlinInfo :TbKotlinInfo = tbKotlinInfoRepository.findByKotlinId(data.kotlinId)
                tbKotlinInfo.update(data)
                println("...........update")
            } else {
                tbKotlinInfoRepository.save(data.toEntity())

                println(".........save")
            }
            result = "save"
        }

        return result
    }

    fun delete(stor005SaveRequestDto: List<STOR005SaveRequestDto>) {

        for (data in stor005SaveRequestDto) {
            tbKotlinInfoRepository.delete(data.toEntity())
            println(".........delete")
        }

    }
}