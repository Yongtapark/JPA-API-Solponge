package com.example.demo.entity.product;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -1636347201L;

    public static final QProduct product = new QProduct("product");

    public final com.example.demo.utils.QAuditing _super = new com.example.demo.utils.QAuditing(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath productCode = createString("productCode");

    public final DatePath<java.sql.Date> productDate = createDate("productDate", java.sql.Date.class);

    public final StringPath productImg = createString("productImg");

    public final NumberPath<Long> productNum = createNumber("productNum", Long.class);

    public final StringPath productPage = createString("productPage");

    public final NumberPath<Integer> productPrice = createNumber("productPrice", Integer.class);

    public final NumberPath<Integer> productSale = createNumber("productSale", Integer.class);

    public final NumberPath<Integer> productStock = createNumber("productStock", Integer.class);

    public final StringPath productSubtitle = createString("productSubtitle");

    public final StringPath productTitle = createString("productTitle");

    public final NumberPath<Integer> productVisit = createNumber("productVisit", Integer.class);

    public final StringPath productWriter = createString("productWriter");

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

