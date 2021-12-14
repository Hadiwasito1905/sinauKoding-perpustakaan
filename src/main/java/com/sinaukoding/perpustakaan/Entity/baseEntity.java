package com.sinaukoding.perpustakaan.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@DynamicUpdate
@SuppressWarnings('unchecked')



public abstract class baseEntity<I> implements Serializable {


}
