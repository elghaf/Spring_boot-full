package springboot3common;

import java.io.Serializable;

public class Result<T> implements Serializable{
    private static final long SerialVersionID = 1L;
    private int resultCode;
    private String message;
    private T data;

    public Result(){

    }
    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        
    }
}