package epsi.arosajeback.repository;

import epsi.arosajeback.entities.Conversation;
import epsi.arosajeback.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConversationRepository extends JpaRepository<Conversation, Integer> {

    @Query("SELECT c FROM Conversation c WHERE c.user.idUser = :userId OR c.otherUser.idUser = :userId")
    List<Conversation> findByUserId(Integer userId);

    @Query("SELECT m FROM Message m " +
            "WHERE m.idMessages = ( " +
            "    SELECT MAX(m2.idMessages) FROM Message m2 " +
            "    WHERE m2.conversation.idConversation = :conversationId " +
            ")")
    Message findLastMessageOfConversation(Integer conversationId);
}