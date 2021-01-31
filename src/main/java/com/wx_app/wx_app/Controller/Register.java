package com.wx_app.wx_app.Controller;

import com.wx_app.wx_app.domain.ReturnMassage;
import com.wx_app.wx_app.domain.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@RestController
public class Register {
    @GetMapping("/register")
    public ReturnMassage ApplyRegister(String name,String password){
        UserModel user = new UserModel();
        ReturnMassage msg = new ReturnMassage();
        user.setName(name);
        user.setPassword(password);
        int result = 0;
        Connection conn = null;
        try {
            // 获取数据库事务连接
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wx_app_auto_menu","root","123456");
            conn.setAutoCommit(false);

        } catch (Exception e) {
            try{
                // 回滚事务
                conn.rollback();
                result = -500;
            }catch (SQLException ex){
                ex.printStackTrace();
                result = -255;
            }
        }
        return msg;
    }
    public void getName(){

    }
}
