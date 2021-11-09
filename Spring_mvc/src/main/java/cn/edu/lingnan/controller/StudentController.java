package cn.edu.lingnan.controller;

import cn.edu.lingnan.service.StudentServiceMysqlImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/login")
    public String login(Model model){
        StudentServiceMysqlImpl studentServiceMysql = new StudentServiceMysqlImpl();
        String s = studentServiceMysql.getStudentName();
        model.addAttribute("name",s);
        return "manage";
    }
    @RequestMapping("/selectAllStudent")
    public String selectAllStudent()
    {
        return "allStudents";
    }

}
