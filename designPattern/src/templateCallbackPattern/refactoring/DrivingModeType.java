package templateCallbackPattern.refactoring;

public enum DrivingModeType {
    MANUAL("���� ���"),
    AUTOMATIC("�ڵ� ���"),
    CRUISECONTROL("ũ������Ʈ�� ���");

    private String modeName;

    DrivingModeType(String modeName) {
        this.modeName = modeName;
    }

    public String getModeName(){
        return modeName;
    }
}
