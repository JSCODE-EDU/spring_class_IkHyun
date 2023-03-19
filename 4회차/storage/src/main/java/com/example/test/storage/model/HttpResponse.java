package com.example.test.storage.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HttpResponse {

    Header header;
    Object body;
}
