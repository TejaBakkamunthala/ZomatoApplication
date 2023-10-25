package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Menu;

public interface MenuService {
    List<Menu> getAllMenus();
    Menu getMenuById(int menuId);
    Menu createMenu(Menu menu);
    Menu updateMenu(Menu menu);
    void deleteMenu(int menuId);
}
