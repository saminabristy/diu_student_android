package com.student.diu.model;

public class TopNotice {

    private String noticeTittle;
    private int noticeDate;
    private int noticeImage;

    public TopNotice(String noticeTittle, int noticeDate,int noticeImage) {
        this.noticeTittle = noticeTittle;
        this.noticeDate = noticeDate;
        this.noticeImage = noticeImage;

    }

    public String getNoticeTittle() {
        return noticeTittle;
    }

    public void setNoticeTittle(String noticeTittle) {
        this.noticeTittle = noticeTittle;
    }

    public int getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(int noticeDate) {
        this.noticeDate = noticeDate;
    }

    public int getNoticeImage() {
        return noticeImage;
    }

    public void setNoticeImage(int noticeImage) {
        this.noticeImage = noticeImage;
    }
}
