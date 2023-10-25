package com.zomato.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.Menu;
import com.zomato.app.service.MenuService;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{menuId}")
    public Menu getMenuById(@PathVariable int menuId) {
        return menuService.getMenuById(menuId);
    }

    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{menuId}")
    public Menu updateMenu(@PathVariable int menuId, @RequestBody Menu menu) {
        menu.setMenuId(menuId);
        return menuService.updateMenu(menu);
    }

    @DeleteMapping("/{menuId}")
    public void deleteMenu(@PathVariable int menuId) {
        menuService.deleteMenu(menuId);
    }
}
