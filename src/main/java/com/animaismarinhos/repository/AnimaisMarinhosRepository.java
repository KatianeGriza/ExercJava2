package com.animaismarinhos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.animaismarinhos.entidades.AnimaisMarinhos;

@Repository
public interface AnimaisMarinhosRepository extends CrudRepository<AnimaisMarinhos, Integer> {

}
