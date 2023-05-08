package com.example.demo.entity.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -811077571L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final com.example.demo.utils.QAuditing _super = new com.example.demo.utils.QAuditing(this);

    public final com.example.demo.entity.cart.QCart cart;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath memberAddress = createString("memberAddress");

    public final DateTimePath<java.time.LocalDateTime> memberDate = createDateTime("memberDate", java.time.LocalDateTime.class);

    public final StringPath memberEmail = createString("memberEmail");

    public final EnumPath<Grade> memberGrade = createEnum("memberGrade", Grade.class);

    public final StringPath memberId = createString("memberId");

    public final StringPath memberName = createString("memberName");

    public final NumberPath<Long> memberNum = createNumber("memberNum", Long.class);

    public final StringPath memberPhone = createString("memberPhone");

    public final StringPath memberPwd = createString("memberPwd");

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cart = inits.isInitialized("cart") ? new com.example.demo.entity.cart.QCart(forProperty("cart"), inits.get("cart")) : null;
    }

}

