package com.springStudy.eventSys.domain.service;

import com.springStudy.eventSys.common.exception.BusinessException;
import com.springStudy.eventSys.domain.entity.User;

/**
 * ユーザ情報を更新するサービスインタフェース
 */
public interface UserUpdateService {
	
	/**
	 * ユーザ情報が適正か確認する抽象メソッド
	 * @param user
	 * @throws BusinessException 
	 */
	public void confirmUser(User user) throws BusinessException;
	
	/**
	 * ユーザ情報を更新する抽象メソッド
	 * @param user
	 * @throws BusinessException 
	 */
	public void updateUser(User user) throws BusinessException;
	
	/**
	 * パスワードを更新する抽象メソッド
	 * @param password
	 * @throws BusinessException
	 */
	public void updatePassword(User user) throws BusinessException;
	
	/**
	 * 新規登録を行う抽象メソッド
	 * @param user
	 * @throws BusinessException
	 */
	public void insertUser(User user) throws BusinessException;
	
}
