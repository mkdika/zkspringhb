package com.mkdika.zkspringhb.service;

import com.mkdika.zkspringhb.entity.Person;
import com.mkdika.zkspringhb.entity.PersonDto;
import java.util.List;

/**
 *
 * @author Maikel
 */
public interface ServiceDao {
    
    public boolean save(Object obj);        

    public boolean delete(Object obj);
    
    public boolean truncateDb();
    
    public Person getPersonById(Integer id);
    
    public List<Person> getPersons();                           
    
    // interface untuk contoh native query via hibernate
    public List<PersonDto> getPersonQueryByGender(Integer gender);
}
