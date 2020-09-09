package com.xiangxue.jack.controller;

import com.xiangxue.jack.pojo.ConsultConfigArea;
import com.xiangxue.jack.service.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/queryUser")
    public String queryUser(@RequestParam(required = false) String language, HttpSession session) {
        session.setAttribute("language",language);
        return "ok";
    }

    @RequestMapping("/exceptionTest")
    public @ResponseBody String exceptionTest(String param) {
        param.equalsIgnoreCase("xx");
        return "Ok";
    }

    @RequestMapping("/queryArea")
    public @ResponseBody List<ConsultConfigArea> queryArea(@RequestParam(required = false) String areaCode) {
        Map map = new HashMap<>();
        map.put("areaCode",areaCode);
        return areaService.queryAreaFromDB(new HashMap());
    }
}
