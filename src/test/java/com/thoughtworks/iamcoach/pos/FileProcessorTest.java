package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileProcessorTest {
    @Test
    public void should_get_a_list(){
        FileProcessor fileProcessor = mock(FileProcessor.class);
        List<String> data = new ArrayList<String>();
        data.add(0,"aaa");
        data.add(1,"eee");
        when(fileProcessor.readFile("items.txt")).thenReturn(data);
        assertThat(fileProcessor.readFile("items.txt")).isEqualTo(data);
    }
}
