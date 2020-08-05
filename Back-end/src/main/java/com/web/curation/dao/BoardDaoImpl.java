package com.web.curation.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.curation.dto.BoardPK;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	SqlSession session;

	String ns = "com.web.curation.dao.BoardDao.";

	@Override
	public int goodClick(BoardPK boardPK) {
		return session.update(ns + "goodClick", boardPK);
	}

	@Override
	public int goodClickCancel(BoardPK boardPK) {
		return session.delete(ns + "goodClickCancel", boardPK);
	}

	@Override
	public int goodCount(BoardPK boardPK) {
		return session.selectOne(ns + "goodCount", boardPK);
	}

}
