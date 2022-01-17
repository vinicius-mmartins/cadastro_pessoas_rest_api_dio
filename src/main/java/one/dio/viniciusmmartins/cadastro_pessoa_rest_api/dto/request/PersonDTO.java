package one.dio.viniciusmmartins.cadastro_pessoa_rest_api.dto.request;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String CPF;
    private String birthDate;

    private List<PhoneDTO> phones;
}
