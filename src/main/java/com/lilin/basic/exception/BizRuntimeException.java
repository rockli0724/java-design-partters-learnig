package com.lilin.basic.exception;

/**
 * @author lilin
 * @Title: BizException
 * @date 2019/10/25下午2:54
 */
public class BizRuntimeException extends RuntimeException implements CodeMsgException {

    private Integer code;


    public BizRuntimeException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public BizRuntimeException(CodeMsg codeMsg) {
        super(codeMsg.getMsg());
        this.code = codeMsg.getCode();
    }

    public BizRuntimeException(CodeMsg codeMsg, Object... args) {
        super(String.format(codeMsg.getMsg(), args));
        this.code = codeMsg.getCode();
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
