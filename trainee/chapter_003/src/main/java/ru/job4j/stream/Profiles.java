package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return rsl;
    }

}
