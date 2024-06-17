package epsi.arosajeback.controller;


import epsi.arosajeback.dtos.PostForumDTO;
import epsi.arosajeback.entities.Message;
import epsi.arosajeback.entities.PostForum;
import epsi.arosajeback.entities.Tag;
import epsi.arosajeback.repository.MessageRepository;
import epsi.arosajeback.repository.PostForumRepository;
import epsi.arosajeback.repository.PostTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class GeneralController {

    @Autowired
    PostForumRepository postForumRepository;

    @Autowired
    PostTagRepository postTagRepository;

    @Autowired
    MessageRepository messageRepository;

    @GetMapping("/post/allPosts")
    public List<PostForumDTO> getAllPostForum(){
        List<PostForum> postForumList =  postForumRepository.findAll();
        List<PostForumDTO> postForumDTOList = new ArrayList<>();
        for (PostForum postForum : postForumList) {
            List<Tag> tags = postTagRepository.findTagsByPostForumId(postForum.getIdPostForum());
            PostForumDTO postForumDTO = new PostForumDTO(postForum, tags);
            postForumDTOList.add(postForumDTO);
        }
        return postForumDTOList;
    }


    @GetMapping("/conversation/{convId}/messages")
    public List<Message> getAllMessageConversation( @PathVariable  Integer convId){
        return messageRepository.findAllByConversationIdConversation(convId);
    }
}
