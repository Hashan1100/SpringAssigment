package com.student.app.controller;

import com.example.services.domain.Student;
import com.student.app.delegate.StudentDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Controller
public class StudentController
{
    @Autowired
    private StudentDelegate studentDelegate;

    @RequestMapping(value="/student",method=RequestMethod.GET)
    public String displayLogin(Model model)
    {
        model.addAttribute("student", new Student());
        return "Student";
    }

    @RequestMapping(value="/student", method=RequestMethod.POST)
    public String executeLogin(@Validated Student student,
                               BindingResult bindingResult,
                               Model model)
    {
        try
        {
            if (bindingResult.hasErrors()) {
                return "Student";
            }

            if(!studentDelegate.getUserService().isValidStudent(student.getId())){
                return "include";
            }

            studentDelegate.getUserService().insertStudentData(student);

            model.addAttribute("student", student);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "welcome";
    }

    @RequestMapping(value="/student_all",method=RequestMethod.GET)
    public String getStudentList(Model model)
    {
        ArrayList<Student> studentList = studentDelegate.getUserService().getAllStudents();
        model.addAttribute("studentlist", studentList);
        return "StudentAll";
    }

    @ModelAttribute("genderList")
    public Map<String, String> getGenderList()
    {
        Map<String, String> genderList = new HashMap<String, String>();
        genderList.put("Male", "Male");
        genderList.put("Female", "Female");
        return genderList;
    }
}
