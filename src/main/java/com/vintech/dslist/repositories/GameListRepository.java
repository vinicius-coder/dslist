package com.vintech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vintech.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
