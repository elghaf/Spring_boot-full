package rest.api.result;

public class ResultGenerator{
    private static class final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS":

    public static Result genSuccessResult(){
        return new Result()
            .setCode(ResultCode.SUCCESS)
            .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }
    
    public static Result genSuccessResult(Object data){
        return new Result()
        .setCode(ResultCode.SUCCESS)
        .setMessage(DEFAULT_SUCCESS_MESSAGE)
        .setData(data);
    }
}
