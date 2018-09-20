package top.airprogram.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.airprogram.user.entity.student;
import top.airprogram.user.service.StuService;

@Controller
@RequestMapping("user")    //请求路径一旦带有user就将请求分发到UserController
public class UserController
{

//Controller调用service，service调用dao
// Controller是控制器，就是调用参数并执行业务（本处程序是插入学生数据）


    @Autowired
    private StuService stuService;

    @RequestMapping("/text")
    public String testUser(@RequestBody student student)
    {
        stuService.createStu(student);
        return "user";
    }


    @RequestMapping("/demo")
    public String UserDemo()

    {
        return "demo";
    }

}
