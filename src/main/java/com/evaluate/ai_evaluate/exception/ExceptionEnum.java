package com.evaluate.ai_evaluate.exception;
public enum ExceptionEnum {
	
	PARAM_ERROR            (101, "缺失参数或异常"),
	MISSING_ID             (102, "ID缺失"),
	MISSING_OBJECT         (103, "没有对应建议单"),
	DELETE_OBJECT          (104, "目标已删除"),
	STATUS_ERROR           (105, "操作状态不对"),
	MISSING_LEADER         (106, "没有选择送审领导"),
	SUGGEST_CREATE_FAILED  (111, "建议单创建失败"),
	SUGGEST_SAVE_FAILED    (112, "建议单保存失败"),
	EXPERT_CREATE_FAILED   (121, "建议单专家创建失败"),
	EXPERT_SAVE_FAILED     (122, "建议单专家保存失败"),
	STAGE_SAVE_FAILED      (123, "建议单流程保存失败"),
	END_EXCEPTION          (199, "最终异常");
	
	private int code;
	private String message;

	ExceptionEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
