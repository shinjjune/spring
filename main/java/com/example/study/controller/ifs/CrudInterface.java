package com.example.study.controller.ifs;

import com.example.study.model.network.Header;

public interface CrudInterface {

    Header create();

    Header read(Long id);

    Header update();

    Header delete(Long id);
}
