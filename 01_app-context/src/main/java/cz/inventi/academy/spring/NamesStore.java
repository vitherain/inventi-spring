package cz.inventi.academy.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NamesStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(NamesStore.class);

    private static final List<String> NAMES = Arrays.asList("Karel", "Jarda", "Honza", "Marek", "Pepa", "Martin");

    private String name;

    @PostConstruct
    public void init() {
        final String name = NAMES.get(ThreadLocalRandom.current().nextInt(6));
        this.name = name;
        LOGGER.info("Name to be used will be {}", name);
    }

    public String getName() {
        return name;
    }
}
