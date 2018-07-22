package snippet;

import java.util.ArrayList;
import java.util.List;

/**
 * API ͳһ����״̬��
 * Created by zhumaer on 17/5/24.
 */
public enum ResultCode {

    /* �ɹ�״̬�� */
    SUCCESS(1, "�ɹ�"),

    /* ��������10001-19999 */
    PARAM_IS_INVALID(10001, "������Ч"),
    PARAM_IS_BLANK(10002, "����Ϊ��"),
    PARAM_TYPE_BIND_ERROR(10003, "�������ʹ���"),
    PARAM_NOT_COMPLETE(10004, "����ȱʧ"),

    /* �û�����20001-29999*/
    USER_NOT_LOGGED_IN(20001, "�û�δ��¼"),
    USER_LOGIN_ERROR(20002, "�˺Ų����ڻ��������"),
    USER_ACCOUNT_FORBIDDEN(20003, "�˺��ѱ�����"),
    USER_NOT_EXIST(20004, "�û�������"),
    USER_HAS_EXISTED(20005, "�û��Ѵ���"),

    /* ҵ�����30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "ĳҵ���������"),

    /* ϵͳ����40001-49999 */
    SYSTEM_INNER_ERROR(40001, "ϵͳ��æ�����Ժ�����"),

    /* ���ݴ���50001-599999 */
    RESULE_DATA_NONE(50001, "����δ�ҵ�"),
    DATA_IS_WRONG(50002, "��������"),
    DATA_ALREADY_EXISTED(50003, "�����Ѵ���"),

    /* �ӿڴ���60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "�ڲ�ϵͳ�ӿڵ����쳣"),
    INTERFACE_OUTTER_INVOKE_ERROR(60002, "�ⲿϵͳ�ӿڵ����쳣"),
    INTERFACE_FORBID_VISIT(60003, "�ýӿڽ�ֹ����"),
    INTERFACE_ADDRESS_INVALID(60004, "�ӿڵ�ַ��Ч"),
    INTERFACE_REQUEST_TIMEOUT(60005, "�ӿ�����ʱ"),
    INTERFACE_EXCEED_LOAD(60006, "�ӿڸ��ع���"),

    /* Ȩ�޴���70001-79999 */
    PERMISSION_NO_ACCESS(70001, "�޷���Ȩ��");

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

    //У���ظ���codeֵ
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}