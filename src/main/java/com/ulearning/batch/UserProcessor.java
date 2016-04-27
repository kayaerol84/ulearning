package com.ulearning.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.ulearning.model.User;
 
public class UserProcessor implements ItemProcessor<User, User> {

    private static final Logger log = LoggerFactory.getLogger(UserProcessor.class);

    @Override
    public User process(final User user) throws Exception {
        final String firstName = user.getName().toUpperCase();
        final String lastName = user.getSurname().toUpperCase();

        final User transformedPerson = new User();

        log.info("Converting (" + user + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}