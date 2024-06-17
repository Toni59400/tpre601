package epsi.arosajeback.controller;

import epsi.arosajeback.entities.Conversation;
import epsi.arosajeback.entities.Message;
import epsi.arosajeback.entities.User;
import epsi.arosajeback.repository.ConversationRepository;
import epsi.arosajeback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ConversationRepository conversationRepository;

    @GetMapping("/user/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/user/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User userDetails) {
        try {
            User updatedUser = userService.updateUser(id, userDetails);
            return ResponseEntity.ok(updatedUser);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        try {
            userService.deleteUser(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/user/{idUser}/conversations")
    public Object getLastConvOfUser(@PathVariable Integer idUser){
        List<Conversation> listConvOfUser = conversationRepository.findByUserId(idUser);
        List<Message> lastMessages = new ArrayList<>();
        for (Conversation conversation : listConvOfUser) {
            Message lastMessage = conversationRepository.findLastMessageOfConversation(conversation.getIdConversation());
            if (lastMessage != null) {
                lastMessages.add(lastMessage);
            }
        }
        return lastMessages;
    }
}
