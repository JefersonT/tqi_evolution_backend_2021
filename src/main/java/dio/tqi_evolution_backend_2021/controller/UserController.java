package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.model.User;
import dio.tqi_evolution_backend_2021.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/cad_user")
    public User postUser(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping("/user_id/{id}")
    public Optional<User> getByIdUser(@PathVariable Integer id){
        return service.findByIdUser(id);
    }

    @GetMapping("/users")
    public List<User> postUsers(){
        return service.findAll();
    }

}
