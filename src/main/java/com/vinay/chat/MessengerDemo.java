package com.vinay.chat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MessengerDemo {

    public static void main(String[] args) {
        var textMessage = TextMessage.newBuilder().setTextContent("Hello! how are you.").build();
        var imageMessage = ImageMessage.newBuilder().setImageUrl("https://myimage.png").build();
        sendMessage(ChatMessage.newBuilder()
                .setId("1")
                .setType(MessageType.TEXT_MESSAGE)
                .setText(textMessage)
                .setDeliveryTime(LocalDateTime.now().toString())
                .build());
    }


    public static void sendMessage(ChatMessage message) {

        switch (message.getType()) {
            case TEXT_MESSAGE -> System.out.println(message);
            case IMAGE_MESSAGE -> System.out.println("This is image: " + message);
            default -> System.out.println("unknown message type");
        }


    }
}
