package com.evaluate.ai_evaluate.exception;

public class SuggestException extends RuntimeException {
	
	private static final long serialVersionUID = -6702578971661297103L;
	
    private int code;

    public SuggestException(ExceptionEnum eEnum) {
        super(eEnum.getMessage());
        this.code = eEnum.getCode();
    }

    public SuggestException(ExceptionEnum eEnum, Throwable e) {
        super(eEnum.getMessage(), e);
        this.code = eEnum.getCode();
    }

    public SuggestException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SuggestException(int code, String message, Throwable e) {
        super(message, e);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
