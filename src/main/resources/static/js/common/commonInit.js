var commonInit = {
    init() {
        btnMainHeaderMenu.onclick = function () {
            divMenu.style.display = 'block';
        };
        common.loadPage("/system/menu/manage");


    }
}

commonInit.init();