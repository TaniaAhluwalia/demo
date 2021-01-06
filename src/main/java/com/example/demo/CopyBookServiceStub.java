package com.example.demo;

import org.apache.tools.ant.taskdefs.Copy;
import org.springframework.stereotype.Component;

@Component
public class CopyBookServiceStub implements CopyBookService {
    @Override
    public Copy fetchById(int id) {
        Copy copy= new Copy();
       copy.setDescription("The Borgia Bride");

        return copy;
    }
}
