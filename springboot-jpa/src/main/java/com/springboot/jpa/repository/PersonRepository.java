package com.springboot.jpa.repository;

import com.springboot.jpa.dto.PersonDTO;
import com.springboot.jpa.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    @Query("select p from Person p where p.personId in ?1")
    public List<Person> getPersonsByIds(List<Long> personIds);

    @Query("select p.name, length(p.name) from Person p where length(p.name)=(select min(length(p.name)) from Person p)")
    public List<Object[]> getShorterName();

    @Query("select p from Person p where p.personId=(select max(p.personId) from Person p)")
    public Optional<Person> getLastRegistration();

    @Query("select min(p.personId), max(p.personId), sum(p.personId), avg(length(p.name)), count(p.personId) from Person p")
    public Object getResumeAggregationFunction();

    @Query("select min(length(p.name)) from Person p")
    public Integer getMinLengthName();

    @Query("select max(length(p.name)) from Person p")
    public Integer getMaxLengthName();

    @Query("select p.name, length(p.name) from Person p")
    public List<Object[]> getPersonNameLength();

    @Query("select count(p) from Person p")
    Long getTotalPerson();

    @Query("select min(p.personId) from Person p")
    Long getMinId();

    @Query("select max(p.personId) from Person p")
    Long getMaxId();

    List<Person> findAllByOrderByNameAscLastNameDesc();

    @Query("select p from Person p order by p.name, p.lastName desc")
    List<Person> getAllOrdered();

    List<Person> findByPersonIdBetweenOrderByNameAsc(Long personId1, Long personId2);

    List<Person> findByNameBetweenOrderByNameDescLastNameDesc(String name1, String name2);

    @Query("select p from Person p where p.personId between ?1 and ?2 order by p.name desc")
    List<Person> findAllBetweenId(Long personId1, Long personId2);

    @Query("select p from Person p where p.name between ?1 and ?2 order by p.name asc, p.lastName desc")
    List<Person> findAllBetweenName(String c1, String c2);

    @Query("select p.personId, upper(p.name), lower(p.lastName), upper(p.programmingLanguage) from Person p")
    List<Object[]> findAllPersonDataListCase();

    @Query("select upper(p.name || ' ' || p.lastName) from Person p")
    List<String> findAllFullNameConcatUpper();

    @Query("select lower(concat(p.name, ' ', p.lastName)) from Person p")
    List<String> findAllFullNameConcatLower();

    // @Query("select CONCAT(p.name, ' ', p.lastName) from Person p")
    @Query("select p.name || ' ' || p.lastName from Person p")
    List<String> findAllFullNameConcat();

    @Query("select count(distinct(p.programmingLanguage)) from Person p")
    Long findAllProgrammingLanguageDistinctCount();

    @Query("select distinct(p.programmingLanguage) from Person p")
    List<String> findAllProgrammingLanguageDistinct();

    @Query("select p.name from Person p")
    List<String> findAllNames();

    @Query("select distinct(p.name) from Person p")
    List<String> findAllNamesDistinct();

    @Query("select new com.springboot.jpa.dto.PersonDTO(p.name, p.lastName) from Person p")
    List<PersonDTO> findAllPersonDto();

    @Query("select new Person(p.name, p.lastName) from Person p")
    List<Person> findAllObjectPersonPersonalized();

    @Query("select p.name from Person p where p.personId=?1")
    String getNameById(Long personId);

    @Query("select p.personId from Person p where p.personId=?1")
    Long getIdById(Long personId);

    @Query("select CONCAT(p.name, ' ', p.lastName) as fullname from Person p where p.personId=?1")
    String getFullNameById(Long personId);

    @Query("select p from Person p where p.personId=?1")
    Optional<Person> findOne(Long personId);

    @Query("select p from Person p where p.name=?1")
    Optional<Person> findOneName(String name);

    @Query("select p from Person p where p.name like %?1%")
    Optional<Person> findOneLikeName(String name);

    Optional<Person> findByNameContaining(String name);

    List<Person> findByProgrammingLanguage(String programmingLanguage);

    @Query("select p from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Person> buscarByProgrammingLanguage(String programmingLanguage, String name);

    List<Person> findByProgrammingLanguageAndName(String programmingLanguage, String name);

    @Query("select p, p.programmingLanguage from Person p")
    List<Object[]> findAllMixPerson();

    @Query("select p.personId, p.name, p.lastName, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonDataList();

    @Query("select p.personId, p.name, p.lastName, p.programmingLanguage from Person p where p.personId=?1")
    Optional<Object> obtenerPersonDataById(Long personId);

    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonData();

    @Query("select p.name, p.programmingLanguage from Person p where p.name=?1")
    List<Object[]> obtenerPersonData(String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Object[]> obtenerPersonData(String programmingLanguage, String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1")
    List<Object[]> obtenerPersonDataByProgrammingLanguage(String programmingLanguage);
}
