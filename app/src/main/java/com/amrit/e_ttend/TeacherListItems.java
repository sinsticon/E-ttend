package com.amrit.e_ttend;

/**
 * Created by Amrit on 3/9/2017.
 */

public class TeacherListItems {
    private String head;
    private String desc1;
    private String desc2;

    public TeacherListItems(String head, String desc1, String desc2) {
        this.setHead(head);
        this.setDesc1(desc1);
        this.setDesc2(desc2);

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

}

