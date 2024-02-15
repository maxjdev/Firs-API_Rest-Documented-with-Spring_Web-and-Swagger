package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getLogin() == null) throw new BusinessException("LOGIN");
        if (user.getPassword() == null) throw new BusinessException("PASSWORD");
        if(user.getId() == null)
            System.out.println("***SAVE -> RECEIVING USER IN THE REPOSITORY LAYER | RECEBENDO USUARIO NA CAMADA DE REPOSITÓRIO***");
        else
            System.out.println("***UPDATE -> RECEIVING USER IN THE REPOSITORY LAYER | RECEBENDO USUARIO NA CAMADA DE REPOSITÓRIO***");
        System.out.println(user);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - RECEIVING ID: %d TO DELETE A USER | RECEBENDO O ID: %d PARA EXCLUIR UM USUARIO", id, id));
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST - LISTING SYSTEM USERS | LISTANDO OS USUARIOS DO SISTEMA");
        List<User> users = new ArrayList<>();
        users.add(new User("1UserName1", "1MyP@55w0rD!1"));
        users.add(new User("2UserName2", "2MyP@55w0rD!2"));
        return users;
    }
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - RECEIVING ID: %d TO FIND A USER | RECEBENDO O ID: %d PARA LOCALIZAR UM USUARIO", id, id));
        return new User("1UserName1", "1MyP@55w0rD!1");
    }
    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - RECEIVING USER: %s TO FIND A USER | RECEBENDO O USUARIO: %s PARA LOCALIZAR UM USUARIO", username, username));
        return new User("1UserName1", "1MyP@55w0rD!1");
    }
}
