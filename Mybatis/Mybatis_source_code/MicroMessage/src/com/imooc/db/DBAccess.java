package com.imooc.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * �������ݿ���
 * @author ���ĺ�
 */
public class DBAccess {

   public SqlSession getSqlSession() throws IOException{
	   // 1.ͨ�������ļ���ȡ���ݿ�������Ϣ
	   Reader reader =  Resources.getResourceAsReader("com/imooc/conf/Configuration.xml");
	   
	   // 2.ͨ��������Ϣ����һ��SqlSessionFactory
	   SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	   
	   // 3.ͨ��sqlSessionFactory ��һ�����ݿ�Ự
	   SqlSession sqlSession = sqlSessionFactory.openSession();
	   
	   return sqlSession;
   }
}
