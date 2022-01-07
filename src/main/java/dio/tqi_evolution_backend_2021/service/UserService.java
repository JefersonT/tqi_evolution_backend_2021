package dio.tqi_evolution_backend_2021.service;

import dio.tqi_evolution_backend_2021.model.User;
import dio.tqi_evolution_backend_2021.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

//    @Autowired(required = true)
//    private PasswordEncoder encoder;

    public User createUser (User user){
//        String pass = user.getSenha();
//        //Criptografando antes de salvar no banco
//        user.setSenha(encoder.encode(pass));
        return repository.save(user);
    }

    public Optional<User> findByIdUser(Integer id){
        return repository.findById(id);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
