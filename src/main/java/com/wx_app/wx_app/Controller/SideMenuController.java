package com.wx_app.wx_app.Controller;

import com.wx_app.wx_app.domain.MenuModel;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SideMenuController {
    @GetMapping("/index/getSideMenu")
    public List<MenuModel> getSideMenu(){
        return new ManagedList<>();
    }
}
