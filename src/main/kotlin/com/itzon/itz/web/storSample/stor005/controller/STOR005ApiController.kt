package com.itzon.itf.web.stor.stor005.controller


import com.itzon.itf.web.stor.stor005.dto.STOR005SaveRequestDto
import com.itzon.itf.web.stor.stor005.service.STOR005Service
import com.itzon.itz.domain.entity.TbKotlinInfo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class STOR005ApiController (private val stor005service: STOR005Service) {


//    @GetMapping("/api/stor005/findAll")
//    fun findAll() : List<TbUiAuthSet> = stor005service.stor005FindAll()

    @GetMapping("/api/stor005/findAllKot")
    fun findAllKot() : List<TbKotlinInfo> = stor005service.stor005FindAllKot()

    @PostMapping("/api/stor005/searchData")
    fun searchData(@RequestBody map : Map<String,Any> ) :  List<Map<String,Any>> {
        return stor005service.searchData(map)
    }

    @PostMapping("/api/stor005/save")
    fun save(@RequestBody stor005SaveRequestDto : List<STOR005SaveRequestDto> ) : String {
        return stor005service.save(stor005SaveRequestDto)
    }

    @PostMapping("/api/stor005/delete")
    fun delete(@RequestBody stor005SaveRequestDto: List<STOR005SaveRequestDto>) = stor005service.delete(stor005SaveRequestDto)
}