package com.ktds.skd.board.vo;

import com.ktds.skd.com.ktds.skd.dao.support.annotation.Types;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardVO {

    @Types
    private int boardId;

    @Types
    private String subject;
    @Types
    private String content;
    @Types
    private String writer;
    @Types
    private String likeCount;
    @Types
    private String writeDate;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }
}
