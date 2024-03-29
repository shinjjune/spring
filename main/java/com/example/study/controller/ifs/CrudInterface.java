package com.example.study.controller.ifs;

import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Header<Req> requset);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}
