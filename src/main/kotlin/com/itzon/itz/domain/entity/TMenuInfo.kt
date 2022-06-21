package com.itzon.itz.domain.entity

import javax.persistence.*

@Entity
@Table(name = "t_menu_info")
class TMenuInfo (
    @Id
    @Column(name = "menu_id", length = 20)
    var menuId: String,

    @Column(name = "menu_nm", length = 20)
    var menuNm: String,

    @Column(name = "menu_url", length = 100)
    var menuUrl: String,

    @Column(name = "menu_lv", length = 1)
    var menuLv: Int,

    @Column(name = "menu_parent_id", length = 20)
    var menuParentId: String,

    @Column(name = "menu_parent_url", length = 100)
    var menuParentUrl: String,

    @Column(name = "menu_popup_yn", length = 1)
    var menuPopupYn: String,

    @Column(name = "menu_popup_type", length = 1)
    var menuPopupType: String,
    // W: window
    // M: modal
    // N: none

    @Column(name = "use_yn", length = 1)
    var useYn: String,

    @Column(name = "ord_no", length = 1)
    var ordNo: Int,
)
{
    class Builder{
        private lateinit var menuId : String
        private var menuNm          : String = ""
        private var menuUrl         : String =""
        private var menuLv          : Int = 0
        private var menuParentId    : String? = null
        private var menuParentUrl   : String = ""
        private var menuPopupYn     : String = "N"
        private var menuPopupType   : String = "N"
        private var useYn           : String = "Y"
        private var ordNo           : Int = 0

        fun menuId(menuId : String): Builder {
            this.menuId = menuId
            return this
        }
        fun menuNm(menuNm : String): Builder {
            this.menuNm = menuNm
            return this
        }
        fun menuUrl(menuUrl : String): Builder {
            this.menuUrl = menuUrl
            return this
        }
        fun menuLv(menuLv : Int): Builder {
            this.menuLv = menuLv
            return this
        }
        fun menuParentId(menuParentId : String): Builder {
            this.menuParentId = menuParentId
            return this
        }
        fun menuParentUrl(menuParentUrl : String): Builder {
            this.menuParentUrl = menuParentUrl
            return this
        }
        fun menuPopupYn(menuPopupYn : String): Builder {
            this.menuPopupYn = menuPopupYn
            return this
        }
        fun menuPopupType(menuPopupType : String): Builder {
            this.menuPopupType = menuPopupType
            return this
        }
        fun useYn(useYn : String): Builder {
            this.useYn = useYn
            return this
        }
        fun ordNo(ordNo : Int): Builder {
            this.ordNo = ordNo
            return this
        }
    }
}