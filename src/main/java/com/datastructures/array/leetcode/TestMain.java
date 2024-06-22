package com.datastructures.array.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMain {

    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal("1E+5");
        System.out.println(bigDecimal.toPlainString());
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode actualObj = mapper.readTree("GAVA");
            System.out.println(actualObj.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
