package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.model.User;
import dio.tqi_evolution_backend_2021.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    //Cadastro de usuário
    @PostMapping("/user_criar_admin")
    public User postUserAdmin(@RequestBody User user){
        List<String> roles = new ArrayList<>();
        roles.add("MANAGERS");
        user.setRoles(roles);
        return service.createUser(user);
    }

    @PostMapping("/user_criar_cliente")
    public User postUserCliente(@RequestBody User user){
        List<String> roles = new ArrayList<>();
        roles.add("USERS");
        user.setRoles(roles);
        return service.createUser(user);
    }

    //Listar usuário com id
    @GetMapping("/user_list_id/{id}")
    public Optional<User> getByIdUser(@PathVariable Integer id){
        return service.findByIdUser(id);
    }

    //listar todos usuários
    @GetMapping("/user_list")
    public List<User> getUsers(){
        return service.findAll();
    }

    //listar usuários pelo email
    @GetMapping("/user_list_email/{email}")
    public User postUsers(@PathVariable String email){
        return service.findByLogin(email);
    }

}
