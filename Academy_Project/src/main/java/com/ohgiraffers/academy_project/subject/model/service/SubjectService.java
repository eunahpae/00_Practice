package com.ohgiraffers.academy_project.subject.model.service;

import com.ohgiraffers.academy_project.subject.model.dao.SubjectMapper;
import com.ohgiraffers.academy_project.subject.model.dto.SubjectDTO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    private final SubjectMapper subjectMapper;

    public SubjectService(SubjectMapper subjectMapper) {
        this.subjectMapper = subjectMapper;
    }

    public List<SubjectDTO> findAllSubject() {
        return subjectMapper.findAllSubject();
    }
}
