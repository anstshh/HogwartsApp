package com.example.hogwartsapp.service;

import com.example.hogwartsapp.model.Faculty;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(long id, Faculty faculty);

    void deleteFaculty(long id);
}
