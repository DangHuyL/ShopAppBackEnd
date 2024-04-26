package com.project.shopapp.resoponses.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateOrderResponse {
    @JsonProperty("message")
    private String message;
}
