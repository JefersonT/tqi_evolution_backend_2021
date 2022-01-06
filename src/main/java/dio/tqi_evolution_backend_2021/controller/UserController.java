package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.model.User;
import dio.tqi_evolution_backend_2021.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cad_user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public void postUser(@RequestBody User user){
        service.createUser(user);
    }

    @GetMapping("/user_id")
    public Optional<User> findByIdUser(Integer id){
        return service.findByIdUser(id);
    }

}
