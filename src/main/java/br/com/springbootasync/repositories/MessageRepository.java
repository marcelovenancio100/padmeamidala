package br.com.springbootasync.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository {

	public void printMessage();
}