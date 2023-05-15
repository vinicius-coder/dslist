package com.vintech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vintech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
