package com.example.RestRepositoryLevel3.Conctroller;

import com.example.RestRepositoryLevel3.Entity.Student;
import com.example.RestRepositoryLevel3.ExceptionStudent.ErrorPage;
import com.example.RestRepositoryLevel3.ExceptionStudent.RecordNotFound;
import com.example.RestRepositoryLevel3.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private ServiceImpl serviceImpl;

@Autowired
    public StudentController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

   @GetMapping("/show/{rollno}")
    public Student findData(@PathVariable Integer rollno){
    return serviceImpl.findRecord(rollno);
   }
   @GetMapping("/finddata")
   public List<Student> findAllData(){
    return serviceImpl.findAll();
   }

@PostMapping ("/saveStudent")
public String saveData(@RequestBody Student student){
  serviceImpl.save(student);
  return "save data";
}
@DeleteMapping("/delete/{rollno}")
public String deleteData(@PathVariable Integer rollno){
  serviceImpl.deleteData(rollno);
  return "delete rollno data";
}

    @GetMapping("/update")
    public String updateStudent(@RequestParam ("rollno")int rn, Model model){
        Student student=serviceImpl.updateData(rn);
        model.addAttribute("student",student);
        return "updated data";
    }


@ExceptionHandler
    public ResponseEntity<ErrorPage> handleStudent(RecordNotFound ex)
{
    ErrorPage errorPage=new ErrorPage();
    errorPage.setStatus_code(HttpStatus.NOT_FOUND.value());
    errorPage.setMessage("record not found");
    errorPage.setTime(System.currentTimeMillis());
   return new ResponseEntity<> (errorPage,HttpStatus.NOT_FOUND);
}




}
