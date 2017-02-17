package com.ktds.skd.board.controller;

import com.ktds.skd.board.biz.BoardBiz;
import com.ktds.skd.board.biz.BoardBizImpl;
import com.ktds.skd.board.dao.BoardDao;
import com.ktds.skd.board.vo.BoardVO;
import sun.rmi.log.LogInputStream;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardController {

    private BoardBiz boardBiz;

    public BoardController() {
        boardBiz = new BoardBizImpl();
    }

    public void writeArticle() {
        BoardVO boardVO = new BoardVO();
        boardVO.setWriter("Song");
        boardVO.setSubject("주말과제..");
        boardVO.setContent("줄까요");

        if (boardBiz.writeArticle(boardVO)) {
            System.out.println("Success!!");
        } else {
            System.out.println("Fail!!!!");
        }

        boardBiz.writeArticle(boardVO);
    }

    public void deleteOneArticle(int boardId){
        if(boardBiz.deleteArticle(boardId)){
            System.out.println("Success!!");
        } else {
            System.out.println("Fail!!!");
        }
    }

    public void printAllArticles() {
        List<BoardVO> articles = boardBiz.getAllArticles();

        for (BoardVO article : articles) {
            System.out.printf("글 번호: %d\n", article.getBoardId());
            System.out.printf("글 제목: %s\n", article.getSubject());
            System.out.printf("글 작성자: %s\n", article.getWriter());
            System.out.printf("글 작성일: %s\n", article.getWriteDate());
            System.out.println("=======================================");
        }
    }

    public void printOneArticle(int boardId){
        BoardVO boardVO = boardBiz.getOneArticle(boardId);

        System.out.printf("글 번호: %d\n", boardVO.getBoardId());
        System.out.printf("글 제목: %s\n", boardVO.getSubject());
        System.out.printf("내용: %s\n", boardVO.getContent());
        System.out.printf("글 작성자: %s\n", boardVO.getWriter());
        System.out.printf("글 작성일: %s\n", boardVO.getWriteDate());
        System.out.println("=======================================");
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        int choose = 0;
        while (true){
            System.out.println("=======================================");
            System.out.println("    ktds Uniersity articles ");
            System.out.println("=======================================");
            System.out.println("select...");
            System.out.println("\t 1. Write ");
            System.out.println("\t 2. List ");
            System.out.println("\t 3. Find One ");
            System.out.println("\t 4. Delete One ");
            System.out.print("choice: ");

            choose = input.nextInt();
            int boardId = 0;
            if (choose == 1) {
                writeArticle();
            } else if (choose == 2){
                printAllArticles();
            } else if (choose == 3){
                System.out.print("Input Find Article Number: ");
                boardId = input.nextInt();
                printOneArticle(boardId);
            } else if(choose == 4){
                System.out.print("Input Delete Article Number: ");
                boardId = input.nextInt();
                deleteOneArticle(boardId);

            } else {
                System.out.println("Wrong Input!!");
            }
        }
    }

    public static void main(String[] args) {

        new BoardController().start();
    }
}
