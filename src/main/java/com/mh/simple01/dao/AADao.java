package com.mh.simple01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.activation.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mh.simple01.dto.AADto;

@Repository
public class AADao {
	
	@Autowired
	BasicDataSource dataSource;
	
	@Autowired
	SqlSession sqlSession;
	
	public void update(AADto dto) {
		sqlSession.update("aa.updateaa");
		System.out.println("���� ��");
	}

	public List<AADto> select() {		
		System.out.println("select!!!");		
		List<AADto> list = sqlSession.selectList("aa.getaa");
//		for(AADto aaDto : list) {
//			System.out.println("aaDto = " + aaDto.toString());
//		}
		return list;
	}

	public void insert(AADto dto) {		
		System.out.println("insert!!!!!");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		 try {
			conn = dataSource.getConnection(); // dataSource �ڷ����� Ŀ�ؼ� �����´�.
			pstmt = conn.prepareStatement("insert into aa " + "(bb) " + "values " + "('thisss')");
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			try {
				if(pstmt != null) pstmt.close();
				conn.close(); // ���ᰴü�� ���� ���� �ƴϴ�. �ٽ� dataSource �ڷ����� Ŀ�ؼ� ��ȯ�Ѵ�.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
