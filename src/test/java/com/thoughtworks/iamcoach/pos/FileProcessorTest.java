package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileProcessorTest {
    @Test
    public void should_get_a_list(){
        FileProcessor fileProcessor = mock(FileProcessor.class);
        when(fileProcessor.readFile("items.txt")).thenReturn(null);
        assertThat(fileProcessor.readFile("items.txt")).isEqualTo(null);
    }
}
