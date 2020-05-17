package org.byron4j.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
