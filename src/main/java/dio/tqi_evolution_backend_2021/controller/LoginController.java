package dio.tqi_evolution_backend_2021.controller;

import dio.tqi_evolution_backend_2021.dto.Login;
import dio.tqi_evolution_backend_2021.dto.Sessao;
import dio.tqi_evolution_backend_2021.model.User;
import dio.tqi_evolution_backend_2021.repository.UserRepository;
import dio.tqi_evolution_backend_2021.security.JWTCreator;
import dio.tqi_evolution_backend_2021.security.JWTObject;
import dio.tqi_evolution_backend_2021.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@RestController
public class LoginController {
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private UserRepository repository;

    @PostMapping("/login")
    public Sessao logar(@RequestBody Login login){
        User user = repository.findByEmail(login.getEmail());
        if(user!=null) {
            boolean passwordOk =  encoder.matches(login.getSenha(), user.getSenha());
            if (!passwordOk) {
                throw new RuntimeException("Senha inválida para o login: " + login.getSenha());
            }
            //Estamos enviando um objeto Sessão para retornar mais informações do usuário
            Sessao sessao = new Sessao();
            sessao.setEmail(user.getEmail());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration((new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION)));
            jwtObject.setRoles(user.getRoles());
            sessao.setToken(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
            return sessao;
        }else {
            throw new RuntimeException("Erro ao tentar fazer login");
        }
    }
}