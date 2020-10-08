package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.bl.SchoolBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/student")
public class StudentApi {

    private SchoolBl schoolBl;

    @Autowired
    public StudentApi(SchoolBl schoolBl) {
        this.schoolBl = schoolBl;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return schoolBl.createStudent(student);
    }



}
