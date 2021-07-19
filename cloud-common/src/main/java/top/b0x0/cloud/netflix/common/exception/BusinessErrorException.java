package top.b0x0.cloud.netflix.common.exception;

/**
 * 自定义业务异常
 *
 * @author ManJiis
 */
public class BusinessErrorException extends RuntimeException {
    private static final long serialVersionUID = -7480022450501760611L;

    /**
     * 异常码
     */
    private Integer code;

    /**
     * 异常提示信息
     */
    private String message;

    public BusinessErrorException(String msg) {
        this.code = 500;
        this.message = msg;
    }

    public BusinessErrorException(BusinessMsgEnum businessMsgEnum) {
        this.code = businessMsgEnum.getCode();
        this.message = businessMsgEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
