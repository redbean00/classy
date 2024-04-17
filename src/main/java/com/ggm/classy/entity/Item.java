package com.ggm.classy.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "item")
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Category category;

    @Column(name = "item_name", nullable = false, unique = true)
    private String itemName;

    @Column(name = "content")
    private String content;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "count", nullable = false)
    private Integer count;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

}
