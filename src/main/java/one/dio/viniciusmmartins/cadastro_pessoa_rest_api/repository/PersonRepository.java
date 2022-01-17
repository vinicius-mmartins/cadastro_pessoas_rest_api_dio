package one.dio.viniciusmmartins.cadastro_pessoa_rest_api.repository;

import one.dio.viniciusmmartins.cadastro_pessoa_rest_api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
