package hexaDemo.controller;
import hexaDemo.infrastructure.dataJPA.adapters.laptopServiceImpl;
import hexaDemo.model.laptop;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class laptopController {

    @Autowired
    public laptopServiceImpl laptopService;

    @PostMapping("/laptop")
    public laptop addBook(@RequestBody laptop laptop) {
        return laptopService.addLaptop(laptop);
    }


    @PutMapping("/laptop/{id}")
    public laptop updateBook(@PathVariable String lapID, @RequestBody laptop laptop) {
        return laptopService.updateLaptop(lapID, laptop);
    }

    @GetMapping("/laptop/{id}")
    public laptop getBookByID(@PathVariable String id) {
        return laptopService.getLaptopById(id);
    }

    @GetMapping("/laptop")
    public List<laptop> getAllBooks() {

        return laptopService.getLaptops();
    }
    @GetMapping("/")
    public String getAllBooks_msg() {

        return "Hi it is working";}

    @DeleteMapping("/laptop/{id}")
    public void deleteBookByID(@PathVariable String id) {
        laptopService.deleteLaptopById(id);
    }
}
