package epsi.arosajeback.service;

import epsi.arosajeback.entities.User;
import epsi.arosajeback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Integer id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));

        user.setPseudo(userDetails.getPseudo());
        user.setNom(userDetails.getNom());
        user.setPrenom(userDetails.getPrenom());
        user.setBotaniste(userDetails.isBotaniste());

        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));
        userRepository.delete(user);
    }
}

