
//Võetud actorite ja moviede näitest

public class StudentController {
    @GetMapping("/students")
    public List<Student> findAll(){
        return service.mockStudents();
    }

    @GetMapping("/students/{id}")
    Student oneStudent(@PathVariable int id) {
        return service.mockOneStudent(id);
    }

    @PostMapping("/students")
    Student newStudent(@RequestBody Student newStudent){
        return null;
    }

    @PutMapping("/students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable int id) {
        return null;
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable int id) {
    }
}