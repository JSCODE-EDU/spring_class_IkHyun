package com.example.test.storage.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Header {

    int resultCode;
    boolean isSuccess;
    String message;

    LocalDateTime dateTime;

    /**
     * 정상인 경우
     * @return
     */
    public static Header OK(){
        return Header.builder()
                .resultCode(200)
                .isSuccess(true)
                .message("성공")
                .dateTime(LocalDateTime.now())
                .build();
    }

    /**
     * 실패한 경우
     * @param message
     * @param resultCode
     * @return
     */
    public static Header error(String message, int resultCode){
        return Header.builder()
                .resultCode(resultCode)
                .isSuccess(false)
                .message(message)
                .dateTime(LocalDateTime.now())
                .build();
    }
}
