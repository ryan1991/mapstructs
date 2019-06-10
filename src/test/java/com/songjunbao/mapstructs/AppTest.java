package com.songjunbao.mapstructs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.songjunbao.mapstructs.converter.PersonConverter;
import org.junit.Test;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        Person person = new Person(1L,"zhige","zhige.me@gmail.com",new Date(),new User(1));
        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);
        System.out.println("personDTO:" + personDTO);
        assertEquals(personDTO.getName(), person.getName());




        assertTrue( true );
    }
}
