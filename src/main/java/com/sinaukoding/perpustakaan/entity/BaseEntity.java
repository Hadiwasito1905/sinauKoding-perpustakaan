package com.sinaukoding.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@DynamicUpdate
@SuppressWarnings("unchecked")



public abstract class BaseEntity<I> implements Serializable {

    private static final long serialVersionUID = -1477876135846170795L;
}
