package com.imooc.springbootjpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoodsDao extends CrudRepository<GoodsDo , Long> {

}
