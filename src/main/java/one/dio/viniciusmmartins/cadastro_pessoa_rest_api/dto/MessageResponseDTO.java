package one.dio.viniciusmmartins.cadastro_pessoa_rest_api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {
    private String message;
}
