package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUITest {

    @Test
    public void createItem() {
        String[] answers = {"Fix PC"};
        Tracker tracker = new Tracker();
        Input input = new StubInput(answers);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        expected.setId(created.getId());
        assertThat(created, is(expected));
    }
}