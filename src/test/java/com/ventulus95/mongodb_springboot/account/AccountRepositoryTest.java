package com.ventulus95.mongodb_springboot.account;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;


@DataMongoTest
public class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    public void 이메일찾기(){
        Account temp = new Account();
        temp.setEmail("ssss@sss.com");
        temp.setId("12");
        temp.setUsername("창섭");

        accountRepository.save(temp);

        Optional<Account> id = accountRepository.findById(temp.getId());
        Assertions.assertThat(id).isNotEmpty();

        Optional<Account> email = accountRepository.findByEmail(temp.getEmail());
        Assertions.assertThat(email).isNotEmpty();
    }
}
