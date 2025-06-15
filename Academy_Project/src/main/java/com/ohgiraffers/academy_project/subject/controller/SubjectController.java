package com.ohgiraffers.academy_project.subject.controller;

import com.ohgiraffers.academy_project.subject.model.dto.SubjectDTO;
import com.ohgiraffers.academy_project.subject.model.service.SubjectService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/list")
    public String subjectList(Model model) {
        List<SubjectDTO> subjects = subjectService.findAllSubject();
        model.addAttribute("subjects", subjects);
        return "subject/list";
    }

}
