package com.mime.combiner.controller;

import com.mime.combiner.DataCombiner;
import com.mime.combiner.exception.WrongDataTypeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CombinerRestController {

    private final DataCombiner dataCombiner;

    public CombinerRestController(DataCombiner dataCombiner) {
        this.dataCombiner = dataCombiner;
    }

    @GetMapping("/combine")
    public String combine() throws WrongDataTypeException {
        return dataCombiner.combine().toString();
    }

    @ExceptionHandler(WrongDataTypeException.class)
    public ResponseEntity<String> handleWrongDataType() {
        return new ResponseEntity<>("Wrong data type for this kind of operation!", HttpStatus.BAD_REQUEST);
    }

}
