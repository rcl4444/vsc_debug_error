package com.sample.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseEntity<T> implements IdInterface<T> {
    /**
     * 主键
    */
    @TableId
    T id;

    /**
     * 创建时间
    */
    @TableField(fill = FieldFill.INSERT)
    String createTime;

    public T getId() {
        return this.id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass().equals(obj.getClass())) {
            @SuppressWarnings(value = { "unchecked" })
            com.sample.entity.BaseEntity<T> entity = (com.sample.entity.BaseEntity<T>) obj;
            if (this.getId().equals(entity.getId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() { 
        return this.getId().hashCode();
    } 
}
