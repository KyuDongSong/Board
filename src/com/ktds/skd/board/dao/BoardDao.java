package com.ktds.skd.board.dao;

import com.ktds.skd.board.vo.BoardVO;

import java.util.List;

/**
 * Created by Admin on 2017-02-17.
 * INSERT, UPDATE, DELETE -> Dao에서는 int를 반환
 */
public interface BoardDao {

    public int insertArticle(BoardVO boardVO);

    public List selectAllArticles();

    public BoardVO selectOneArticle(int boardId);

    public int deleteArticle(int boardId);

}
