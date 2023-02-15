package org.student;

public class Programme {
    private String name;
    private String code;
    private String department;
    private String type;

    public Programme() {
    }
    public Programme(String name, String code, String department, String type) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Programme [code=" + code + ", department=" + department + ", name=" + name + "]";
    }
}
