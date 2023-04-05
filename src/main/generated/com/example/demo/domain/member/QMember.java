package com.example.demo.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1118978910L;

    public static final QMember member = new QMember("member1");

    public final StringPath memberAddress = createString("memberAddress");

    public final DateTimePath<java.time.LocalDateTime> memberDate = createDateTime("memberDate", java.time.LocalDateTime.class);

    public final StringPath memberEmail = createString("memberEmail");

    public final EnumPath<Grade> memberGrade = createEnum("memberGrade", Grade.class);

    public final StringPath memberId = createString("memberId");

    public final StringPath memberName = createString("memberName");

    public final NumberPath<Long> memberNo = createNumber("memberNo", Long.class);

    public final StringPath memberPhone = createString("memberPhone");

    public final StringPath memberPwd = createString("memberPwd");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}
