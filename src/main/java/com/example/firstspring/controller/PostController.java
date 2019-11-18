package com.example.firstspring.controller;

import com.example.firstspring.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam PostMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }
}
