package com.ohgiraffers.academy_project.subject.model.dao;

import com.ohgiraffers.academy_project.subject.model.dto.SubjectDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubjectMapper {

    List<SubjectDTO> findAllSubject();

}
