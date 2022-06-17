package com.itzon.itz.web.system.indexController

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SystemIndexController {

    @GetMapping("/system/menu/manage")
    fun getSystemMenuManagePage(): String = "views/system/menu/systemMenuManage"


}