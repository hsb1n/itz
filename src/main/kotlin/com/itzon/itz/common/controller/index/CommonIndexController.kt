package com.itzon.itz.common.controller.index

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CommonIndexController {

    @GetMapping("/")
    fun getMainFrame(): String {
        return "views/common/main/main"
    }



}