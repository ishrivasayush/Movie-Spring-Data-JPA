package com.SpringDataJPA.SpringDataJPA.Dto;

import java.net.http.HttpResponse;

public class ResponseDto<T> {
    T data;
    HttpResponse httpResponse;

}
