package youtube.chap03_TemplateMethod.kevinsVilliage.refactoring;

public enum DrivingModeType {
    MANUAL("���� ���"),
    AUTOMATIC("�ڵ� ���"),
    CRUISECONTROL("ũ������Ʈ�� ���");

    private String modeName;

    DrivingModeType(String modeName) {
    	System.out.println("constructor: "+this);
        this.modeName = modeName;
    }

    public String getModeName(){
        return modeName;
    }
}
