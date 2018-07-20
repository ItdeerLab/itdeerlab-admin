package cn.itdeer.common.base;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Description : 基础的数据仓库接口,继承分页类
 * PackageName : cn.itdeer.common.base
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 18-7-20/下午6:27
 */
public interface BaseRepository<T> extends PagingAndSortingRepository<T,String> {

}
