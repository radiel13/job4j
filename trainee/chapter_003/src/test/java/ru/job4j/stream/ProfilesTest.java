package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectProfiles() {
        Address address1 = new Address("Moscow", "street", 10, 1);
        Address address2 = new Address("Moscow", "street", 10, 2);
        Address address3 = new Address("Moscow", "street1", 11, 3);
        Profile p1 = new Profile(address1);
        Profile p2 = new Profile(address2);
        Profile p3 = new Profile(address3);
        List<Profile> profiles = List.of(p1, p2, p3);
        Profiles p = new Profiles();
        List<Address> rsl = p.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "street", 10, 1));
        expected.add(new Address("Moscow", "street", 10, 2));
        expected.add(new Address("Moscow", "street1", 11, 3));
        assertThat(rsl, is(expected));
    }

}