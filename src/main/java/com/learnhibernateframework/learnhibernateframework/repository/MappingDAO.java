package com.learnhibernateframework.learnhibernateframework.repository;

import com.learnhibernateframework.learnhibernateframework.entity.ManyToMany.PrjEmployee;
import com.learnhibernateframework.learnhibernateframework.entity.ManyToMany.Project;
import org.springframework.stereotype.Component;

@Component
public interface MappingDAO {
    public void saveEmployee(PrjEmployee prjEmployee);

    public void saveProject(Project project);
}
