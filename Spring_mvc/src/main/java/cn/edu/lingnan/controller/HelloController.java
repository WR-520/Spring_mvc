package cn.edu.lingnan.controller;

import cn.edu.lingnan.service.StudentServiceMysqlImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) throws Exception {
////      创建ModelAndView 模型和视图
//        ModelAndView mv = new ModelAndView();
////      通过addObject方法在ModelAndView中封装对象
//        mv.addObject("name","Hello Spring MVC");
////      通过setViewName方法在ModelAndView中封装要跳转的视图名称
//        mv.setViewName("hello");
////        这个mv对象将返回给DispatcherServlet
        StudentServiceMysqlImpl studentServiceMysql = new StudentServiceMysqlImpl();
        String s = studentServiceMysql.getStudentName();
        model.addAttribute("name",s);
         return "hello";
    }
}
