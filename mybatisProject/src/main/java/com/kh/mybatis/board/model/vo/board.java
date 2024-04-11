package com.kh.mybatis.board.model.vo;

import java.sql.Date;

public class board {
	
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String writer;
	private int count;
	private Date createDate;
	private String status;
	
	public board() {
		super();
	}

	public board(int boardNo, String boardTitle, String boardContent, String writer, int count, Date createDate,
			String status) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.writer = writer;
		this.count = count;
		this.createDate = createDate;
		this.status = status;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", writer=" + writer + ", count=" + count + ", createDate=" + createDate + ", status=" + status + "]";
	}
	
	
	
	
}
