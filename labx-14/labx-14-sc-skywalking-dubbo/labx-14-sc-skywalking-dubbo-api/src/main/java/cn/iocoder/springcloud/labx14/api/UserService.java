package cn.iocoder.springcloud.labx14.api;

/**
 * 用户服务 RPC Service 接口
 */
public interface UserService {

    /**
     * 根据指定用户编号，获得用户信息
     *
     * @param id 用户编号
     * @return 用户信息
     */
    String get(Integer id);

}
