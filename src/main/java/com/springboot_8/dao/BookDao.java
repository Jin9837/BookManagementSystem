package com.springboot_8.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot_8.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book>{
    /**
     * 查询一个
     * 这是 Mybatis 开发
     * @param id
     * @return
     */
//    @Select("select * from tbl_book where id = #{id}")
//    Book getById(Integer id);
}
