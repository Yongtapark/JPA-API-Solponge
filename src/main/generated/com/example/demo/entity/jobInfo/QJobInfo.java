package com.example.demo.entity.jobInfo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QJobInfo is a Querydsl query type for JobInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJobInfo extends EntityPathBase<JobInfo> {

    private static final long serialVersionUID = -1823246089L;

    public static final QJobInfo jobInfo = new QJobInfo("jobInfo");

    public final com.example.demo.utils.QAuditing _super = new com.example.demo.utils.QAuditing(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath jobInfoCompanyName = createString("jobInfoCompanyName");

    public final StringPath jobInfoDeadline = createString("jobInfoDeadline");

    public final StringPath jobInfoField = createString("jobInfoField");

    public final StringPath jobInfoFieldTagList = createString("jobInfoFieldTagList");

    public final StringPath jobInfoLink = createString("jobInfoLink");

    public final NumberPath<Long> jobInfoNum = createNumber("jobInfoNum", Long.class);

    public final StringPath jobInfoPageCode = createString("jobInfoPageCode");

    public final StringPath jobInfoPostingName = createString("jobInfoPostingName");

    public final StringPath jobInfoQualification = createString("jobInfoQualification");

    public final StringPath jobInfoWorkArea = createString("jobInfoWorkArea");

    public final StringPath jobInfoWorkType = createString("jobInfoWorkType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public QJobInfo(String variable) {
        super(JobInfo.class, forVariable(variable));
    }

    public QJobInfo(Path<? extends JobInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJobInfo(PathMetadata metadata) {
        super(JobInfo.class, metadata);
    }

}

