package org.vaadin.spring.tutorial;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringBootTest
public class TutorialApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(environment);
        Assert.assertNotNull(environment.getActiveProfiles());
    }
}