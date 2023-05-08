package com.example.demo.entity.infoScrap;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInfoScrap is a Querydsl query type for InfoScrap
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInfoScrap extends EntityPathBase<InfoScrap> {

    private static final long serialVersionUID = -1112990809L;

    public static final QInfoScrap infoScrap = new QInfoScrap("infoScrap");

    public final com.example.demo.utils.QAuditing _super = new com.example.demo.utils.QAuditing(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath infoName = createString("infoName");

    public final NumberPath<Long> infoScrapNum = createNumber("infoScrapNum", Long.class);

    public final NumberPath<Long> jobInfoNum = createNumber("jobInfoNum", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> memberNum = createNumber("memberNum", Long.class);

    public final DateTimePath<java.time.LocalDateTime> scrapTime = createDateTime("scrapTime", java.time.LocalDateTime.class);

    public QInfoScrap(String variable) {
        super(InfoScrap.class, forVariable(variable));
    }

    public QInfoScrap(Path<? extends InfoScrap> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInfoScrap(PathMetadata metadata) {
        super(InfoScrap.class, metadata);
    }

}

