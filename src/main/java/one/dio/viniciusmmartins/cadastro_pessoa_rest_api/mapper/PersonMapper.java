package one.dio.viniciusmmartins.cadastro_pessoa_rest_api.mapper;

import one.dio.viniciusmmartins.cadastro_pessoa_rest_api.dto.request.PersonDTO;
import one.dio.viniciusmmartins.cadastro_pessoa_rest_api.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-YYYY")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
