package com.ktds.skd.board.biz;

import com.ktds.skd.board.dao.BoardDao;
import com.ktds.skd.board.vo.BoardVO;

import java.util.List;

/**
 * Created by Admin on 2017-02-17.
 * INSERT , UPDATE, DELETE => Biz에서는 boolean 반환
 */
public interface BoardBiz {

    public boolean writeArticle(BoardVO boardVO);

    public boolean deleteArticle(int boardId);

    public List<BoardVO> getAllArticles();

    public BoardVO getOneArticle(int boardId);

}
