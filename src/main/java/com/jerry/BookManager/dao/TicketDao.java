package com.jerry.BookManager.dao;

import com.jerry.BookManager.model.Ticket;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TicketDao {
    String tableName = "ticket";
    String insertField = "user_id, ticket, expired_at";
    String selectField = "id, " + insertField;

    /**
     * 插入用户
     */
    @Insert({"insert into", tableName,"(",insertField,")", "values(#{userId}, #{ticket}, #{expiredAt})"} )
    int insertTicket(Ticket ticket);

    /**
     * 根据id删除用户
     */
    @Delete({"delete from", tableName, "where id = #{id}"})
    int deleteTicketById(int id);

    /**
     * 查询用户
     */
    @Select({"select", selectField, "from ticket where id = #{id}"})
    Ticket selectTicketById(int id);

    @Select({"select * from", tableName})
    List<Ticket> selectAllTicket();
    /**
     * 修改用户
     */
    @Update({"UPDATE", tableName, "SET user_id = #{userId}, ticket = #{ticket}, expired_at = #{expiredAt} WHERE id = #{id}"})
    boolean updateBook(Ticket ticket);
}
