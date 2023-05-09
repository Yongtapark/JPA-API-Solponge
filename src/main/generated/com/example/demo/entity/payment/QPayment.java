package com.example.demo.entity.payment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPayment is a Querydsl query type for Payment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayment extends EntityPathBase<Payment> {

    private static final long serialVersionUID = 1233458669L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayment payment = new QPayment("payment");

    public final com.example.demo.utils.QAuditing _super = new com.example.demo.utils.QAuditing(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath deliveryInfo = createString("deliveryInfo");

    public final NumberPath<Long> deliveryNum = createNumber("deliveryNum", Long.class);

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final com.example.demo.entity.member.QMember member;

    public final StringPath paymentAddress = createString("paymentAddress");

    public final DateTimePath<java.time.LocalDateTime> paymentDate = createDateTime("paymentDate", java.time.LocalDateTime.class);

    public final StringPath paymentEmail = createString("paymentEmail");

    public final NumberPath<Long> paymentNum = createNumber("paymentNum", Long.class);

    public final NumberPath<Long> paymentOrderNum = createNumber("paymentOrderNum", Long.class);

    public final StringPath paymentPhone = createString("paymentPhone");

    public final NumberPath<Long> paymentStock = createNumber("paymentStock", Long.class);

    public final com.example.demo.entity.product.QProduct product;

    public final NumberPath<Integer> success = createNumber("success", Integer.class);

    public QPayment(String variable) {
        this(Payment.class, forVariable(variable), INITS);
    }

    public QPayment(Path<? extends Payment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPayment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPayment(PathMetadata metadata, PathInits inits) {
        this(Payment.class, metadata, inits);
    }

    public QPayment(Class<? extends Payment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.example.demo.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.product = inits.isInitialized("product") ? new com.example.demo.entity.product.QProduct(forProperty("product")) : null;
    }

}

