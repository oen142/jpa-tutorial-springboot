package com.example.tutorial.domain.item

import com.example.tutorial.domain.Category
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
abstract class Item(

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    var id: Long,
    val name: String,
    var price: Int,
    var stockQuantity: Int,

    @ManyToMany(mappedBy = "items")
    val categories: MutableList<Category> = mutableListOf()
) {


}